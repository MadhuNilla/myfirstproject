import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void openBrowser()
    {
        System.out.println("Opening the browser");
        //System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriverManager.chromedriver.setup();
        driver=new ChromeDriver(); //open the browser
        driver.get("https://www.facebook.com/"); // open the url
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @After
    public  void closeBrowser()
    {
        System.out.println("Closing Browser");
        driver.quit();
    }
}
}
