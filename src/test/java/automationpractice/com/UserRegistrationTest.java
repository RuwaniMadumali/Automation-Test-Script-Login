package automationpractice.com;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.PropertyFileReader;
import util.TestApp;

public class UserRegistrationTest {
    HomePage homePage;
    AuthenticationPage authenticationPage;
    CreateAccountPage createAccountPage;
    MyAccountPage myAccountPage;
    PropertyFileReader property= new PropertyFileReader();
    String userTitle=property.getProperty("user","user.title");
    String userFirstName=property.getProperty("user","user.firstname");
    String userLastName=property.getProperty("user","user.lastname");
    String userEmailAddress=property.getProperty("user","user.emailaddress");
    String userPassword=property.getProperty("user","user.password");
    String userBirthDate=property.getProperty("user","user.dateofbirth.date");
    String userBirthMonth=property.getProperty("user","user.dateofbirth.month");
    String userBirthYear=property.getProperty("user","user.dateofbirth.year");
    String userCompany=property.getProperty("user","user.company");
    String userAddressLine1=property.getProperty("user","user.addressline1");
    String userAddressLine2=property.getProperty("user","user.addressline2");
    String userCity=property.getProperty("user","user.city");
    String userState=property.getProperty("user","user.state");
    String userZipcode=property.getProperty("user","user.zipcode");
    String userCountry=property.getProperty("user","user.country");
    String userAdditionalInfo=property.getProperty("user","user.additinalinfo");
    String userHomePhoneNo=property.getProperty("user","user.homephone");
    String userMobileNo=property.getProperty("user","user.mobile");
    String userAliasAddress=property.getProperty("user","user.aliasaddress");



    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage=new HomePage();
        authenticationPage=homePage.signInUser();
    }

    @Test
    public void testUserRegistration() {
    createAccountPage=authenticationPage.setUserEmailAddress(userEmailAddress)
            .createAccount();
    myAccountPage=createAccountPage.setUserTitle(userTitle)
            .setPersonalInfoFirstName(userFirstName)
            .setPersonalInfoLastName(userLastName)
            .setEmail(userEmailAddress)
            .setPassword(userPassword)
            .setBirthDate(userBirthDate)
            .setBirthMonth(userBirthMonth)
            .setBirthYear(userBirthYear)
            .setAddressFirstName(userFirstName)
            .setAddressLastName(userLastName)
            .setCompany(userCompany)
            .setAddressLine1(userAddressLine1)
            .setAddressLine2(userAddressLine2)
            .setCity(userCity)
            .setState(userState)
            .setZipCode(userZipcode)
            .setCountry(userCountry)
            .setAdditionalInformation(userAdditionalInfo)
            .setHomePhoneNumber(userHomePhoneNo)
            .setMobileNumber(userMobileNo)
            .setAlias(userAliasAddress)
            .register();
    }
}
