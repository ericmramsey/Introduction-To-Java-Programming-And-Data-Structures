/*
    Client class used to create fields and stage for loan information and for user
    to enter loan information. The loan information will be sent to the server using
    Data Input and Output streams created in this class.

    @author: Eric Ramsey
    @version: 12/07/21
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class PExercise31_01Client extends Application {

    // Data Input Output Streams
    DataOutputStream dataOutputStream = null; // Data stream to the server
    DataInputStream dataInputStream = null; // Data stream from the server

    // Create the TextField objects to display loan information
    private TextField annualInterestRateTextField = new TextField();
    private TextField loanAmountTextField = new TextField();
    private TextField numberOfYearsTextField = new TextField();

    // Button used to submit the user loan information to the server
    private Button submitButton = new Button("Submit");

    @Override
    public void start(Stage stage) throws Exception {

        // Initialize BorderPane
        BorderPane borderPane = new BorderPane();

        // Align the text fields for the loan information to the right of the pane
        annualInterestRateTextField.setAlignment(Pos.BASELINE_RIGHT);
        loanAmountTextField.setAlignment(Pos.BASELINE_RIGHT);
        numberOfYearsTextField.setAlignment(Pos.BASELINE_RIGHT);

        // GridPane used to display loan information
        GridPane loanInformationGridPane = new GridPane();
        loanInformationGridPane.add(new Label("Annual Interest Rate"), 0, 0);
        loanInformationGridPane.add(annualInterestRateTextField, 1, 0);
        loanInformationGridPane.add(new Label("Number of Years"), 0, 1);
        loanInformationGridPane.add(numberOfYearsTextField, 1, 1);
        loanInformationGridPane.add(new Label("Loan Amount"), 0, 2);
        loanInformationGridPane.add(loanAmountTextField, 1, 2);
        loanInformationGridPane.add(submitButton, 2, 1);

        // TextArea used to display the loanInformationGridPane
        TextArea textArea = new TextArea();
        borderPane.setTop(loanInformationGridPane);
        borderPane.setCenter(new ScrollPane(textArea));

        // Scene initialized
        Scene scene = new Scene(borderPane, 600, 400); // Scene dimensions
        stage.setTitle("Exercise31_01Client"); // Sets the title of the stage
        stage.setScene(scene); // Moves the scene to the stage
        stage.show(); // Displays the stage

        // Initialize submitButton functionality
        submitButton.setOnAction(e -> {

            try {

                // Variables used to retrieve the annualInterestRate, numberOfYears, and loanAmount information entered
                double annualInterestRate = Double.parseDouble(annualInterestRateTextField.getText().trim());
                int numberOfYears = Integer.parseInt(numberOfYearsTextField.getText().trim());
                double loanAmount = Double.parseDouble(loanAmountTextField.getText().trim());

                // Sends the loan information entered by user to the server
                dataOutputStream.writeDouble(annualInterestRate);
                dataOutputStream.writeInt(numberOfYears);
                dataOutputStream.writeDouble(loanAmount);
                dataOutputStream.flush(); // flushes the output stream and forces any buffered output to be written

            } catch (IOException exception) {

                System.err.println(exception);

            }

        });

        // Initialize Socket and Data Input and Output streams
        try {
            // Initialize socket that creates connection to server
            Socket socket = new Socket("localhost", 8000);

            // Initialize an input stream to receive data from the server
            dataInputStream = new DataInputStream(socket.getInputStream());

            // Initialize an output stream to send data to the server
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

        } catch (IOException exception) {

            textArea.appendText(exception.toString() + '\n');

        }
    }
}