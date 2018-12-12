/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 12/10/18
 * Step 22
 * Create a driver class named ViewFileInfo that will read the information from the
 * TestResults.txt file and display the contents to the console.  Use a try statement to
 * handle situations where the file does not exist.
 *
 *******************************************/

package productionline;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ViewFileInfo {

  /**
   * Reads the information from the TestResults.txt file and displays the contents of the file.
   */
  public static void fileRead() {

    /**
     * The assignment requires we hard code the absolute path.
     * */
    try (Scanner file = new Scanner(new File("C:\\LineTests\\TestResults.txt"),
        "UTF-8")) {

      while (file.hasNextLine()) {

        System.out.println(file.nextLine());
      }
    } catch (IOException e) {

      System.out.println(e);
    }
  }
}
