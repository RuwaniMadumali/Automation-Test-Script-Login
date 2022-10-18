package automationpractice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.PropertyFileReader;
import util.TestApp;

import java.time.Duration;

public class AuthenticationPage {
    WebDriver driver=TestApp.getInstance().getDriver();
    PropertyFileReader property=new PropertyFileReader();
    String emailAddresselement=property.getProperty("AuthenticationPage","user.emailaddress.element");
    String createAccountButtonElement=property.getProperty("AuthenticationPage","createaccount.button");

    //Enter Email Address for create new user
    public AuthenticationPage setUserEmailAddress(String email){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(emailAddresselement), Duration.ofSeconds(10));
        driver.findElement(By.id(emailAddresselement)).sendKeys(email);
        return  this;
    }
    //Click Crate an Account button
    public CreateAccountPage createAccount(){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(createAccountButtonElement),Duration.ofSeconds(10));
        driver.findElement(By.id(createAccountButtonElement)).click();
        return new CreateAccountPage();
    }
}
