package pages;

import base.BaseLibrary;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class MainPage extends BaseLibrary {
    static SelenideElement TXTUSERNAME_ID = $(By.id("txtUsername"));
    static SelenideElement TXTPASSWORD_ID = $(By.id("realpass"));
    static SelenideElement BTNLOGIN_XPATH = $(By.xpath("//form[@class='lgnform']//a[text()='GİRİŞ']"));
    static SelenideElement BTNHESABIM_XPATH = $(By.xpath("//a[normalize-space(text())='Hesabım']"));
    static SelenideElement BTN_CIKIS_XPATH = $(By.xpath("//a[text()='Çıkış']"));
    public static void open(String url) {
        Selenide.open(url);
    }

    public static void setUserName(String userName) {
        TXTUSERNAME_ID.setValue(userName);
    }

    public static void setPassword(String password) {
        TXTPASSWORD_ID.setValue(password);
    }

    public static void clickLogin() {
        BTNLOGIN_XPATH.click();
    }

    public static void isLogin() {
        Assert.assertEquals("Login İşlemi Başarısız", BTNHESABIM_XPATH.isDisplayed(), true);
    }
    public static void logout() {
       BTNHESABIM_XPATH.click();
       BTN_CIKIS_XPATH.click();
    }
    public static void isLogout() {
        Assert.assertEquals("Login İşlemi Başarısız", !BTNHESABIM_XPATH.isDisplayed(), true);
    }
}
