package pages;

import base.BaseLibrary;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class MainPageUstMenu extends BaseLibrary {
    static SelenideElement BTN_EDITORYORUMLARI_XPATH = $(By.xpath("//li[@id='iddaa-nav']//a[text()='Editör Yorumları']"));
    static SelenideElement BTN_KUPONDAS_XPATH = $(By.xpath("//li[@id='iddaa-nav']//a[text()='Kupondaş']"));
    static SelenideElement BTN_CALISONUCLAR_XPATH = $(By.xpath("//li[@id='iddaa-nav']//a[text()='Canlı Sonuçlar']"));
    public static void clickBtnEditorYorumlari() {
        BTN_EDITORYORUMLARI_XPATH.click();
    }
    public static void clickBtnKupondas() {
        BTN_KUPONDAS_XPATH.click();
    }
    public static void clickBtnCanliSonuclar() {
        BTN_CALISONUCLAR_XPATH.click();
    }
}
