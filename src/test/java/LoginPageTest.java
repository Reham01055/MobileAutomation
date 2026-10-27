
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class LoginPageTest extends BaseTest {


    @Test
    public void validLoginWithValidCredentials() {
        new LoginPage(driver).Login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getPageSource().contains("PRODUCTS"),
                "User did not login");

    }


    @Test
    public void loginWithInvalidCredentials(){
        new LoginPage(driver).Login("  ","  ");
        String expected = new LoginPage(driver).getErrorMessageLocator();
        Assert.assertEquals(expected,"Username and password do not match any user in this service.","massage mismatch requirements ");
    }

}
