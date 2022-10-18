package automationpractice.com;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.PropertyFileReader;
import util.TestApp;

public class UserRegistrationTest {
    HomePage homePage;
    AuthenticationPage authenticationPage;
    PropertyFileReader property= new PropertyFileReader();
    String userEmailAddress=property.getProperty("user","user.emailaddress");
    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage=new HomePage();
        authenticationPage=homePage.signInUser();
    }

    @Test
    public void testUserRegistration() {
    authenticationPage.setUserEmailAddress(userEmailAddress)
            .createAccount();
    }
}
