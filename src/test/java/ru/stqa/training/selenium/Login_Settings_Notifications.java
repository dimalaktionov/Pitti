package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Login_Settings_Notifications {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start () {
        driver = new ChromeDriver();
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
        //driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/div[2]/div[1]/div[2]/div[1]/app-category-device/div/div[3]/div[1]")).click();
        //.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/app-home-widget-top/app-add-device-modal/div[2]/div/div[1]/div[2]/form/div[1]/div/input")).sendKeys("testdevice1");
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/app-home-menu/a[2]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-settings-page/div/div/app-home-settings-notifications/div[1]/div[1]/div[2]/div[1]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-settings-page/div/div/app-home-settings-notifications/div[1]/div[1]/div[2]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-settings-page/div/div/app-home-settings-notifications/div[2]/div/span")).click();





    }

    @After
    public void stop() {
        //driver.quit();
        //driver = null;
    }

}