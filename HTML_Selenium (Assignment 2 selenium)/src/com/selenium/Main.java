package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver","D:\\Selenium Java\\Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:\\Users\\Himanshu\\Downloads\\Dropdown.html");

        WebElement day = driver.findElement(By.xpath("//*[@id=\"dob-day\"]"));
        Select daydrop = new Select(day);
        daydrop.selectByIndex(6);

        WebElement month = driver.findElement(By.xpath("//*[@id=\"dob-month\"]"));
        Select monthdrop = new Select(month);
        monthdrop.selectByIndex(6);

        WebElement year = driver.findElement(By.xpath("//*[@id=\"dob-year\"]"));
        Select yeardrop = new Select(year);
        yeardrop.selectByIndex(9);

        List<WebElement> list=yeardrop.getOptions();

boolean isTrue =true;
        for(int i=2;i<list.size()-1;i++)
        {
            if(Integer.parseInt(list.get(i).getText()) - Integer.parseInt(list.get(i+1).getText())>0)
            {
                isTrue=false;break;
            }
        }
if(isTrue)
    System.out.println("not in Decending");
else
    System.out.println("not in Acending");
    }
}
