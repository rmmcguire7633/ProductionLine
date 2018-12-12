/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 12/11/2018
 * Step 23
 * Allow a user to Add a new product and to specify how many items of that product
 * should be created.
 * The program will then create these items and store them in a collection.
 * The collection can be displayed at any time.
 * New Products can be added at any time.
 * Production statistics can be displayed – Total items produced, number of each item,
 * the number of unique products created etc.
 * The operator will decide when to stop the program.
 *
 *******************************************/

package productionline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Allow a user to Add a new product and to specify how many items of that product
 * should be created.
 * The program will then create these items and store them in a collection.
 * The collection can be displayed at any time.
 * New Products can be added at any time.
 * Production statistics can be displayed – Total items produced, number of each item,
 * the number of unique products created etc.
 * The operator will decide when to stop the program.
 */
public class UserAction {

  private static Scanner scan = new Scanner(System.in, "UTF-8");
  private static int userNumberInput;
  private static ArrayList<Product> productList = new ArrayList<>();
  private static MonitorType monitorType;
  private static Screen screen;
  private static MoviePlayer moviePlayer;

  /**
   * The start point for the program.
   */
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
        } else if (userNumberInput == 2) {

          switchForAddProduct();
        } else if (userNumberInput == 3) {

          getStats();
        } else if (userNumberInput == 4) {

          whileRunning = false;
          //System.exit(0);
        } else {

          System.out.println("Please Enter A Number Between 1 and 4");
        }
      } catch (Exception e) {

        System.out.println("Please Enter A Valid Number Between 1 and 4");
        scan.next();
      }
    }
  }

  /**
   * The switch statement used for the add product option in the Main menu.
   */
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

  /**
   * When this method is called it will get user input.
   * The user will enter how many devices they would like to add to the collection.
   * The user will enter the name of the product.
   * The user will enter the product details.
   * An AudioPlayer object will be created and added to the productList.
   */
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

              if (i == userInput - 1) {


                whileRunning = false;
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

  /**
   * Mehtod used to add a MoviePlayer object to the productList,
   * This method will ask the user how many MoviePlayers there are.
   * The user will enter the product name.
   * The user will enter the choice of LCD or LED ad the monitor type.
   * The user will enter the choice for Screen resolution, refresh rate, and response time.
   * A MoviePlayer Object will be created from the user input and added to the productList.
   */
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

                if (i == userInput - 1) {

                  whileRunning = false;
                }
              } catch (Exception e) {

                System.out.println("Please Enter Valid Product Details");
                scan.next();
              }
            } catch (Exception e) {

              System.out.println("Please Enter A Valid Number Between 1 and 2");
              scan.next();
            }


          } catch (RuntimeException e) {

            throw e;
          } catch (Exception e) {

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

  /**
   * This method will get the total number of products in the productList.
   * This method will get the total number of MoviePlayer objects in the productList.
   * This method will get the total number of AudiPlayer objects in the productList.
   * This method will get the total number of unique objects in the productList.
   */
  public static void getStats() {

    int audioPlayers = 0;
    int moviePlayers = 0;
    int uniquePlayers = 0;

    //Used to compare with previous Product name
    String compareName = "";

    Collections.sort(productList);

    for (Product i : productList) {

      if (i.getClass() == AudioPlayer.class) {

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
