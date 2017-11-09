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
  
  // FIELDS
  private static GridPane grid;
  private static Label questionNums[];
  private static Label questionLabels[];
  private static TextField answerFields[];
  private static int numQuestions;
  private static String[] mockQuestions;
  
  public static void openScene(Stage primaryStage) {
    // Establish a gridpane layout
    
    GridPane grid = new GridPane();
    grid = new GridPane();
    
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
    Label sceneTitle = new Label("aba");
    sceneTitle.setFont(Font.font("Verdana", FontWeight.NORMAL, 20));
    grid.add(sceneTitle, 0, currentRow, 2, 1);
    currentRow++;

    // Questions
    Label questionNumLabel = new Label("1.");
    grid.add(questionNumLabel, 0, currentRow, 2, 1);
    currentRow++;

    Label questionLabel = new Label("What is 3 + 4?");
    grid.add(questionLabel, 0, currentRow,2, 1);
    currentRow++;

    TextField answerField = new TextField();
    grid.add(answerField, 0, currentRow, 2, 1);
    currentRow++;
    
    /*
     * CREATING ARRAYS OF QUESTION LABELS AND TEXTBOXES
     * INITIALIZED TO A FIXED NUMBER... FOR NOW...
     */
    
    // DECLARE
    /*
    Label questionNums[];
    Label questionLabels[];
    TextField answerFields[];
    int numQuestions;
    String[] mockQuestions;
    */
    
    // INITIALIZE
    numQuestions = 10;
    mockQuestions = new String[]{"The first question", "the second",
        "and the third", "fourth question", "la cinquième question",
        "numéro six", "the 7th", "eigth question", "ninth question", 
        "Question X"};
    
    questionNums = new Label[numQuestions];
    questionLabels = new Label[numQuestions];
    answerFields = new TextField[numQuestions];
    
    // ITERATE THROUGH QUESTION NUMS, LABELS, AND ANSWER FIELDS
    for (int i = 0; i < numQuestions; i++) {
      questionNums[i].setText(Integer.toString(i) + ".");
      questionLabels[i].setText(mockQuestions[i]);
    }
    
  }
  
  /**
   * helper function add objects to the gridPane.
   */
  private static void addToGrid() {
    
  }
  
}
