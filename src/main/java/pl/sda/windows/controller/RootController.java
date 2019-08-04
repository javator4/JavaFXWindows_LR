package pl.sda.windows.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.Getter;
import pl.sda.windows.App;

@Getter
public class RootController {

    private App app;

    @FXML
    private Button button1;
    @FXML
    private Button button2;

    public void setAppParent(App app){
        this.app = app;
    }

    public void buttonHandler(ActionEvent actionEvent){
        Button source = (Button) actionEvent.getSource();
        if (source.getId().equals(button1.getId())){
            app.loadViewOne();
        }
        if (source.getId().equals(button2.getId())){
            app.loadViewTwo();
        }
    }
}
