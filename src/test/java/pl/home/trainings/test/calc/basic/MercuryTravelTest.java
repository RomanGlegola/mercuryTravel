package pl.home.trainings.test.calc.basic;

import org.junit.Test;
import pl.sda.training.MercuryTravelMain;
import pl.sda.training.RegisterPage;

import static org.junit.Assert.assertTrue;

public class MercuryTravelTest extends BaseTest {

    @Test
    public void testOfTshirt() {
        MercuryTravelMain auMain = new MercuryTravelMain(driver);
        auMain.clickRegisterButton();
    }

    @Test
    public void testOfContactUs() throws InterruptedException {
        MercuryTravelMain mercuryTravelMain = new MercuryTravelMain(driver);
        mercuryTravelMain.clickRegisterButton();
        RegisterPage registerPage = new RegisterPage(driver);
        assertTrue(registerPage.isEmail());
        registerPage.addFirstName();
        registerPage.addLastName();
        registerPage.addPhone();
        registerPage.addEmailAddress();
        registerPage.addAdress();
        registerPage.addCity();
        registerPage.addCountry();
        registerPage.addPostalCode();
        registerPage.addUserName();
    }
}