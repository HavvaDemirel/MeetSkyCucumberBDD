package com.meetsky.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Driver {


    private Driver() {
        }

        private static WebDriver driver;

        //we make Webdriver private because we want to close access from outside the class
        // we make it static bc we will use it in a static method
        public static WebDriver getDriver() {
            //create a reusable utility method which will return same driver instance when we call it

            if (driver != null) {
                // we read our browser type from configuration reader.proprietary
                //this way we can control which browser is opened from outside our code from configuration.property
                String browserType = ConfigurationReader.getProperty("browser");
                switch(browserType){
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();


                }
            }
            return driver;
        }

        //this method will make sure our driver value s always null after using quit() method
        public static void closeDriver(){
            if (driver==null){
                driver.quit();//this line will terminate the existing session. value will not even be null
                driver = null;
            }
        }
}
