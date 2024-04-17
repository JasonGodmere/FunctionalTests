package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import static org.testng.Assert.*;

public class LoginTest extends BaseTests{

    @Test
    public void verifySuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        assertEquals(loginPage.login("admin@hec.com",
                "hecabc123").getTitle(), "Dashboard | EnergyServices - Admin | EnergyService");
    }
}
