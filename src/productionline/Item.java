/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 09/22/2018
 * Step 1 creating an interface for oracle project
 *
 *******************************************/

package productionline;

import java.util.Date;

/**
 * The interface Item.
 */
public interface Item {

  /**
   * The constant manufacturer used for the default name of the manufacturer.
   */
  String manufacturer = "OracleProduction";

  /**
   * Sets production number.
   *
   * @param productionNumber the production number
   */
  void setProductionNumber(int productionNumber);

  /**
   * Sets name.
   *
   * @param name the name
   */
  void setName(String name);

  /**
   * Gets name.
   *
   * @return the name
   */
  String getName();

  /**
   * Gets manufacture date.
   *
   * @return the manufacture date
   */
  Date getManufactureDate();

  /**
   * Gets serial number.
   *
   * @return the serial number
   */
  int getSerialNumber();

}
