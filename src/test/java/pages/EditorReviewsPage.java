package pages;

import base.BaseLibrary;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class EditorReviewsPage extends BaseLibrary {
    static SelenideElement LBL_EDITORYORUMLARI_XPATH = $(By.xpath("//h1[text()='EDİTÖR YORUMLARI']"));
    static ElementsCollection LST_COUPONS = $$("div[class='owl-item active']");
    public static void isHaveCoupons(){
        int i=0;
        int count=0;
        while (count==0) {
            if (LST_COUPONS.get(i).$$("div[class='action'").first().$$("a[href='javascript:void(0)']").first().getAttribute("class").equals("ni ni-file-text-o no-data"))
            {i++;}
            else {
                count = Integer.valueOf(LST_COUPONS.get(i).$$("a[class='ni ni-file-text-o ']").first().text());
            }
        }
        LST_COUPONS.get(i).click();
    }

    public static void isEditorReviewsPage() {
        Assert.assertEquals("Editör yorumları sayfası açılamadı", LBL_EDITORYORUMLARI_XPATH.isDisplayed(), true);
    }
}
