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

public class ProcessFiles {

  private Path p1;
  private Path p2;
  private Path p3;

  public ProcessFiles() {

    /**
     * The assignment requires we hard code the absolute path.
     * */
    p1 = Paths.get("C:/LineTests");
    p2 = Paths.get("TestResults.txt");
    p3 = p1.resolve(p2);

    createDirectory();
  }

  public void createDirectory() {

    try {

      if(Files.notExists(p1)) {

        Files.createDirectory(p1);
      }
    } catch (Exception e) {

      System.out.println(e);
    }
  }

  public void writeFile(EmployeeInfo emp) throws IOException {

    Writer write = new OutputStreamWriter(new FileOutputStream(p3.toString()), "UTF-8");
    PrintWriter printWrite = new PrintWriter(write);

    printWrite.println(emp);
    printWrite.close();
  }

  public void writeFile(ArrayList<Product> products) throws IOException {

    Writer write = new OutputStreamWriter(new FileOutputStream(p3.toString()), "UTF-8");
    PrintWriter printWrite = new PrintWriter(write);
    for (Product i : products) {

      printWrite.println(i);
    }
    printWrite.close();
  }

}
