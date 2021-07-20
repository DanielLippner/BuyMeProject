package Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton  {
    private static WebDriver driver;

    public static WebDriver getDriverInstance(){
        try {
            if(driver == null){
//                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                driver = new ChromeDriver();
            }

            return driver;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            return driver;
        }
    }
}