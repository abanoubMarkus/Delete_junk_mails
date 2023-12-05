package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class gmail {


    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress","localhost:9222");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://mail.google.com/mail/u/1/#inbox");
        for (int i=0;i<100;i++) {
            driver.findElement(By.xpath("//span[@role='checkbox']")).click();
            driver.findElement(By.xpath("//div[@aria-label='Delete']//div[@class='asa']")).click();
            Thread.sleep(5000);

        }




    }
}