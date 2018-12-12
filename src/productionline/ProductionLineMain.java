/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 09/22/2018
 * Contains the main method
 *
 *******************************************/

package productionline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
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

    /**
    //Step 6 creating driver class to test AudioPlayer Class
    AudioPlayer audio = new AudioPlayer("music box", "magic");
    System.out.println(audio);

    System.out.println("-------------------------------");

    //Step 10 creating a driver class to test the functionality of Screen class
    Screen screen = new Screen("1080x500", 100, 20);


    System.out.println(screen);

    System.out.println("---------------------");

    //Step 12 creating a driver to test the functionality of the MoviePlayer class
    MoviePlayer moviePlayer = new MoviePlayer("Dumbledore", screen, MonitorType.LED);
    System.out.println(moviePlayer);


    System.out.println("-----------------------------");
    *

    //MultiDriver.getMultiFunction();

     // Step 18-20 testing.
    System.out.println("Test Employee Department ID");
    EmployeeInfo employee = new EmployeeInfo();
    System.out.println(employee.toString());
     **/

    //Step 23
    UserAction.getStartUp();
  }
}

