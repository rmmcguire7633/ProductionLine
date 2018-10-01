/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 09/22/2018
 * Step 2 creating an enum with the 4 types
 *
 *******************************************/


package productionline;

public enum ItemType {

  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  final String code;

  ItemType(String newCode) {
    code = newCode;
  }

}
