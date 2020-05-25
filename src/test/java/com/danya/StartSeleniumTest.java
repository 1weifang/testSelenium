package com.danya;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartSeleniumTest {

    @Test
    void startSelenium(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\huawei\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver wb = new ChromeDriver();
        wb.get("https://home.testing-studio.com/");
        wb.findElement(By.xpath("//span[contains(text(),'登录')]")).click();

    }

}
