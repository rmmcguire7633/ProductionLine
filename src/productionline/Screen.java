/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 10/12/2018
 * Step 9
 *
 *
 *******************************************/

package productionline;

/**
 * The Screen type that is defined by resolution, refresh rate, and response time.
 */
public class Screen implements ScreenSpec {

  String resolution;
  int refreshRate;
  int responseTime;

  /**
   * This constructor sets the stated fields.
   * @param resolution the resolution of the screen object.
   * @param refreshRate the refresh rate of the screen object.
   * @param responseTime the response time of the screen object.
   * */
  public Screen(String resolution, int refreshRate, int responseTime) {

    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  @Override
  public String getResolution() {

    return resolution;
  }

  @Override
  public int getRefreshRate() {

    return refreshRate;
  }

  @Override
  public int getResponseTime() {

    return responseTime;
  }

  @Override
  public String toString() {
    return "resolution= " + resolution + ", "
        + "refreshRate=" + refreshRate + "hz"
        + ", "
        + "responseTime=" + responseTime + "ms";
  }
}
