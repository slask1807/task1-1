package com.jqueryui;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.SocketOption;

public class FirstTask {
    public ChromeDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:/rex/src/main/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("test start");
    }
    @Test
    public void firstTest () {

        driver.get("https://jqueryui.com/demos/");
        WebElement Interactions= driver.findElement(By.cssSelector("#sidebar > aside:nth-child(1) > h3"));
        String currentURL= driver.getCurrentUrl();
        System.out.println("Interactions verify");
        
//        String ExpectedTitle = "Interactions";
//        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }
    @Test
   public void secondTest () {
   driver.get("https://jqueryui.com/demos/");
   WebElement Interactions = driver.findElement(By.cssSelector("#sidebar > aside:nth-child(2) > h3"));
   String currentURL = driver.getCurrentUrl();
   System.out.println("Widgets verify");
   }
    @Test
    public void thirdTest () {
        driver.get("https://jqueryui.com/demos/");
        WebElement Interactions = driver.findElement(By.cssSelector("#sidebar > aside:nth-child(3) > h3"));
        String currentURL = driver.getCurrentUrl();
        System.out.println("Effects verify");
    }
    @Test
    public void fourth () {
        driver.get("https://jqueryui.com/demos/");
        WebElement Interactions = driver.findElement(By.cssSelector("#sidebar > aside:nth-child(4) > h3"));
        String currentURL = driver.getCurrentUrl();
        System.out.println("Utilities verify");
    }
    @After
    public void close(){
        System.out.println("test close");
        driver.quit();
    }
}

