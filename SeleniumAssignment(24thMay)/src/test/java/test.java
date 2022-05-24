import org.apache.commons.exec.CommandLine;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import javax.swing.*;

public class test {
    @Test
    public static void main(String[] args) throws InterruptedException {

        //Setting up chrome driver
        ChromeOptions options = new ChromeOptions();

//Add chrome switch to disable notification - "**--disable-notifications**"
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://www.irctc.co.in/nget/train-search");

        driver.manage().window().maximize();
//Popup accepting
       driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();

//Entering from
        WebElement fromLoc = driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
        fromLoc.sendKeys("NEW DELHI - NDLS");
//Entering destination
        WebElement toLoc = driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input"));
        toLoc.sendKeys("CHANDIGARH - CDG");
//Tackling date
WebElement date= driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input"));
date.click();

//Selecting dates
driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[4]/td[6]/a")).click();

//Selecting train class
driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div")).click();
driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[4]/div/ul/p-dropdownitem[3]/li/span")).click();


//Jumping to next page after filling details
        driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button")).click();

Thread.sleep(2000);
        //Selecting First Ac class of 3rd train



driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[5]/div[3]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td[3]/div/div[2]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[5]/div[3]/div[1]/app-train-avl-enq/div[1]/div[7]/div[1]/div[3]/table/tr/td[6]/div")).click();

Thread.sleep(2000);
//Clicking booking button
        driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[3]/div[1]/app-train-avl-enq/div[2]/div/span/span[1]/button")).click();
//Agreeing
        driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/p-confirmdialog[1]/div/div/div[3]/button[1]/span[2]")).click();
driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/p-confirmdialog[2]/div/div/div[3]/button[1]/span[2]")).click();



//Entering login details
driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/app-login/p-dialog[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Himu_1808");
driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/app-login/p-dialog[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Killvibes@18");

//Entering captcha
//        driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/app-login/p-dialog[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/div[4]/div/app-nlp-captcha/div/div[2]/div/div[3]/div[1]/input")).sendKeys("i k m v");

        driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/app-login/p-dialog[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/span/button")).click();
    }

//    Login button and captcha not working
}
