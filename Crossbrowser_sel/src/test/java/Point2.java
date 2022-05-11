import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Point2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://techtuts.in/");
        driver.manage().window().maximize();

        // Counting number of iFrames
        List<WebElement> list = driver.findElements(By.tagName("iframe"));
        System.out.println(list.size());


        //Switching to different iFrames
        for(int i=0;i< list.size();i++){
            driver.switchTo().defaultContent();
            driver.switchTo().frame(i);
        }

        //Switching to google_esf but not working
        driver.switchTo().frame("google_esf");
        driver.findElement(By.tagName("body")).click();


        //Not working
        driver.switchTo().defaultContent();
        driver.switchTo().frame(list.size()-1);
        driver.findElement(By.tagName("body")).click();
    }
}
