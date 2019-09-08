/**
 * This ValidLogin class is for testing with valid login details on login screen.
 */

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ValidLogin {
    IOSDriver driver;
    //AppiumDriver<MobileElement> driver;

    @Before
    public void setup() throws MalformedURLException {
        DesiredCapabilities DC = new DesiredCapabilities();
        DC.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        DC.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        DC.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.4");
        DC.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone X");
        DC.setCapability(MobileCapabilityType.APP,"/Users/rabinpun/Library/Developer/Xcode/DerivedData/Finance-dipqkrfyzgbuiqbzsvknusqqqxjh/Build/Products/Debug-iphonesimulator/Finance.app");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new IOSDriver(url,DC);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void stop(){
        driver.quit();
    }

    @Test
    public void ValidLogin() throws InterruptedException {

        // checking valid username
        MobileElement username = (MobileElement) driver.findElement(By.xpath("//XCUIElementTypeTextField[1]"));
        username.sendKeys("test");

        // checking valid password
        MobileElement password = (MobileElement) driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[1]"));
        password.sendKeys("test123");

        // checking login button
        driver.findElementByAccessibilityId("\uF090 LOGIN").click();

        // checking "Get Transaction Data" button on Bank Screen
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Get Transaction Data");
        el1.click();

        // checking "View Transactions" button on Bank Screen
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("View Transactions");
        el2.click();


        Thread.sleep(4000);
    }
}
