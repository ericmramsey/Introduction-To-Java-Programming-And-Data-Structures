/*
    Server Class that will compute the loan, payment, and total payment amounts and
    will also receive information from client. This class will be able to communicate
    with multiple clients.

    @author: Eric Ramsey
    @version: 12/07/21
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class PExercise31_01Server extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // TextArea that is used for displaying server contents
        TextArea textArea = new TextArea();

        // Initialize Scene and move it to the stage
        Scene scene = new Scene(new ScrollPane(textArea), 600, 400);
        stage.setTitle("Exercise31_01Server"); // Sets the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Displays the stage

        new Thread(() -> {

            try {
                // Initialize a ServerSocket
                ServerSocket serverSocket = new ServerSocket(8000);
                Platform.runLater(() -> textArea.appendText("Exercise31_01Server started at" + new Date() + '\n'));

                // Listen for a connection request
                Socket socket = serverSocket.accept();

                // Initialize data input and output streams
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream()); // input from client
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream()); // output to client

                while (true) {

                    // Used to determine when client connected to server
                    Date dateClientConnectedToServer = new Date();

                    // Variables used to read the input for user loan amounts
                    Double annualInterestRate = dataInputStream.readDouble();
                    int numberOfYears = dataInputStream.readInt();
                    Double loanAmount = dataInputStream.readDouble();

                    // Variables used to calculate monthlyInterestRate, monthlyPayment, and totalPayment
                    double monthlyInterestRate = annualInterestRate / 1200;
                    double monthlyPayment = (loanAmount * monthlyInterestRate) /
                            (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
                    double totalPayment = monthlyPayment *numberOfYears * 12;

                    // Sends monthly payment and total payment to the client
                    dataOutputStream.writeDouble(monthlyPayment);
                    dataOutputStream.writeDouble(totalPayment);

                    Platform.runLater(() -> {

                        textArea.appendText("Connected to a client at " + dateClientConnectedToServer + '\n');
                        textArea.appendText("Annual Interest Rate: " + annualInterestRate + '\n');
                        textArea.appendText("Loan Amount: " + loanAmount + '\n');
                        textArea.appendText("Monthly Payment: " + monthlyPayment + '\n');
                        textArea.appendText("Total Payment: " + totalPayment + '\n');

                    });
                }

            } catch (IOException exception) {

                exception.printStackTrace();

            }
        }).start();
    }
}
