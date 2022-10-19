package automationpractice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.PropertyFileReader;
import util.TestApp;

import java.time.Duration;

public class HomePage {
    WebDriver driver=TestApp.getInstance().getDriver();
    PropertyFileReader property = new PropertyFileReader();

    String signInElement= property.getProperty("HomePage","user.signin.element");

    //click on signin jump to Authentication page
    public AuthenticationPage signInUser(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(signInElement), Duration.ofSeconds(20));
        driver.findElement(By.xpath(signInElement)).click();
        return new AuthenticationPage();
    }
}
