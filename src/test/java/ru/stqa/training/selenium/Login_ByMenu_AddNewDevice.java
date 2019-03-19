package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.management.modelmbean.ModelMBeanInfoSupport;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Login_ByMenu_AddNewDevice {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start () {
        //DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability(FirefoxDriver.MARIONETTE, false);
        driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "/Users/polzovatel/Downloads/WebDrivers/firefox/geckodriver");
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,60);
    }

    @Test
    public void Login() {
        driver.get("https://telematics-pit.com");
        driver.manage().window().maximize();

        driver.findElement(By.name("email")).sendKeys("pit031018@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Lakti0n0v2209");
        driver.findElement(By.xpath("/html/body/app-root/app-auth-root/div/div[3]/app-login/div/form/div[3]/div/span")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-auth-root/div/div[3]/app-login/div/form/div[4]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/app-header/div/div[1]/div/div")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/app-header/div/div[1]/app-header-menu/div/a[2]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-account-widget/div/a[2]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-devices-page/div/div[3]/div")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-devices-page/app-account-add-device/div[2]/div/div[1]/div[2]/form/div[1]/div/input")).sendKeys("testDevice060319");
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-devices-page/app-account-add-device/div[2]/div/div[1]/div[2]/form/div[2]/div/input")).sendKeys("353485968745215");
        driver.findElement(By.xpath("//*[@id='mat-select-7']/div/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id='mat-option-758']/span")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-devices-page/app-account-add-device/div[2]/div/div[1]/div[2]/form/div[4]/div/div/div/div/div[3]/input")).sendKeys("0986629566");
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-devices-page/app-account-add-device/div[2]/div/div[1]/div[2]/form/div[5]/div/input")).sendKeys("Internet");
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-devices-page/app-account-add-device/div[2]/div/div[1]/div[2]/form/div[7]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-devices-page/app-account-add-device/div[2]/div/div[1]/div[2]/form/div[10]/button[2]")).click();

    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}