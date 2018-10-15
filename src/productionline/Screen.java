/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 10/12/2018
 * Step 9
 *
 *
 *******************************************/

package productionline;

public class Screen implements ScreenSpec{

  String resoltion;
  int refreshRate;
  int responseTime;

  public Screen(String resoltion, int refreshRate, int responseTime){

    this.resoltion = resoltion;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  @Override
  public String getResolution() {

    return resoltion;
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
    return "resoltion= " + resoltion + ", " +
        "refreshRate=" + refreshRate + ", " +
        "responseTime=" + responseTime;
  }
}
