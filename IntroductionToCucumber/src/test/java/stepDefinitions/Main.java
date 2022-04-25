package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {


WebDriver driver;
    @Given("^open google$")
    public void open_google() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hi.panchal\\Downloads\\chromedriver_win32\\chromedriver.exe");
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");

    }
    @Then("^type gemini solutions and search$")
    public void type_gemini_solutions_and_search() {

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Gemini Solutions");
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();



    }
    @When("^search open gemini official website$")
    public void search_open_gemini_official_website() {
driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();


    }
    @Then("extract text under {string} using {string}")
    public void extract_text_under_service(String txt , String xPath) throws InterruptedException {
String s = driver.findElement(By.xpath(xPath)).getText();
        System.out.println("Extracting text from:"+txt);
        System.out.println(s);

Thread.sleep(2000);
driver.quit();
    }
}
