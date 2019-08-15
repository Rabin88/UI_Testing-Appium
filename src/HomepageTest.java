import io.appium.java_client.MobileElement;
import org.junit.Test;

public class HomepageTest extends BaseTestCases {


    @Test
    public void DashboardNavigation() throws InterruptedException {

        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("View Transactions");
        el1.click();
        
        MobileElement el2 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Dismiss All\"])[1]");
        el2.click();

        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Forecast, tab, 4 of 5");
        el3.click();
        Thread.sleep(3000);

        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Settings, tab, 5 of 5");
        el4.click();
        Thread.sleep(3000);

        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("LOGOUT");
        el5.click();
        Thread.sleep(3000);
    }

}
