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

    System.out.println("-------------------------------");

    //Step 10 creating a driver class to test the functionality of Screen class
    Screen screen = new Screen();
    screen.resoltion = "1080x420";
    screen.responseTime = 6;
    screen.refreshRate = 100;

    System.out.println(screen);

    System.out.println("---------------------");

    //Step 12 creating a driver to test the functionality of the MoviePlayer class
    MoviePlayer moviePlayer = new MoviePlayer("Dumbledore", screen, MonitorType.LED);
    System.out.println(moviePlayer);
  }
}

