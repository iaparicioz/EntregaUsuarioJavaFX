package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    sample.Users user = new sample.Users();

    String nombre = "";

    @FXML
    private TextField idUsuario;
    @FXML
    private PasswordField idContraseña;
    @FXML
    private Button idBoton;
    @FXML
    private Label idMostrarContraseña;

    @FXML
    public void clickedBoton(MouseEvent event){
        idBoton.setText("Boton Pulsado");
    }

    @FXML
    public void mostrarContraseña (MouseEvent event) {
        idMostrarContraseña.setText(idContraseña.getText());
    }

}
