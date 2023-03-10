package org.example.lesson5test;
/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    public static WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
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
    }

    @AfterAll
    static void close(){
        driver.quit();
    }

    static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        AbstractTest.driver = driver;
    }
}


 */