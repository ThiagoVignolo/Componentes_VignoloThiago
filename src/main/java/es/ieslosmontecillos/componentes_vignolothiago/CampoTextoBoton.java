package es.ieslosmontecillos.componentes_vignolothiago;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CampoTextoBoton extends HBox implements Initializable
{
    public CampoTextoBoton() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CampoTextoBoton.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    @FXML
    private TextField textField;


    public String getTextField() {
        return textField.textProperty().get();
    }

    public void setTextField(String value) {
        textField.textProperty().set(value);
    }

    public StringProperty textProperty() {
        return textField.textProperty();
    }



    private ObjectProperty<EventHandler<ActionEvent>> OnAction =
            new SimpleObjectProperty<EventHandler<ActionEvent>>();

    public final ObjectProperty<EventHandler<ActionEvent>> onActionProperty() {
        return OnAction;
    }

    public final void setOnAction(EventHandler<ActionEvent> handler) {
        OnAction.set(handler);
    }

    public final EventHandler<ActionEvent> getOnAction() {
        return OnAction.get();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}