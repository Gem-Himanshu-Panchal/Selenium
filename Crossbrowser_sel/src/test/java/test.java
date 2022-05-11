
import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;

public class test {
    WebDriver driver;
    @Test
    @Parameters("safari")
    public void browserLaunch(String browserName) throws Exception {
        Instant start = Instant.now();

        if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Selenium Drivers\\Firefox\\geckodriver.exe");
            driver =new FirefoxDriver();
        }

        else if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\Chrome\\chromedriver.exe");
            driver =new ChromeDriver();
        }

//        else if(browserName.equalsIgnoreCase("IE")){
//            System.setProperty("webdriver.ie.driver","C:\\Users\\hi.panchal\\Downloads\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
//            driver =new InternetExplorerDriver();
//        }

        else{
            throw new Exception("Browser not found");
        }
        Instant end = Instant.now();
        driver.manage().window().maximize();
        driver.get("https://www.geminisolutions.com/");

        //Printing title
        System.out.println(driver.getTitle());
        Duration timeElapsed = Duration.between(start, end);

//        Printing time taken for execution
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");

    }

}
