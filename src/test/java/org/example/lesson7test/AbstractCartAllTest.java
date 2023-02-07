package org.example.lesson7test;


import java.time.Duration;

    public class AbstractCartAllTest {


        static WebDriver webDriver;

        @BeforeAll
        static void setDriver() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("start-maximized");
            options.setPageLoadTimeout(Duration.ofSeconds(10));

            webDriver = new ChromeDriver(options);
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @AfterAll
        public static void exit(){

            if(webDriver !=null) webDriver.quit();
        }

        public WebDriver getWebDriver(){
            return this.webDriver;
        }
    }
