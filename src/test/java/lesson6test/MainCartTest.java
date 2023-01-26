package lesson6test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MainCartTest extends AbstractCartTest{

    @Test
    @Order(1)
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
    void mainDeliveryTest() {

        MainDelivery mainDelivery = new MainDelivery(getWebDriver());
        mainDelivery
                .clicknoodlesWok()
                .clickwokPanAsM()
                .clickwokPanAsMplus()
                .clickwokPanAsMclose()
                .clickopenCart()
                .clickbuttonDelivery;
        Assertions.assertEquals("https://sushiwok.ru/msk/cart/delivery/",getWebDriver().getCurrentUrl());
    }

    @Test
    @Order(6)
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
