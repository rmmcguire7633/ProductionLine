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

  private static Scanner scan = new Scanner(System.in, "UTF-8");
  static String userInput;
  static int userNumberInput;
  static ArrayList<Product> productList = new ArrayList<>();
  static MonitorType monitorType;
  static Screen screen;
  static MoviePlayer moviePlayer;




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

    getStartUp();
  }

  public static void getStartUp() {

    boolean whileRunning = true;

    while (whileRunning) {

      System.out.println("Main Menu Options");
      System.out.println("Chose One Of The Options");
      System.out.println("1: View Product(s)");
      System.out.println("2: Add Product(s)");
      System.out.println("3: View Product Statistics");
      System.out.println("4: End Program");

      try {

        userNumberInput = scan.nextInt();

        if (userNumberInput == 1) {

          Collections.sort(productList);
          System.out.println(productList);
        } else if(userNumberInput == 2) {

          switchForAddProduct();
        } else if (userNumberInput == 3) {

          getStats();
        } else if (userNumberInput == 4){

          whileRunning = false;
          System.exit(0);
        } else {

          System.out.println("Please Enter A Number Between 1 and 4");
        }
      } catch (Exception e) {

        System.out.println("Please Enter A Valid Number Between 1 and 4");
        scan.next();
      }
    }
  }

  public static void switchForAddProduct() {

    boolean whileRunning = true;

    while (whileRunning) {
      System.out.println("Add Product Menu");
      System.out.println("Please Pick From The Following");
      System.out.println("1: Add Audio Player");
      System.out.println("2: Add Movie Player");
      System.out.println("3: Main Menu");

      try {

        System.out.println();
        int userInput = scan.nextInt();

        switch (userInput) {

          case 1:
            System.out.println("This is one");
            addAudio();
            break;
          case 2:
            addMovie();
            break;
          case 3:
            whileRunning = false;
            break;
          default:
            System.out.println("Please Enter A Number Between 1-4");
            break;
        }
      } catch (Exception e) {

        System.out.println("Please Enter A Valid Number Between 1 and 3");
      }
    }
  }

  public static void addAudio() {

    boolean whileRunning = true;

    while (whileRunning) {

      System.out.println("Enter The Number Of Audio Players You Would Like To Create");

      try {

        int userInput = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < userInput; i++) {

          System.out.println("Enter The Name Of The Product");
          try {


            String productName = scan.nextLine();


            System.out.println("Enter The Product Details");

            try {

              String productDetails = scan.nextLine();

              AudioPlayer audioPlayer = new AudioPlayer(productName, productDetails);
              productList.add(audioPlayer);

              if (i == userInput -1) {


                whileRunning = false;
                System.out.println(productList);
              }
            } catch (Exception e) {

              System.out.println("Please Enter Valid Product Details");
              scan.next();
            }
          } catch (Exception e) {

            System.out.println("Please Enter A Valid Name");
            scan.next();
          }
        }
      } catch (Exception e) {

        System.out.println("Please Enter A Valid Number");
        scan.next();
      }
    }
  }

  public static void addMovie() {

    boolean whileRunning = true;

    while (whileRunning) {

      System.out.println("Enter The Number Of Movie Players You Would Like To Create");

      try {

        int userInput = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < userInput; i++) {

          System.out.println("Enter The Name Of The Product");
          try {


            String productName = scan.nextLine();


            System.out.println("What Is The Type Of Display");
            System.out.println("Choose From The Following");
            System.out.println("1: LCD");
            System.out.println("2: LED");

            try {

              boolean correctInput = false;

              while (!correctInput) {

                int userChoice = scan.nextInt();

                switch (userChoice) {

                  case 1:
                    monitorType = MonitorType.LCD;
                    correctInput = true;
                    break;
                  case 2:
                    monitorType = MonitorType.LED;
                    correctInput = true;
                    break;
                  default:
                    System.out.println("Please Enter A Valid Number Between 1 and 2");
                    scan.nextLine();
                    break;
                }
              }

              System.out.println("Enter The Screen Details");
              System.out.println("Choose From The Following");
              System.out.println("1: Resolution 1080p, Refresh Rate 60hz, Response Time 2ms");
              System.out.println("2: Resolution 1440p, Refresh Rate 120hz, Response Time 1ms");

              try {


                boolean validInput = false;
                while (!validInput) {

                  int screenResolutionChoice = scan.nextInt();

                  switch (screenResolutionChoice) {

                    case 1:
                      screen = new Screen("1080p", 60, 2);
                      validInput = true;
                      break;
                    case 2:
                      screen = new Screen("1440p", 120, 1);
                      validInput = true;
                      break;
                    default:
                      System.out.println("Please Enter A Valid Number Between 1 and 2");
                      scan.nextLine();
                      break;
                  }
                }
                scan.nextLine();

                moviePlayer = new MoviePlayer(productName, screen, monitorType);
                productList.add(moviePlayer);

                if(i == userInput -1) {

                  whileRunning = false;
                }
              }catch (Exception e) {

                System.out.println("Please Enter Valid Product Details");
                scan.next();
              }
            } catch (Exception e) {

              System.out.println("Please Enter A Valid Number Between 1 and 2");
              scan.next();
            }


          } catch (RuntimeException e) {

            throw e;
          } catch (Exception e ) {

            System.out.println("Please Enter A Valid Name");
            scan.next();
          }
        }
      } catch (RuntimeException e) {

        throw e;
      } catch (Exception e) {

        System.out.println("Please Enter A Valid Number");
        scan.next();
      }
    }
  }

  public static void getStats() {

    int audioPlayers = 0;
    int moviePlayers = 0;
    int uniquePlayers = 0;

    //Used to compare with previous Product name
    String compareName = "";

    Collections.sort(productList);

    for (Product i : productList) {

      if(i.getClass() == AudioPlayer.class) {

        audioPlayers++;
      } else if (i.getClass() == MoviePlayer.class) {

        moviePlayers++;
      }

      if (!i.getName().equals(compareName)) {

        uniquePlayers++;
      }

      compareName = i.getName();
    }

    //console print out of results
    System.out.println("Total Number Of Products: " + productList.size());
    System.out.println("Total Number Of Movie Players: " + moviePlayers);
    System.out.println("Total Number Of Audio Players: " + audioPlayers);
    System.out.println("Total Number Of Unique Players: " + uniquePlayers);
  }
}

