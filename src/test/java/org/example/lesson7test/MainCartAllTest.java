package org.example.lesson7test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.example.lesson6.MainSushiCart;

@Story("Моя пользовательская история")
public class MainCartAllTest extends AbstractCartAllTest {

    @Test
    @Order(1)
    @DisplayName("Добавление в корзину")
    @Severity(SeverityLevel.BLOCKER)
    void mainAddToCartTest(){
        MainAddToCart mainAddToCart = new MainAddToCart(getWebDriver());
        mainAddToCart
                .clicknoodlesWok()
                .clickwokPanAsM()
                .clickwokPanAsMplus()
                .clickwokPanAsMclose()
                .clickopenCart();
        Assertions.assertEquals("https://sushiwok.ru/msk/cart/",getWebDriver().getCurrentUrl());
    }

    @Test
    @Order(2)
    @DisplayName("Увеличение количества в корзине")
    @Severity(SeverityLevel.BLOCKER)
    void mainAddItemToCartTest() {

        MainAddItemToCart mainAddItemToCart = new MainAddItemToCart(getWebDriver());
        mainAddItemToCart
                .clicknoodlesWok()
                .clickwokPanAsM()
                .clickwokPanAsMplus()
                .clickwokPanAsMclose()
                .clickopenCart()
                .clickcartButtonPlus()
                .clicktwoWokPanAsM();
        Assertions.assertEquals("https://sushiwok.ru/msk/cart/",getWebDriver().getCurrentUrl());
    }

    @Test
    @Order(3)
    @DisplayName("Очистка корзины")
    @Severity(SeverityLevel.BLOCKER)
    void mainEmptyCartTest() {

        MainemptyCart mainemptyCart = new MainemptyCart(getWebDriver());
        mainemptyCart
                .clicknoodlesWok()
                .clickwokPanAsM()
                .clickwokPanAsMplus()
                .clickwokPanAsMclose()
                .clickopenCart()
                .clickemptyCart()
                .clickbuttonEmpty()
                .clickyourCartIsEmpty();
        Assertions.assertEquals("https://sushiwok.ru/msk/cart/",getWebDriver().getCurrentUrl());
    }

    @Test
    @Order(4)
    @DisplayName("Удаление товара из корзины")
    @Severity(SeverityLevel.BLOCKER)
    void mainRemoveCartTest() {

        MainRemoveCart mainRemoveCart = new MainRemoveCart(getWebDriver());
        mainRemoveCart
                .clicknoodlesWok()
                .clickwokPanAsM()
                .clickwokPanAsMplus()
                .clickwokPanAsMclose()
                .clickopenCart()
                .clickbuttonCloseDeleteWok
                .clickyourCartIsEmpty();
        Assertions.assertEquals("https://sushiwok.ru/msk/cart/",getWebDriver().getCurrentUrl());
    }


    @Test
    @Order(5)
    @DisplayName("Доставка")
    @Severity(SeverityLevel.BLOCKER)
    void mainDeliveryTest() {

        MainDelivery mainDelivery = new MainDelivery(getWebDriver());
        mainDelivery
                .clicknoodlesWok()
                .clickwokPanAsM()
                .clickwokPanAsMplus()
                .clickwokPanAsMclose()
                .clickopenCart()
                .clickbuttonDelivery();
        Assertions.assertEquals("https://sushiwok.ru/msk/cart/delivery/",getWebDriver().getCurrentUrl());
    }

    @Test
    @Order(6)
    @DisplayName("Самовывоз")
    @Severity(SeverityLevel.BLOCKER)
    void mainPickUpTest() {

        MainPickUp mainPickUp = new MainPickUp(getWebDriver());
        mainPickUp
                .clicknoodlesWok()
                .clickwokPanAsM()
                .clickwokPanAsMplus()
                .clickwokPanAsMclose()
                .clickopenCart()
                .clickbuttonPickUp();
        Assertions.assertEquals("https://sushiwok.ru/msk/cart/pickup/",getWebDriver().getCurrentUrl());
    }
}
