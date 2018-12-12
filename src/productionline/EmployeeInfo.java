/*******************************************************************
 *
 * Author: Ryan McGuire
 * Date: 12/09/18
 * Step 18-20
 *
 * Promts the user to enter their first and last name and generates a user code in the form of
 * first letter of first name + last name. ex(Ryan McGuire would be RMcGuire).
 *
 * Promts the user for their department ID and checks if its in the format of four
 * letters and two numbers. The department code must also be in the format of first
 * letter must be in uppercase with the following three all being lowercase and no spaces.
 *
 ********************************************************************/

package productionline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;

  //Step 19 declaration
  private String deptId;
  private Pattern pattern = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
  private Scanner in = new Scanner(System.in, "UTF-8");

  /**
   * Constructor used to set name and deptId.
   */
  public EmployeeInfo() {

    setName();
    setDeptId();
    in.close();
  }

  /**
   * Gets the name field.
   * @return the name.
   */
  public StringBuilder getName() {

    return name;
  }

  /**
   * Gets the employee code.
   * @return the employee code.
   */
  public String getCode() {

    return code;
  }

  /**
   * Sets the name.
   */
  private void setName() {

    String nameString = inputName();

    name = new StringBuilder(nameString);

    createEmployeeCode(name);
  }

  /**
   * Creates the employee code by taking the first letter of the first name and adding the last
   * last name to it.
   * @param name the name of the employee.
   */
  private void createEmployeeCode(StringBuilder name) {

    int spaceMarker = name.indexOf(" ");

    String lastName = name.substring((spaceMarker + 1), name.length());
    code = name.charAt(0) + lastName;
  }

  /**
   * Gets the name from the user.
   * @return the user first and last name.
   */
  private String inputName() {

    System.out.println("Please enter your first and last name: ");

    StringBuilder userInput = new StringBuilder(in.nextLine());

    boolean spaceChecker = checkName(userInput);

    if (spaceChecker) {

      createEmployeeCode(userInput);
    } else {

      code = "guest";
    }

    return userInput.toString();
  }

  /**
   * Checks for a space in the name.
   * @param name the name entered by the user.
   * @return the to string of the user name.
   */
  private boolean checkName(StringBuilder name) {

    return name.toString().contains(" ");
  }

  /**
   * Gets the DeptID.
   * @return the DeptId
   */
  public String getDeptId() {

    System.out.println("Please enter the department ID: ");

    String idInput = in.nextLine();

    if (validId(idInput)) {

      return idInput;
    }

    return "None01";
  }

  /**
   * Gets the ID of the department.
   * @return the deptId
   */
  private String setDeptId() {

    return deptId = getDeptId();
  }

  /**
   * Checks if ID number is in a valid format.
   * @param id the id entered by the user.
   * @return deptId entered by the employee.
   */
  private boolean validId(String id) {

    Matcher matchId = pattern.matcher(id);
    return matchId.matches();
  }

  /**
   * For step 20, takes the name of the employee and reverses it.
   * @param id the employee information.
   * @return the reverse of the employee information.
   */
  public String reverseString(String id) {

    StringBuilder stringBuilder = new StringBuilder(id);

    stringBuilder = stringBuilder.reverse();

    return stringBuilder.toString();
  }

  /**
   * Prints out the employee code and department number.
   * @return printed out version of employee code and department number.
   */
  @Override
  public String toString() {

    return "Employee Code: " + code + "\n"
        + "Department Number: " + deptId;
  }
}
