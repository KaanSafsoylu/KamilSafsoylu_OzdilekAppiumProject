package Pages;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends TestBase {

    @Step("<id> ile Giris Yap Sayfasının Açıldığı Doğrulanır")
    public void AssertDetails(String id) {
        Assert.assertTrue(appiumDriver.findElement(By.id(id)).isDisplayed());
        MyLogger.logger.info("Giris Yap Sayfası Acildi");
    }

    @Step("<id> ID'li Kullanıcı Adı Kısmına <text> Girilir")
    public void sendUserName(String id, String text) {
        appiumDriver.findElement(By.id(id)).sendKeys(text);
        MyLogger.logger.info("Kullanici Adi Girildi");
    }

    @Step("<id> ID'li Şifre Kısmına <text> Girilir")
    public void sendPassword(String id, String text) {
        appiumDriver.findElement(By.id(id)).sendKeys(text);
        MyLogger.logger.info("Sifre Girildi");
    }

    @Step("<id> ID'li Geri Git Butonuna Tıklanır")
    public void backButton(String id) {
        appiumDriver.findElement(By.id(id)).click();
        MyLogger.logger.info("Geri Git Butonuna Tiklandi");
    }
}
