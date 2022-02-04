package Controller;

import Controller.ControllerNames;
import Controller.SceneCtrlNamePair;
import com.sun.javafx.css.StyleManager;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.util.ArrayList;

public class Main extends Application {
    private static ArrayList<SceneCtrlNamePair> scenes = new ArrayList<>();
    private static Stage primaryStageHolder = null;
    @Override
    public void start(Stage primaryStage) throws Exception {

        //StyleManager.getInstance().addUserAgentStylesheet("../View/Style.css");
        Application.setUserAgentStylesheet(getClass().getResource("../View/Style.css").toExternalForm());

        primaryStageHolder = primaryStage;

        FXMLLoader overViewPaneLoader = new FXMLLoader(getClass().getResource("../View/OverView.fxml"));
        Parent overViewPane = overViewPaneLoader.load();
        Scene overViewScene = new Scene(overViewPane, 600, 600);

        FXMLLoader mainDishPaneLoader = new FXMLLoader(getClass().getResource("../View/MainDish.fxml"));
        Parent mainDishPane = mainDishPaneLoader.load();
        Scene mainDishScene = new Scene(mainDishPane, 600, 600);

        FXMLLoader sideOrderPaneLoader = new FXMLLoader(getClass().getResource("../View/SideOrder.fxml"));
        Parent sideOrderPane = sideOrderPaneLoader.load();
        Scene sideOrderScene = new Scene(sideOrderPane, 600, 600);

        FXMLLoader dessertPaneLoader = new FXMLLoader(getClass().getResource("../View/Dessert.fxml"));
        Parent dessertPane = dessertPaneLoader.load();
        Scene dessertScene = new Scene(dessertPane, 600, 600);

        scenes.add(new SceneCtrlNamePair( overViewScene, ControllerNames.OverView));
        scenes.add(new SceneCtrlNamePair( mainDishScene, ControllerNames.MainDish));
        scenes.add(new SceneCtrlNamePair( sideOrderScene, ControllerNames.SideOrder));
        scenes.add(new SceneCtrlNamePair( dessertScene, ControllerNames.Dessert));

        primaryStage.setTitle("Main");
        primaryStage.setScene(overViewScene);
        primaryStage.show();

    }

    /**
     * changeScene
     * @param sceneName
     */
    public static void changeScene(ControllerNames sceneName) {
        primaryStageHolder.setTitle(sceneName.toString());

        for (SceneCtrlNamePair sceneCtrlNamePair : scenes) {
            if (sceneCtrlNamePair.getName().equals(sceneName)) {
                primaryStageHolder.setScene(sceneCtrlNamePair.getScene());
            }
        }
    }
}
