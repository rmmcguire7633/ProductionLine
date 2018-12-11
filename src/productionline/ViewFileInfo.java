package productionline;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ViewFileInfo {

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
