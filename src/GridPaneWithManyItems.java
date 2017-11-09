import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class GridPaneWithManyItems {

  public static void openScene(Stage primaryStage) {
    // Establish a gridpane layout
    
    GridPane grid = new GridPane();
    
    grid.setAlignment(Pos.CENTER);
    grid.setPadding(new Insets(15, 15, 15, 15));
    grid.setVgap(5);
    grid.setHgap(5);
    int currentRow;

    ScrollPane sp = new ScrollPane(grid);
    sp.setFitToHeight(true);
    sp.setFitToWidth(true);

    Scene addStudentsScene = new Scene(sp, 500, 250);
    primaryStage.setScene(addStudentsScene);
    currentRow = 0;

    // Title
    Text sceneTitle = new Text("aba");
    sceneTitle.setFont(Font.font("Verdana", FontWeight.NORMAL, 20));
    grid.add(sceneTitle, 0, currentRow, 2, 1);
    currentRow++;

    // Questions
    Text questionNumLabel = new Text("1.");
    grid.add(questionNumLabel, 0, currentRow, 2, 1);
    currentRow++;

    Text questionLabel = new Text("What is 3 + 4?");
    grid.add(questionLabel, 0, currentRow,2, 1);
    currentRow++;

    TextField answerField = new TextField();
    grid.add(answerField, 0, currentRow, 2, 1);
    currentRow++;
    
  }
  
}
