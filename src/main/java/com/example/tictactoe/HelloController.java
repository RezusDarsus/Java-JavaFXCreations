package com.example.tictactoe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private char sym = 'x';
    private char[][] gameField = new char[3][3];
    private boolean isGame = true;

    @FXML
    void ButtonClick(ActionEvent event) {
        Button btn = (Button) event.getSource();

        int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
        int columnIndex = GridPane.getColumnIndex(btn) == null ? 0 : GridPane.getColumnIndex(btn);

        if (!btn.getText().isEmpty() || !isGame) return;

        btn.setText(String.valueOf(sym));
        gameField[rowIndex][columnIndex] = sym;

        if (checkWinner(rowIndex, columnIndex)) {
            isGame = false;
            showAlert("Game Over", "Player '" + sym + "' wins!");
            return;
        }

        if (isDraw()) {
            isGame = false;
            showAlert("Game Over", "It's a draw!");
            return;
        }

        sym = (sym == 'x') ? 'o' : 'x';
    }

    private boolean checkWinner(int row, int col) {
        if (gameField[row][0] == sym && gameField[row][1] == sym && gameField[row][2] == sym) {
            return true;
        }
        if (gameField[0][col] == sym && gameField[1][col] == sym && gameField[2][col] == sym) {
            return true;
        }
        if (gameField[0][0] == sym && gameField[1][1] == sym && gameField[2][2] == sym) {
            return true;
        }
        if (gameField[0][2] == sym && gameField[1][1] == sym && gameField[2][0] == sym) {
            return true;
        }

        return false;
    }

    private boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameField[i][j] == '\0') {
                    return false;
                }
            }
        }
        return true;
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    @FXML
    void initialize() {

    }

}