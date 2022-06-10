import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class BrokenLinkFinder {
    public static void main(String[] args) throws IOException {

//      Setting up my Chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://phptravels.com/demo/");
        driver.manage().window().maximize();



//      1. Get the list of all links
        List<WebElement> list = driver.findElements(By.tagName("a"));

        list.addAll(driver.findElements(By.tagName("img")));

        List<WebElement> activeLinks = new ArrayList<>();

//        2. Iterate through list and exclude all links/img that doesn't have any href attribute
        for (int i=0;i<list.size();i++){
            if(list.get(i).getAttribute("href")!=null && !list.get(i).getAttribute("href").contains("javascript")){
                activeLinks.add(list.get(i));
            }
        }
        System.out.println("Size of all links is : "+list.size());
        System.out.println("Size of active links is : "+activeLinks.size());

//        3. Checking the href URL,with httpconnection api:
        for(int j=0;j<activeLinks.size();j++){
            HttpsURLConnection connection = (HttpsURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
            connection.connect();
            String resp = connection.getResponseMessage();
            connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href")+"--->"+resp);
        }
    }
}
