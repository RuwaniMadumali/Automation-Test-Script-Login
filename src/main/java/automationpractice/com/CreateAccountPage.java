package automationpractice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import util.PropertyFileReader;
import util.TestApp;

import java.time.Duration;

public class CreateAccountPage {
    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader property=new PropertyFileReader();

    String tittleMrElement=property.getProperty("CreateAccountPage","user.personal.title.mr.element");
    String tittleMrsElement=property.getProperty("CreateAccountPage","user.personal.title.mrs.element");
    String personalFirstNameElement=property.getProperty("CreateAccountPage","user.personal.firstname.element");
    String personalLastNameElement=property.getProperty("CreateAccountPage","user.personal.lastname.element");
    String emailElement=property.getProperty("CreateAccountPage","user.personal.email.element");
    String passwordElement=property.getProperty("CreateAccountPage","user.personal.password.element");
    String dateElement=property.getProperty("CreateAccountPage","user.personal.dateofbirth.date.element");
    String monthElement=property.getProperty("CreateAccountPage","user.personal.dateofbirth.month.element");
    String yearElement=property.getProperty("CreateAccountPage","user.personal.dateofbirth.year.element");
    String addressFirstNameElement=property.getProperty("CreateAccountPage","user.address.firstname.element");
    String addressLastNameElement=property.getProperty("CreateAccountPage","user.address.lastname.element");
    String companyElement=property.getProperty("CreateAccountPage","user.address.company.element");
    String addressLine1Element=property.getProperty("CreateAccountPage","user.address.addressline1.element");
    String addressLine2Element=property.getProperty("CreateAccountPage","user.address.addressline2.element");
    String cityElement=property.getProperty("CreateAccountPage","user.address.city.element");
    String stateElement=property.getProperty("CreateAccountPage","user.address.state.element");
    String zipCodeElement=property.getProperty("CreateAccountPage","user.address.zipcode.element");
    String countryElement=property.getProperty("CreateAccountPage","user.address.country.element");
    String additionalInfoElement=property.getProperty("CreateAccountPage","user.address.additinalinfo.element");
    String homePhoneElement=property.getProperty("CreateAccountPage","user.address.homephone.element");
    String mobileElement=property.getProperty("CreateAccountPage","user.address.mobile.element");
    String aliasElement=property.getProperty("CreateAccountPage","user.address.aliasaddress.element");
    String registerButtonElement=property.getProperty("CreateAccountPage","register.button.element");


    public CreateAccountPage setUserTitle(String type){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(tittleMrElement), Duration.ofSeconds(20));
        if (type=="Mr"){
            driver.findElement(By.id(tittleMrElement)).click();
        }else {
            driver.findElement(By.id(tittleMrsElement)).click();
        }
        return this;
    }

    public CreateAccountPage setPersonalInfoFirstName(String firstName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(personalFirstNameElement), Duration.ofSeconds(10));
        driver.findElement(By.id(personalFirstNameElement)).sendKeys(firstName);
        return  this;
    }

    public CreateAccountPage setPersonalInfoLastName(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(personalLastNameElement), Duration.ofSeconds(10));
        driver.findElement(By.id(personalLastNameElement)).sendKeys(lastName);
        return  this;
    }
    public CreateAccountPage setEmail(String email){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(emailElement), Duration.ofSeconds(10));
        driver.findElement(By.id(emailElement)).clear();
        driver.findElement(By.id(emailElement)).sendKeys(email);
        return  this;
    }
    public CreateAccountPage setPassword(String password){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(passwordElement), Duration.ofSeconds(10));
        driver.findElement(By.id(passwordElement)).sendKeys(password);
        return  this;
    }

    public CreateAccountPage setBirthDate(String birthDate){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(dateElement), Duration.ofSeconds(10));
        Select dates = new Select(driver.findElement(By.id(dateElement)));
        dates.selectByValue(birthDate);
        return  this;
    }
    public CreateAccountPage setBirthMonth( String birthMonth){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(monthElement), Duration.ofSeconds(10));
        Select dates = new Select(driver.findElement(By.id(monthElement)));
        dates.selectByValue(birthMonth);
        return  this;
    }
    public CreateAccountPage setBirthYear(String birthYear ){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(yearElement), Duration.ofSeconds(10));
        Select dates = new Select(driver.findElement(By.id(yearElement)));
        dates.selectByValue(birthYear);
        return  this;
    }
    public CreateAccountPage setAddressFirstName(String firstName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(addressFirstNameElement), Duration.ofSeconds(10));
        driver.findElement(By.id(addressFirstNameElement)).sendKeys(firstName);
        return  this;
    }
    public CreateAccountPage setAddressLastName(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(addressLastNameElement), Duration.ofSeconds(10));
        driver.findElement(By.id(addressLastNameElement)).sendKeys(lastName);
        return  this;
    }
    public CreateAccountPage setCompany(String company){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(companyElement), Duration.ofSeconds(10));
        driver.findElement(By.id(companyElement)).sendKeys(company);
        return  this;
    }
    public CreateAccountPage setAddressLine1(String addressLine1){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(addressLine1Element), Duration.ofSeconds(10));
        driver.findElement(By.id(addressLine1Element)).sendKeys(addressLine1);
        return  this;
    }
    public CreateAccountPage setAddressLine2(String addressLine2){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(addressLine2Element), Duration.ofSeconds(10));
        driver.findElement(By.id(addressLine2Element)).sendKeys(addressLine2);
        return  this;
    }
    public CreateAccountPage setCity(String city){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(cityElement), Duration.ofSeconds(10));
        driver.findElement(By.id(cityElement)).sendKeys(city);
        return  this;
    }

    //have to implement with a logic
    public CreateAccountPage setState(String state){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(stateElement), Duration.ofSeconds(10));
        Select states = new Select(driver.findElement(By.id(stateElement)));
        states.selectByValue(state);
        return  this;
    }
    public CreateAccountPage setZipCode(String zipCode){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(zipCodeElement), Duration.ofSeconds(10));
        driver.findElement(By.id(zipCodeElement)).sendKeys(zipCode);
        return  this;
    }

    //have to implement with a logic
    public CreateAccountPage setCountry(String country){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(countryElement), Duration.ofSeconds(10));
        //code
        return  this;
    }
    public CreateAccountPage setAdditionalInformation(String additionalInformation){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(additionalInfoElement), Duration.ofSeconds(10));
        driver.findElement(By.id(additionalInfoElement)).sendKeys(additionalInformation);
        return  this;
    }
    public CreateAccountPage setHomePhoneNumber(String homePhoneNumber){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(homePhoneElement), Duration.ofSeconds(10));
        driver.findElement(By.id(homePhoneElement)).sendKeys(homePhoneNumber);
        return  this;
    }
    public CreateAccountPage setMobileNumber(String mobileNumber){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(mobileElement), Duration.ofSeconds(10));
        driver.findElement(By.id(homePhoneElement)).sendKeys(mobileNumber);
        return  this;
    }
    public CreateAccountPage setAlias(String alias){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(aliasElement), Duration.ofSeconds(10));
        driver.findElement(By.id(aliasElement)).sendKeys(alias);
        return  this;
    }
    public MyAccountPage register(){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(registerButtonElement), Duration.ofSeconds(10));
        driver.findElement(By.id(registerButtonElement)).click();
        return  new MyAccountPage();
    }

}
