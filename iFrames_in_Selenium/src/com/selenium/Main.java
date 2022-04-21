package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //WebDriver Setup
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi.panchal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        //Point 2
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
        driver.switchTo().frame(1);//Entering 2nd iFrame of html page
        driver.switchTo().frame(0);//Entering iframe in iframe
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input"))
        .sendKeys("Value added within iFrame in iFrame");//Putting value in inbox
        Thread.sleep(1000);


        //Point 3 Coming out o iframe in iframe to parent window
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
        Thread.sleep(1000);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Himanshu");

    }
}
