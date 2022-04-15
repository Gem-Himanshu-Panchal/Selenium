package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium Java\\Drivers\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        
        WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

        searchbox.sendKeys("Text book");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));

        searchButton.click();

        WebElement textBookname = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span"));

        String name= textBookname.getText();

        System.out.println("Text Book Name is : "+name);

    }
}
