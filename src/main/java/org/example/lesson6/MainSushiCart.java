package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainSushiCart extends AbstractSushiPage {

    @FindBy(xpath = ".//a[@href='/msk/menu/kitajskaja-lapsha-wok/']")  //webElement1
    private WebElement noodlesWok;

    @FindBy(xpath = ".//a[@data-id='11270']")  //webElement2
    private WebElement wokPanAsM;

    @FindBy(xpath = ".//*[@class='CardModal-module__modal-card--VKNAC CardModal-module__is-open--yeJQk']/div/div/div[4]/div[2]/div/div[2]")  //webElement3
    private WebElement wokPanAsMplus;

    @FindBy(xpath = ".//*[@class='close-modal-btn undefined']")  //webElement4
    private WebElement wokPanAsMclose;

    @FindBy(xpath = ".//*[@class='main-menu__block']")  //webElement5
    private WebElement openCart;

    @FindBy(xpath = ".//*[@class='cart-products']")  //webElement6
    private WebElement cartProductsWokPanAsM;

    @FindBy(xpath = ".//button[@class='custom-button plus gray round']")  //webElement7
    private WebElement cartButtonPlus;

    @FindBy(xpath = ".//*[@class='count' and text()='2']")  //webElement8
    private WebElement twoWokPanAsM;

    @FindBy(xpath = ".//*[@class='link_underlined']")  //webElement9
    private WebElement emptyCart;

    @FindBy(xpath = ".//*[@class='sw-button' and text()='Очистить']")  //webElement10
    private WebElement buttonEmpty;

    @FindBy(xpath = ".//*[text()='Твоя корзина пуста ...']")  //webElement11
    private WebElement yourCartIsEmpty;

    @FindBy(xpath = ".//button[@class='close-btn']")  //webElement12
    private WebElement buttonCloseDeleteWok;

    @FindBy(xpath = "..//a[@href='/msk/cart/delivery/']")  //webElement13
    private WebElement buttonDelivery;

    @FindBy(xpath = ".//a[@href='/msk/cart/pickup/']")  //webElement14
    private WebElement buttonPickUp;


    public MainSushiCart(WebDriver driver) {
        super(driver);
    }

    @Override
    protected WebDriver getDriver() {
        return super.getDriver();
    }

    public MainSushiCart clicknoodlesWok(){
        noodlesWok.click();
        return this;
    }

    public MainSushiCart clickwokPanAsM(){
        wokPanAsM.click();
        return this;
    }

    public MainSushiCart clickwokPanAsMplus(){
        wokPanAsMplus.click();
        return this;
    }

    public MainSushiCart clickwokPanAsMclose(){
        wokPanAsMclose.click();
        return this;
    }

    public MainSushiCart clickopenCart(){
        openCart.click();
        return this;
    }

    public MainSushiCart clickcartButtonPlus(){
        cartButtonPlus.click();
        return this;
    }

    public MainSushiCart clicktwoWokPanAsM(){
        twoWokPanAsM.click();
        return this;
    }

    public MainSushiCart clickemptyCart(){
        emptyCart.click();
        return this;
    }

    public MainSushiCart clickbuttonEmpty(){
        buttonEmpty.click();
        return this;
    }

    public MainSushiCart clickyourCartIsEmpty(){
        yourCartIsEmpty.click();
        return this;
    }

    public MainSushiCart clickbuttonCloseDeleteWok(){
        buttonCloseDeleteWok.click();
        return this;
    }

    public MainSushiCart clickbuttonDelivery(){
        buttonDelivery.click();
        return this;
    }

    public MainSushiCart clickbuttonPickUp(){
        buttonPickUp.click();
        return this;
    }
}
