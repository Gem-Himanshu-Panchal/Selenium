package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Java\\Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:\\Users\\Himanshu\\Downloads\\Assignment.html");


        String start = "/html/body/table/tbody/tr[";
        String end = "]/td[1]";
        ArrayList<String> name=new ArrayList<>();
        for (int i = 2; i <= 18; i++) {
            String actualXpath = start + i + end;//nice
            WebElement element = driver.findElement(By.xpath(actualXpath));
            if(!name.contains(element.getText()))
                name.add(element.getText());
        }




            String aStart = "/html/body/table/tbody/tr[";
            String aEnd = "]/td[2]";
            ArrayList<String> age = new ArrayList<>();
            for (int i = 2; i <= 18; i++) {
                String xpath = aStart + i + aEnd;//nice
                WebElement ele = driver.findElement(By.xpath(xpath));
                if(!age.contains(ele.getText()))
                age.add(ele.getText());
            }

            System.out.println(name);
            System.out.println((age));

//            HashMap<String, Integer> map = new HashMap<>();
//            for (String elem : name) {
//                System.out.print(elem+" ");
//                if(!map.containsKey(elem))
//                {
//                    map.put(elem,0);
//                }
//                else{
//                    int val=map.get(elem);
//                    ++val;
//                    map.put(elem,val);
//                }
//
//            }
//            ArrayList<String> ans = new ArrayList<>();
//            for (String elem : map.keySet()) {
//
//                if (map.get(elem) == 1) {
//                    System.out.print(elem+" ");
//                }
//            }
//            for ( int i = 0; i < ans.size(); i++) {
//                System.out.print(ans.get(i) + " ");
//            }

        }
    }
