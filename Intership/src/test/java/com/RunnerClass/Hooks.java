package com.RunnerClass;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Hooks {
     WebDriver driver;

    public Hooks(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void logindetails(){
        driver = new FirefoxDriver();
        driver.get("http://3.13.126.58/AMS3.0/home");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputEmail")).sendKeys("admin@gic.com");
        driver.findElement(By.id("inputPassword")).sendKeys("Admin123");
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
        driver.get("http://3.13.126.58/AMS3.0/home");
    }
}
