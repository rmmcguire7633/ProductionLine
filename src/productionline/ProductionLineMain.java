/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 09/22/2018
 * Contains the main method
 *
 *******************************************/

package productionline;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProductionLineMain extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("ProductionLine.fxml"));
    primaryStage.setTitle("Welcome");
    primaryStage.setScene(new Scene(root, 300, 275));
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
