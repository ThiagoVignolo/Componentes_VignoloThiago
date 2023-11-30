package es.ieslosmontecillos.componentes_vignolothiago;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class CampoTextoBoton extends HBox
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

    @javafx.fxml.FXML
    private TextField textField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    public String getText() {
        return textProperty().get();
    }

    public void setText(String value) {
        textProperty().set(value);
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

}