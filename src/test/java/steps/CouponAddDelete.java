package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import data.TestData;
import pages.*;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class CouponAddDelete {

    @And("^Editör Yorumları Menüsüne Tıklanır$")
    public void clickEditorReviews() throws Throwable {
        MainPageUstMenu.clickBtnEditorYorumlari();
        EditorReviewsPage.isEditorReviewsPage();
    }
    @And("^Kuponu bulunan editörlerden biri seçilir, oluşturmuş olduğu kupon artı butonları kullanılarak sepete etkinlikler eklenir$")
    public void addCouponsToCart() throws Throwable
    {
        EditorReviewsPage.isHaveCoupons();
        EditorCouponsPage.addToCouponWithPlusButton();
        CouponCartPage.addToCouponDetail();
    }
    @And("^Tüm etkinlikler eklendikten sonra kupon oran ve tutarı karşılaştırılır$")
    public void checkRateAndAmount() throws Throwable
    {
        EditorCouponsPage.checkRateAmount();
    }
    @And("^Eklenen etkinlikler eksi butonları kullanılarak sepetten kaldırılır$")
    public void deleteMatch() throws Throwable
    {
        CouponCartPage.deleteCouponWithMinusButton();
    }
}
