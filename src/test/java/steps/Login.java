package steps;

import base.BaseLibrary;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import data.TestData;
import pages.MainPage;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class Login {
    @Given("^nesine.com  sitesine girilir$")
    public void OpenMainPage() throws Throwable {
        MainPage.open(TestData.url);
    }

    @And("^Kullanıcı adı ve şifre girilerek, \"Giriş\" butonuna tıklanır$")
    public void Login() throws Throwable {
        MainPage.setUserName(TestData.userName);
        MainPage.setPassword(TestData.password);
        MainPage.clickLogin();
        MainPage.isLogin();
    }
}
