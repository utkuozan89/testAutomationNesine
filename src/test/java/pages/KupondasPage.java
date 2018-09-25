package pages;

import base.BaseLibrary;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.Click;
import com.codeborne.selenide.commands.PressEnter;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class KupondasPage {
    static SelenideElement LBL_KUPONDAS_XPATH = $(By.xpath("//span[text()='Kupondaşlar']"));
    static SelenideElement BTN_ILKKUPON_XPATH = $(By.xpath("//div[@id='feedcontainer']//div[@class='feeds feeditem'][1]"));
    static SelenideElement BTN_COMMENTAREA_XPATH = $(By.xpath("//div[@class='kupondas-comments-mask']"));
    static SelenideElement TXT_COMMENTAREA_XPATH = $(By.xpath("//div[@class='modal-content']//div[@class='kupondas-comments-box']//div[@class='write-comment comment-allow']//div[@class='write-input']//input[@class='form-control CText']"));
    static SelenideElement BTN_DELETECOMMENT_XPATH = $(By.xpath("//div[@class='modal-body no-padding customui-all']//span[@class='comment-settings-btn']//i[@action='delete']"));
    static SelenideElement LBL_COMMENT_XPATH = $(By.xpath("//div[@class='col-sm-6 comments-area']//div[@class='col-xs-10 comment']"));
    static SelenideElement PUP_EVET_XPATH = $(By.xpath("//div[@class='popover-content']//div[@class='pull-right']//a[text()='Evet']"));
    static SelenideElement BTN_TAKIPET_XPATH = $(By.xpath("//strong[text()='Takip Et']"));
    public static void isKupondasPage() {
        Assert.assertEquals("Kupondaş sayfası açılamadı", LBL_KUPONDAS_XPATH.isDisplayed(), true);
    }
    public static void clickFirstCoupon() {
        BTN_ILKKUPON_XPATH.click();
    }
    public static void clickCommentArea() {
        if (BTN_TAKIPET_XPATH.exists())
        {
            BTN_TAKIPET_XPATH.click();
        }
        BTN_COMMENTAREA_XPATH.click();
    }
    public static void writeComment() {
        TXT_COMMENTAREA_XPATH.setValue("Başarılar...");
        TXT_COMMENTAREA_XPATH.pressEnter();
    }
    public static void deleteComment() {
        LBL_COMMENT_XPATH.click();
        BTN_DELETECOMMENT_XPATH.click();
        PUP_EVET_XPATH.click();
    }
}
