import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main2 extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // create title
        primaryStage.setTitle("Title of the window");

        // create a button
        button = new Button();
        button.setText("Go to grid pane");
        button.setOnAction(e -> GridPaneWithManyItems.openScene(primaryStage));

        // this -- means that the code to handle this button is in this class.
        // (The handle method is in this class)

        // creating a simple layout (stackpane)

        StackPane simpleLayout = new StackPane();
        simpleLayout.getChildren().add(button);

        Scene scene = new Scene(simpleLayout, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
