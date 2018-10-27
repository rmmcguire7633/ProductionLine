/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 10/15/2018
 * Step 13-16
 * Creates an array list to demonstrate the interface usage and
 * sorts the list based on the productName.
 *
 *******************************************/

package productionline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiDriver {

  /**
   * Creates the the product information and places into an ArrayList.
   * Sorts the list based on the productName.
   * Prints out all contents with in the created ArrayList.
   * */
  public static void getMultiFunction() {

    //step 13-16
    ArrayList<Product> sortedList = new ArrayList<Product>();

    sortedList.add(new AudioPlayer("Boombox", "Sorcery"));
    sortedList.add(new MoviePlayer("55 inch TV",
        new Screen("3440x2000", 100, 20), MonitorType.LED));

    sortedList.add(new AudioPlayer("Flux Capacitor", "Time Travel"));
    sortedList.add(new MoviePlayer("Bigger than Shaq TV",
        new Screen("3976x2200", 60, 10), MonitorType.LCD));

    sortedList.add(new AudioPlayer("Loud Noise Do Hickey",
        "Evil Young People"));
    sortedList.add(new MoviePlayer("Russian TV",
        new Screen("500x250", 15, 500), MonitorType.LCD));

    Collections.sort(sortedList);
    printList(sortedList);
  }

  /**
   * prints all contents of the list.
   * @param sortedList List that contents will be printed out.
   * */
  private static void printList(List<Product> sortedList) {

    for (Product product : sortedList) {

      System.out.println(product + "\n");
    }
  }
}
