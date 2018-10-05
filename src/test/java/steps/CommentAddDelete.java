package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.EditorReviewsPage;
import pages.KupondasPage;
import pages.MainPageUstMenu;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class CommentAddDelete {
    @And("^Kupondaş menüsüne tıklanır$")
    public void clickKupondas() throws Throwable {
        MainPageUstMenu.clickBtnKupondas();
        KupondasPage.isKupondasPage();
    }
    @And("^Tüm paylaşımlar alanında ilk sırada bulunan kullanıcı kuponuna tıklanır$")
    public void clickFirstCoupon() throws Throwable {
        KupondasPage.clickFirstCoupon();
    }
    @And("^\"Kupona yorum yaz\" içeren input tıklanarak, açılan popup üzerinde yorum yazılır$")
    public void clickCommentAreaAndWriteComment() throws Throwable {
        KupondasPage.clickCommentArea();
        KupondasPage.writeComment();
    }
    @And("^Oluşturduğunuz yorumun üzerinde geldiğinizde X butonu görüntülenmektedir, tıklanarak oluşturulan yorum silinir$")
    public void clickDeleteComment() throws Throwable {
        KupondasPage.deleteComment();
    }
}
