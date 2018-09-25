package steps;

import cucumber.api.java.en.Then;
import pages.MainPage;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class Logout {
    @Then("^Hesabım menüsünden çıkış işlemi yapılır$")
    public void logout() throws Throwable
    {
        MainPage.logout();
        MainPage.isLogout();
    }
}
