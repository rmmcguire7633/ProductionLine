package productionline;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;

  //Step 19 declaration
  private String deptId;
  private Pattern p;
  private Scanner in;
  private String completeInput;

  public EmployeeInfo () {

    setName();

    this.p = Pattern.compile("[a-zA-Z]*\\\\s[a-zA-Z]*\\\\s[a-zA-Z0-9]*$\"");
    setDeptId();
  }

  public StringBuilder getName(){

    String input_name = inputName();

    StringBuilder newName = new StringBuilder(input_name);
    if (checkName(newName)) {

      createEmployeeCode(newName);
    } else {

      this.code = "guest";
    }

    return newName;
  }

  public String getCode() {

    return this.code;
  }

  private void setName(){

    this.name = getName();
  }

  private void createEmployeeCode(StringBuilder name) {

    String[] splitString = name.toString().split(" ");
    this.code = Character.toString(splitString[0].charAt(0)) + splitString[1];
  }

  private String inputName() {

    Scanner sc = new Scanner(System.in);
    this.in = sc;

    System.out.println("Enter the Employee First Name, Last Name and Department(Separated by"
        + " ' ')");

    completeInput = sc.nextLine();
    return completeInput;
  }

  private boolean checkName (StringBuilder name) {

    for (int i=0; i<name.length();i++) {

      if(name.charAt(i)==' ') {

        return true;
      }
    }

    return false;
  }

  public String getDeptId() {

    if(validId(completeInput)) {

      return completeInput.split(" ")[2];
    } else {

      return "None01";
    }
  }

  private void setDeptId() {

    this.deptId = getDeptId();
  }

  private String getId() {

    return this.deptId;
  }

  private boolean validId(String id) {

    if(p.matcher(id).find()) {

      return true;
    }

    return false;
  }

  @Override
  public String toString() {

    return "Employee Code: " + this.getCode() + ", Department Id: " + this.getId();
  }
}
