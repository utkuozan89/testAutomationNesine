package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class CanliSonuclarPage {
    static SelenideElement LBL_CANLISONUCLAR_ID = $(By.id("btnLive"));
    public static void isCanliSonuclarPage() {
        Assert.assertEquals("Canlı Sonuçlar sayfası açılamadı", LBL_CANLISONUCLAR_ID.isDisplayed(), true);
    }
}
