Feature: nesine test
  Scenario: kupon ekle çıkart
    Given nesine.com  sitesine girilir
    And Kullanıcı adı ve şifre girilerek, "Giriş" butonuna tıklanır
    And Editör Yorumları Menüsüne Tıklanır
    And Kuponu bulunan editörlerden biri seçilir, oluşturmuş olduğu kupon artı butonları kullanılarak sepete etkinlikler eklenir
    And Tüm etkinlikler eklendikten sonra kupon oran ve tutarı karşılaştırılır
    And Eklenen etkinlikler eksi butonları kullanılarak sepetten kaldırılır
    Then Hesabım menüsünden çıkış işlemi yapılır
  Scenario: yorum ekle çıkart
    Given nesine.com  sitesine girilir
    And Kullanıcı adı ve şifre girilerek, "Giriş" butonuna tıklanır
    And Kupondaş menüsüne tıklanır
    And Tüm paylaşımlar alanında ilk sırada bulunan kullanıcı kuponuna tıklanır
    And "Kupona yorum yaz" içeren input tıklanarak, açılan popup üzerinde yorum yazılır
    And Oluşturduğunuz yorumun üzerinde geldiğinizde X butonu görüntülenmektedir, tıklanarak oluşturulan yorum silinir
    Then Hesabım menüsünden çıkış işlemi yapılır
  Scenario: canlı sonuclar aç
    Given nesine.com  sitesine girilir
    And Kullanıcı adı ve şifre girilerek, "Giriş" butonuna tıklanır
    And Canlı Sonuçlar Menüsüne Tıklanır
    Then Canlı Sonuçlar Sayfası Açıldı mı
