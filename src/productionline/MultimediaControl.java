/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 10/12/2018
 * Step 4
 *
 *
 *******************************************/

package productionline;

/**
 * The interface Multimedia control.
 */
public interface MultimediaControl {

  /**
   * Play the device.
   */
  public void play();

  /**
   * Stop the device.
   */
  public void stop();

  /**
   * Previous option on device.
   */
  public void previous();

  /**
   * Next option on device.
   */
  public void next();

}
