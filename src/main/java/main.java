
import Drivers.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class main {
    public static void main(String[] args) throws InterruptedException, AWTException {
        Registration();
        Home();
        Pick();
        Sender();
        bonus();
    }
    public static void Registration(){
        WebDriver  webDriver =  WebDriverSingleton.getDriverInstance();
        webDriver.get("https://buyme.co.il/");
        WebElement webElement = WebDriverSingleton.getDriverInstance().findElement(By.className("seperator-link"));
        webElement.click();
        WebElement webElement2 = webDriver.findElement(By.className("text-link"));
        webElement2.click();
        WebElement webElement3 = getIdElement(webDriver,"ember1440");
        webElement3.sendKeys("daniel");
        getIdElement(webDriver,"ember1443").sendKeys("email@gmail.com");
        getIdElement(webDriver,"ember1446").sendKeys("Pass1234");
        getIdElement(webDriver,"ember1448").sendKeys("Pass1234");
        getIdElement(webDriver,"ember1451").click();
    }
    public static void Home() throws InterruptedException {
        WebDriver  webDriver =  WebDriverSingleton.getDriverInstance();
        webDriver.get("https://buyme.co.il/");
        getClassElement(webDriver,"chosen-single").click();
        WebElement webElement = getIdElement(webDriver,"ember986");
        Select select=new Select(webElement);
        Actions action = new Actions(webDriver);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.DOWN).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();
        getIdElement(webDriver,"ember1001_chosen").click();
        action = new Actions(webDriver);
        WebElement webElement2 = getIdElement(webDriver,"ember1001");
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.DOWN).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();
        getIdElement(webDriver,"ember1011_chosen").click();
        action = new Actions(webDriver);
        WebElement webElement3 = getIdElement(webDriver,"ember1011");
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.DOWN).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();
        getIdElement(webDriver,"ember1046").click();

    }
    public static void Pick() throws InterruptedException {
        WebDriver  webDriver =  WebDriverSingleton.getDriverInstance();
        webDriver.get("https://buyme.co.il/");
        getIdElement(webDriver,"ember1145").click();
        Thread.sleep(3000);
        getIdElement(webDriver,"ember1524").click();
        Thread.sleep(3000);
        getIdElement(webDriver,"ember1971").sendKeys("2000");
        getIdElement(webDriver,"ember1979").click();
//        Sender();
    }
    public static void Sender() throws InterruptedException, AWTException {
        WebDriver  webDriver =  WebDriverSingleton.getDriverInstance();
        webDriver.get("https://buyme.co.il/money/1290005?price=2000");
        getIdElement(webDriver,"ember1220").sendKeys("daniel");
        getClassElement(webDriver,"selected-name").click();
        Actions action = new Actions(webDriver);
        Thread.sleep(3000);
        WebElement webElement3 = getIdElement(webDriver,"ember1551");
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.DOWN).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();
        getIdElement(webDriver,"ember1536").click();
        WebElement webElement = getNameElement(webDriver,"eventType");
        action.sendKeys(Keys.ENTER).build().perform();
        action.doubleClick().build().perform();
        getIdElement(webDriver,"ember1243").click();
        getIdElement(webDriver,"ember1601").sendKeys("daniels");
        getClassElement(webDriver,"circle-area").click();
        action.sendKeys(Keys.F12).build().perform();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("/html/body")).click();
        getIdElement(webDriver,("ember891")).click();
        getIdElement(webDriver,("ember1602")).click();
        getIdElement(webDriver,("ember1187")).click();
        getIdElement(webDriver,("ember1562")).click();
        getIdElement(webDriver,("ember1581")).click();
        getIdElement(webDriver,("ember1602")).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F12);
        new WebDriverWait(webDriver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sms-mobile']"))).sendKeys("0501231321");
        new WebDriverWait(webDriver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ember1610']"))).sendKeys("0501231321");
        getIdElement(webDriver,("ember1602")).click();

    }
    public static void bonus(){
        WebDriver  webDriver =  WebDriverSingleton.getDriverInstance();
        webDriver.get("https://buyme.co.il/");
        WebElement webElement = WebDriverSingleton.getDriverInstance().findElement(By.className("seperator-link"));
        webElement.click();
        WebElement webElement2 = WebDriverSingleton.getDriverInstance().findElement(By.id("ember1436"));
        webElement2.click();
    }

    static WebElement getClassElement(WebDriver webDriver,String className){
        return webDriver.findElement(By.className(className));
    }
    static WebElement getNameElement(WebDriver webDriver,String Name){
        return webDriver.findElement(By.name(Name));
    }
    static WebElement getIdElement(WebDriver webDriver,String idName){
        return webDriver.findElement(By.id(idName));
    }
}
