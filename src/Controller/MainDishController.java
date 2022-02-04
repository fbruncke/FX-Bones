package Controller;

import javafx.event.ActionEvent;

public class MainDishController {

    public void changeViewBack(ActionEvent actionEvent)
    {
        //Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Main.changeScene(ControllerNames.OverView);

    }

    public void changeView(ActionEvent actionEvent)
    {
        //Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        //Main.changeScene(ControllerNames.MainDish);

    }
}
