package pages;

import base.BaseLibrary;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class EditorCouponsPage extends BaseLibrary {
    static ElementsCollection LST_MATCH = $$("div[class='coupon-body couponSlide']");
    static ElementsCollection LST_COUPONFOOTER = $$("div[class='coupon-footer']");
    static SelenideElement LBL_AMOUNT_XPATH = $(By.xpath("//div[@class='playStep playStep1']//b[@class='columnAmount']"));
    static SelenideElement LBL_RATE_XPATH = $(By.xpath("//div[@class='playStep playStep1']//b[@class='totalOdd']"));
    public static double amountForEditorCoupon,amountForCartCoupon;
    public static String rateForEditorCoupon,rateForCartCoupon;
    public static void addToCouponWithPlusButton(){
        int matchCount = LST_MATCH.get(0).$$("dl[class='event-row']").size();
        for (int i = 0;i<matchCount;i++)
        {
            LST_MATCH.get(0).$$("dl[class='event-row']").get(i).$$("dd[class='status']").get(0).click();
        }
    }
    public static void checkRateAmount(){
        rateForEditorCoupon = LST_COUPONFOOTER.first().$("b").text();

        String[] amountForEditorCouponSplit = LST_COUPONFOOTER.first().$$("dd").get(2).$("b").text().split(" ");
        amountForEditorCoupon = Double.valueOf(amountForEditorCouponSplit[0]);

        String[] amountForCartCouponSplit = LBL_AMOUNT_XPATH.text().split(",");
        amountForCartCoupon = Double.valueOf(amountForCartCouponSplit[0]);

        rateForCartCoupon = LBL_RATE_XPATH.text();
        Assert.assertEquals(rateForCartCoupon,rateForEditorCoupon);
        Assert.assertEquals(amountForCartCoupon,amountForEditorCoupon);
    }
}
