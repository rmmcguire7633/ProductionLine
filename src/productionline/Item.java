/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 09/22/2018
 * Step 1 creating an interface for oracle project
 *
 *******************************************/

package productionline;

import java.util.Date;

public interface Item {

  String manufacturer = "OracleProduction";

  void setProductionNumber(int productionNumber);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();

}
