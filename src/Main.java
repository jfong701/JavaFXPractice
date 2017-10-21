import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    Button button;

    public static void main(String[] args) {
        System.out.println("test");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // create title
        primaryStage.setTitle("Title of the window");

        // create a button
        button = new Button();
        button.setText("Click me");
        button.setOnAction(event -> {
            System.out.println("event handler for button using lambda expression");
            System.out.println("second line");
        });

        // creating a simple layout (stackpane)
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
