package Pages ;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MainPage extends TestBase  {

    @Step("<id> ile Uygulamanın Açıldığı Kontrol Edilir")
    public void Assert(String id){
        Assert.assertTrue(appiumDriver.findElement(By.id(id)).isDisplayed());
        MyLogger.logger.info("Uygulama Acildi");
    }

    @Step("<int> MiliSaniye Kadar Beklenir")
    public void waitForSecond(int s) throws InterruptedException {
        Thread.sleep(s);
        MyLogger.logger.info(s+" MiliSaniye Kadar Beklendi");
    }

    @Step("<id> ID'li Alışverişe Başla Butonuna Tıklanır")
    public void startShop (String id){
        appiumDriver.findElement(By.id(id)).click();
        MyLogger.logger.info("Alisverise Basla Butonuna Tiklandi");
    }
    @Step("<id> ile Alışveriş Sayfasının Açıldığı Doğrulanır")
    public void AssertPag(String id) {
        Assert.assertTrue(appiumDriver.findElement(By.id(id)).isDisplayed());
        MyLogger.logger.info("Alisverise Basla Sayfasi Acildi");
    }
}
