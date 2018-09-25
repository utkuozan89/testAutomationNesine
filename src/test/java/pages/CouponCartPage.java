package pages;

import base.BaseLibrary;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.concurrent.locks.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class CouponCartPage extends BaseLibrary {
    static ElementsCollection LST_COUPONFOOTER = $$("div[class='coupon-footer']");
    static SelenideElement BTN_COUPONBASKET_ID = $(By.id("coupon-info"));
    static SelenideElement CMB_MISLI_XPATH = $(By.xpath("//select[@class='ddlMultiply input-xs form-control']"));
    static ElementsCollection LST_MATCH = $$("div[class='couponEvent']");
    public static void addToCouponDetail(){
        BTN_COUPONBASKET_ID.click();
        if(LST_COUPONFOOTER.first().$$("dl[class='footer-info']").first().$$("dd").get(1).$$("b").first().exists())
        {
            String detailForSystem = LST_COUPONFOOTER.first().$$("dl[class='footer-info']").first().$$("dd").get(1).$$("b").first().text();
            String detailForFold = LST_COUPONFOOTER.first().$$("dl[class='footer-info']").first().$$("dd").get(1).$$("b").first().text();
            detailForSystem = detailForSystem.replaceAll("\\s","");
            int indexForSystem = detailForSystem.indexOf("(");
            detailForSystem = detailForSystem.substring(0, indexForSystem);
            String[] outputForSystem = detailForSystem.trim().split(",");
            for (int i = 0;i<outputForSystem.length;i++)
            {
                $(By.xpath("//div[@class='systemCenter']//a[text()='"+outputForSystem[i]+"']")).click();
            }
            detailForFold = detailForFold.replaceAll("\\s","");
            int indexForFold = detailForFold.indexOf("(")+1;
            int lastIndexForFold = detailForFold.indexOf("M");
            detailForFold = detailForFold.substring(indexForFold, lastIndexForFold);
            CMB_MISLI_XPATH.selectOption(detailForFold);
        }
        else {
            String couponAmount = LST_COUPONFOOTER.first().$$("dl[class='footer-info']").first().$$("dd").get(2).$$("b").first().text();
            couponAmount = couponAmount.replaceAll("\\s", "");
            int indexForSystem = couponAmount.indexOf("T");
            couponAmount = couponAmount.substring(0, indexForSystem);
            CMB_MISLI_XPATH.selectOption(couponAmount);
        }
    }
    public static void deleteCouponWithMinusButton(){
        int matchCount = LST_MATCH.size();
        for (int i = 0;i<matchCount;i++)
        {
            LST_MATCH.get(i).$$("div[class='eventCancel']").first().click();
        }
    }
}
