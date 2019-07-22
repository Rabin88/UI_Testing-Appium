import io.appium.java_client.MobileElement;
import org.junit.Test;

public class HomepageTest extends BaseTestCases {


    @Test
    public void DashboardNavigation() throws InterruptedException {

        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Go to Account Page");
        el1.click();

//        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Dashboard, tab, 1 of 3");
//        el2.click();

//        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Go to Account Graphs");
//        el3.click();
//
//        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Dashboard, tab, 1 of 3");
//        el4.click();
//
//        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Go to Account Set Budgets");
//        el5.click();
//
//        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("header-back");
//        el6.click();
//
//        Thread.sleep(5000);
    }

    @Test
    public void DashboardGraphPage() throws InterruptedException {

        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Go to Account Graphs");
        el3.click();
    }
}
