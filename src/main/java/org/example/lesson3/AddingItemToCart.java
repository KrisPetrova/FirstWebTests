package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AddingItemToCart {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://sushiwok.ru/msk/");


        WebElement webElement1 = driver.findElement(By.xpath(".//a[@href='/msk/menu/kitajskaja-lapsha-wok/']"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath(".//a[@data-id='11270']"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.xpath(".//*[@class='CardModal-module__modal-card--VKNAC CardModal-module__is-open--yeJQk']/div/div/div[4]/div[2]/div/div[2]"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.xpath(".//*[@class='close-modal-btn undefined']"));
        webElement4.click();

        WebElement webElement5 = driver.findElement(By.xpath(".//*[@class='main-menu__block']"));
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.xpath(".//button[@class='custom-button plus gray round']"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.xpath(".//*[@class='count' and text()='2']"));
        webElement7.click();

        driver.quit();
    }
}
