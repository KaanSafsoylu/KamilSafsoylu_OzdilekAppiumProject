package Pages;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class ProductPage extends TestBase {
    @Step("<int> Saniye Kadar Beklenir")
    public void waitForsecond(int s) throws InterruptedException {
        Thread.sleep(1000 * s);
        MyLogger.logger.info(s + " Saniye Kadar Beklendi");
    }

    @Step("<id> ID'li Kategoriler Butonuna Tıklanır")
    public void pressCategory(String id) {
        appiumDriver.findElement(By.id(id)).click();
        MyLogger.logger.info("Kategoriler Butonuna Tiklandi");
    }

    @Step("<id> ile Kategoriler Sayfasının Açıldığı Doğrulanır")
    public void AssertPage(String id) {
        Assert.assertTrue(appiumDriver.findElement(By.id(id)).isDisplayed());
        MyLogger.logger.info("Kategoriler Sayfasi Acildi");
    }

    @Step("<xpath> ile Menüden Kadın Seçeneğine Tıklanır")
    public void pressWoman(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
        MyLogger.logger.info(" Menuden Kadin Secenegine Tiklandi");
    }

    @Step("<xpath> ile Pantolon Kategorisine tıklanır")
    public void pressPants(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
        MyLogger.logger.info(" Pantolon Kategorisi Acildi ");
    }

    @Step("Sayfa Aşağı Kaydırılır")
    public void scrollDown() {
        int startx = 717, starty = 2569, endx = 723, endy = 490;
        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy)).release().perform();
        MyLogger.logger.info("Sayfa Asagi Dogru Kaydirildi");
    }

    @Step("Rastgele Ürün Seçimi Yapılır")
    public void selectRandom() {
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id=\"com.ozdilek.ozdilekteyim:id/imageView\"]\n"));
        Random random = new Random();
        int randomInt = random.nextInt(elements.size());
        elements.get(randomInt).click();
        MyLogger.logger.info("Random Urun Secildi");
    }

    @Step("<id> ile Ürün Detayları Sayfasının Açıldığı Doğrulanır")
    public void AssertDetails(String id) {
        Assert.assertTrue(appiumDriver.findElement(By.id(id)).isDisplayed());
        MyLogger.logger.info("Urun Detaylari Sayfasi Acildi");
    }

    @Step("<id> ID'li Favoriler Butonuna Tıklanır")
    public void pressFavs(String id) {
        appiumDriver.findElement(By.id(id)).click();
        MyLogger.logger.info("Favoriler Butonuna Tiklandi");
    }
    @Step("Rastgele Beden Seçimi Yapılır")
    public void selectRandomS(){
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//[@resource-id=\"com.ozdilek.ozdilekteyim:id/tvInSizeItem\"]\n"));
        Random random = new Random();
        int randomInt = random.nextInt(elements.size());
        elements.get(randomInt).click();
        MyLogger.logger.info("Rastgele Beden Secimi Yapildi");
    }

    @Step("<id> ID'li Sepete Ekle Butonuna Tıklanır")
    public void addCardBtn(String id) {
        appiumDriver.findElement(By.id(id)).click();
        MyLogger.logger.info("Sepete Ekle Butonuna Tiklandi");
    }
}