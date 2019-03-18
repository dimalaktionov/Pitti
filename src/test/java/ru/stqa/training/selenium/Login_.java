package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Login_ {

    private WebDriver driver;
    private WebDriverWait wait;


    public static void main(String[] args) {
        String baseUrl = "https://telematics-pit.com";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.name("email"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(Username)
                .click()
                //.keyDown(Username, Keys.SHIFT)
                .sendKeys(Username, "dima")
                //.keyUp(Username, Keys.SHIFT)
                //.doubleClick(Username)
                //.contextClick()
                .build();

        seriesOfActions.perform();
    }
}

