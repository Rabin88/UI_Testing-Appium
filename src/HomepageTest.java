/**
 * This HomePageTest class is for testing six different buttons.
 */

import io.appium.java_client.MobileElement;
import org.junit.Test;

public class HomepageTest extends BaseTestCases {


    @Test
    public void DashboardNavigation() throws InterruptedException {

        // checking "Get Transaction Data" button on BankScreen
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Get Transaction Data");
        el1.click();

        // checking "View Transactions" button on Dashboard screen
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("View Transactions");
        el2.click();

        // checking "Dismiss All" alert button
        MobileElement el3 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Dismiss All\"])[1]");
        el3.click();

        // checking "Forecast" tab on Dashboard screen
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Forecast, tab, 4 of 5");
        el4.click();
        Thread.sleep(3000);

        // checking "Settings" tab on Dashboard screen
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Settings, tab, 5 of 5");
        el5.click();
        Thread.sleep(3000);

        // checking "Logout" button on Settings screen
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("\uF08B LOGOUT");
        el6.click();
        Thread.sleep(3000);
    }

}
