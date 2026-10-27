
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    AndroidDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName("HONOR BRP-NX1");
        options.setPlatformVersion("16");
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");

        options.setApp("C:\\com.swaglabsmobileapp--12.apk");

        options.setAppPackage("com.swaglabsmobileapp");
        options.setAppActivity("com.swaglabsmobileapp.MainActivity");

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723/"), options);

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
    }


}
