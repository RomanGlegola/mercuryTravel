package pl.sda.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    private WebDriver driver;

    private WebElement registerHeading;
    private WebElement firstName;
    private WebElement lastName;
    private WebElement phone;
    private WebElement email;
    private WebElement adress;
    private WebElement state;
    private WebElement city;
    private WebElement postalCode;
    private WebElement country;
    private WebElement userName;
    private WebElement password;
    private WebElement cPassword;


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        registerHeading = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));

        firstName = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
        lastName = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
        phone = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
        email = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        adress = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
        city = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
        state = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
        postalCode = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input"));
        country = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
        password = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
        cPassword = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"));
    }

    public boolean isRegisterHeadingVisible() {
        return WaitTools.isElementVisible(driver, registerHeading);
    }

    public boolean isFirstName() {return WaitTools.isElementVisible(driver, firstName);}
    public boolean isLastName() {return WaitTools.isElementVisible(driver, lastName);}
    public boolean isPhone() {return WaitTools.isElementVisible(driver, phone);}
    public boolean isEmail() {return WaitTools.isElementVisible(driver, email);}
    public boolean isAddress() {return WaitTools.isElementVisible(driver, adress);}
    public boolean isCity(){return WaitTools.isElementVisible(driver, city);}
    public boolean isState() {return WaitTools.isElementVisible(driver, state);}
    public boolean isPostalCode() {return WaitTools.isElementVisible(driver, postalCode);}
    public boolean isCountry() {return WaitTools.isElementVisible(driver, country);}
    public boolean isUserName() {return WaitTools.isElementVisible(driver, userName);}
    public boolean isPassword() {return WaitTools.isElementVisible(driver, password);}
    public boolean isCPassword() {return WaitTools.isElementVisible(driver, cPassword);}

    public void addFirstName() throws InterruptedException {
        firstName.sendKeys("Radek");}

    public void addLastName() throws InterruptedException {
        lastName.sendKeys("Sikorski");}

    public void addPhone() throws InterruptedException {
        phone.sendKeys("666666666");}

    public void addEmailAddress() throws InterruptedException {
        email.sendKeys("test@test.com");
    }

    public void addAdress() throws InterruptedException {
        adress.sendKeys("0101010101010101010101010101010101010101");
    }

    public void addCity() throws InterruptedException {
        city.sendKeys("0101010101010101010101010101010101010101");
    }

    public void addState() throws InterruptedException {
        state.sendKeys("0101010101010101010101010101010101010101");
    }

    public void addPostalCode() throws InterruptedException {
        postalCode.sendKeys("0101010101010101010101010101010101010101");
    }
    public void addCountry() throws InterruptedException {
        country.sendKeys("0101010101010101010101010101010101010101");
    }
    public void addUserName() throws InterruptedException {
        userName.sendKeys("0101010101010101010101010101010101010101");
    }
    public void addPassword() throws InterruptedException {
        password.sendKeys("0101010101010101010101010101010101010101");
    }
    public void addCPassword() throws InterruptedException {
        cPassword.sendKeys("0101010101010101010101010101010101010101");
    }


    public void choosElementFromSubjectHeading() {
        registerHeading.click();
    }

}