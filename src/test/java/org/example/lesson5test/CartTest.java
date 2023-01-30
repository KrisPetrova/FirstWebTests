package org.example.lesson5test;
/*

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class CartTest extends AbstractTest{

    @Test
    @Order(1)
    void addToCart(WebDriver driver) throws InterruptedException {
        WebElement webElement6 = driver.findElement(By.xpath(".//*[@class='cart-products']"));
        webElement6.getText();

        Thread.sleep(100);
        Assertions.assertTrue(driver.findElements(By.xpath(".//p[text()='Wok паназиатский М']/..")).size() > 0);
    }

    @Test
    @Order(2)
    void addItemToCart(WebDriver driver) {
        WebElement webElement7 = driver.findElement(By.xpath(".//button[@class='custom-button plus gray round']"));
        webElement7.click();

        WebElement webElement8 = driver.findElement(By.xpath(".//*[@class='count' and text()='2']"));
        webElement8.click();

        Assertions.assertTrue(driver.findElements(By.xpath(".//*[@class='count' and text()='2']")).size() > 0);
    }

    @Test
    @Order(3)
    void emptyCart(WebDriver driver) {
        WebElement webElement9 = driver.findElement(By.xpath(".//*[@class='link_underlined']"));
        webElement9.click();

        WebElement webElement10 = driver.findElement(By.xpath(".//*[@class='sw-button' and text()='Очистить']"));
        webElement10.click();

        WebElement webElement11 = driver.findElement(By.xpath(".//*[text()='Твоя корзина пуста ...']"));
        webElement11.getText();

        Assertions.assertTrue(driver.findElements(By.xpath(".//*[text()='Твоя корзина пуста ...']")).size() > 0);
    }

    @Test
    @Order(4)
    void removeCart(WebDriver driver) {
        WebElement webElement12 = driver.findElement(By.xpath(".//p[text()='Wok паназиатский М']/../.."));
        webElement12.getText();

        WebElement webElement13 = driver.findElement(By.xpath(".//button[@class='close-btn']"));
        webElement13.click();

        WebElement webElement11 = driver.findElement(By.xpath(".//*[text()='Твоя корзина пуста ...']"));
        webElement11.getText();

        Assertions.assertTrue(driver.findElements(By.xpath(".//*[text()='Твоя корзина пуста ...']")).size() > 0);
    }

    @Test
    @Order(5)
    void delivery(WebDriver driver) {
        WebElement webElement14 = driver.findElement(By.xpath(".//a[@href='/msk/cart/delivery/']"));
        webElement14.click();

        Assertions.assertTrue(driver.findElements(By.xpath(".//a[@href='/msk/cart/delivery/']")).size() > 0);
    }

    @Test
    @Order(6)
    void pickUp(WebDriver driver) {
        WebElement webElement15 = driver.findElement(By.xpath(".//a[@href='/msk/cart/pickup/']"));
        webElement15.click();

        Assertions.assertTrue(driver.findElements(By.xpath(".//a[@href='/msk/cart/pickup/']")).size() > 0);
    }
}
*/
