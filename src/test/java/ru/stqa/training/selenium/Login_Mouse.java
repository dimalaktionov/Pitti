package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Login_Mouse {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {

        //System.setProperty("webdriver.gecko.driver", "/Users/polzovatel/Downloads/WebDrivers/firefox/geckodriver");
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        //WebDriver driver = new SafariDriver();
        //driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,80);
    }

    @Test
    public void Login() {
        driver.get("https://telematics-pit.com");
        driver.manage().window().maximize();

        //Add email
        try {
            driver.findElement(By.name("email")).sendKeys("pit031018@gmail.com");
        } catch (Exception e) {
            System.out.println("Can not find field & add Email");
        }

        //Add password
        try {
            driver.findElement(By.name("password")).sendKeys("Lakti0n0v2209");
        } catch (Exception e) {
            System.out.println("Can not find field & add password");
        }



        WebElement chkPersist = driver.findElement(By.className("remember"));
        for (int i=0; i<3; i++){
            chkPersist.click();
            System.out.println("chkPersist.isSelected()");
        }

        //Click to button "Войти"
        try {
            driver.findElement(By.className("login")).click();
        } catch (Exception e) {
            System.out.println("Can not Click to button 'Войти'");
        }

        WebElement PeriodData = driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[1]"));
        WebElement Geozones = driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[2]"));
        WebElement Security = driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[3]"));
        WebElement Warning = driver.findElement(By.xpath("//html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[4]"));
        WebElement Power = driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[5]"));
        WebElement Notifications = driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[6]"));
        WebElement Drives = driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[7]"));
        WebElement Today = driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/app-map-date-widget/a[1]"));
        WebElement Period = driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/app-map-date-widget/a[2]"));
        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(PeriodData)
                .click()
                .moveToElement(Geozones)
                .click()
                .moveToElement(Security)
                .click()
                .moveToElement(Warning)
                .click()
                .moveToElement(Power)
                .click()
                .moveToElement(Notifications)
                .click()
                .moveToElement(Drives)
                .click()
                .moveToElement(Today)
                .moveToElement(Period)
                .build();

        seriesOfActions.perform();
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}