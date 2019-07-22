import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    IOSDriver driver;
    //AppiumDriver<MobileElement> driver;

    @Before
    public void setup() throws MalformedURLException {
        DesiredCapabilities DC = new DesiredCapabilities();
        DC.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        DC.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        DC.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.2");
        DC.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone X");
        DC.setCapability(MobileCapabilityType.APP,"/Users/rabinpun/Library/Developer/Xcode/DerivedData/Finance-dipqkrfyzgbuiqbzsvknusqqqxjh/Build/Products/Debug-iphonesimulator/Finance.app");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new IOSDriver(url,DC);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void  After(){
        driver.quit();
    }

    // Test for Blank Login
    @Test
    public void BlankLogin() throws InterruptedException {
        driver.findElementByAccessibilityId("LOGIN").click();

        Thread.sleep(5000);
    }

   // Test for Create Account Now? button and Already Registered? Login
    @Test
    public void goCreateAccountPage() throws InterruptedException {

        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Create Account Now?");
        el10.click();

        MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Already Registered? Login");
        el11.click();

        Thread.sleep(5000);
    }


    //Test for valid login

//    @Test
//    public void ValidLogin() throws InterruptedException {
//
//        MobileElement username = (MobileElement) driver.findElement(By.xpath("//XCUIElementTypeOther[1]"));
//        username.sendKeys("rabin");
//
//        MobileElement password = (MobileElement) driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[1]"));
//        password.sendKeys("test");
//
//        driver.findElementByAccessibilityId("LOGIN").click();
//
//        Thread.sleep(4000);
//    }

}
