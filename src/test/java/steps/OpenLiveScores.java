package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CanliSonuclarPage;
import pages.KupondasPage;
import pages.MainPageUstMenu;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class OpenLiveScores {
    @And("^Canlı Sonuçlar Menüsüne Tıklanır$")
    public void clickCanliSonuclar() throws Throwable {
        MainPageUstMenu.clickBtnCanliSonuclar();
    }
    @Then("^Canlı Sonuçlar Sayfası Açıldı mı$")
    public void isCanliSonuclar() throws Throwable
    {
        CanliSonuclarPage.isCanliSonuclarPage();
    }
}
