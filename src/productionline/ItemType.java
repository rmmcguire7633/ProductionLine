/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 09/22/2018
 * Step 2 creating an enum with the 4 types
 *
 *******************************************/


package productionline;

/**
 * The enum Item type.
 */
public enum ItemType {

  /**
   * Audio item type.
   */
  AUDIO("AU"),

  /**
   * Visual item type.
   */
  VISUAL("VI"),

  /**
   * Audiomobile item type.
   */
  AUDIOMOBILE("AM"),

  /**
   * Visualmobile item type.
   */
  VISUALMOBILE("VM");

  /**
   * The Code.
   */
  final String code;

  ItemType(String newCode) {

    code = newCode;
  }

}
