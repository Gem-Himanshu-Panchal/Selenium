package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class Main {

    public static void main(String[] args) {

                System.setProperty("webdriver.chrome.driver","D:\\Selenium Java\\Drivers\\Chrome\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.facebook.com/reg/");

                WebElement firstName =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input"));
                WebElement lastName = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));

                Actions a = new Actions(driver);
                a.moveToElement(firstName).click().keyDown(Keys.SHIFT).sendKeys("Himanshu");
                a.keyUp(Keys.SHIFT).build().perform();

                a.keyDown(Keys.CONTROL).sendKeys("a");
                a.sendKeys("c");



                a.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v");
                a.keyUp(Keys.CONTROL).build().perform();

                WebElement phn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
                a.moveToElement(phn).click().sendKeys("8847246618").build().perform();

                WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
                a.moveToElement(password).click().sendKeys("password").build().perform();

            }

        }

