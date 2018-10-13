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

/**
 * The type Production line main.
 */
public class ProductionLineMain {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    //Step 6 creating driver class to test AudioPlayer Class
    AudioPlayer audio = new AudioPlayer("music box", "magic");
    System.out.println(audio);
  }
}

