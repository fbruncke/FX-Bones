package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class OverViewController {
    @FXML
    public void initialize() {

    }



    public void changeView(ActionEvent actionEvent)
    {
        //Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Main.changeScene(ControllerNames.MainDish);

    }
}
