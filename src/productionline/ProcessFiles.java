/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 12/10/2018
 * Step 21
 * This class save both the products and the employee information to
 * file so create two methods that override each other that accept either the employee object or
 * products arraylist.
 *
 *******************************************/

package productionline;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * This class save both the products and the employee information to
 * file so create two methods that override each other that accept either the employee object or
 * products arraylist.
 */
public class ProcessFiles {

  private Path p1;
  private Path p2;
  private Path p3;

  /**
   * Constructor used to set p1, p2, and p3.
   */
  public ProcessFiles() {

    /**
     * The assignment requires we hard code the absolute path.
     **/
    p1 = Paths.get("C:/LineTests");
    p2 = Paths.get("TestResults.txt");
    p3 = p1.resolve(p2);

    createDirectory();
  }

  /**
   * Creates the directory.
   * If Directory does not exist, create directory.
   */
  public void createDirectory() {

    try {

      if (Files.notExists(p1)) {

        Files.createDirectory(p1);
      }
    } catch (Exception e) {

      System.out.println(e);
    }
  }

  /**
   * Writes the employee information entered by the user into the file.
   * @param emp all the emplyee information.
   * @throws IOException the IO exception thrown in case there is no directory.
   */
  public void writeFile(EmployeeInfo emp) throws IOException {

    Writer write = new OutputStreamWriter(new FileOutputStream(p3.toString()), "UTF-8");
    PrintWriter printWrite = new PrintWriter(write);

    printWrite.println(emp);
    printWrite.close();
  }

  /**
   * Wrtites the products into the the file.
   * @param products the product information.
   * @throws IOException the IO exception thrown in case there is no directory.
   */
  public void writeFile(ArrayList<Product> products) throws IOException {

    Writer write = new OutputStreamWriter(new FileOutputStream(p3.toString()), "UTF-8");
    PrintWriter printWrite = new PrintWriter(write);
    for (Product i : products) {

      printWrite.println(i);
    }
    printWrite.close();
  }

}
