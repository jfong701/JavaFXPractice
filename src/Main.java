import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    private Stage window;
    private Scene scene1, scene2;

    public static void main(String[] args) {
        System.out.println("test");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("This is the first scene");
        Button button1 = new Button("Switch to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));


        // LAYOUT 1 - VERTICAL COLUMN OF LABEL AND BUTTONS
        // In the first scene, layout things vertically.
        VBox layout1 = new VBox(20);

        // add items to the layout
        // use .addAll() to add multiple items.
        layout1.getChildren().addAll(label1, button1);

        //create the scene
        scene1 = new Scene(layout1, 200, 200);

        // add the action of the button.
        Button button2 = new Button("Go back to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        // set up the second scene (LAYOUT 2)
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("This is the window");
        window.show();
    }
}
