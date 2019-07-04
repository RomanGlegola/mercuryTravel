package pl.sda.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MercuryTravelMain {

    private WebDriver driver;
    private WebElement registerButton;
    private WebElement contactUs;
    private WebElement contactUsAlt;

    public MercuryTravelMain(WebDriver driver) {
        this.driver = driver;
        registerButton =
                driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
    }

    public void clickRegisterButton() {
        WaitTools.isElementVisible(driver, registerButton);
        registerButton.click();
    }

    public void clickContactUs() {
        contactUsAlt.click();
    }


}