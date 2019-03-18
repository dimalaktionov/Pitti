package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
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

public class Login_Settings {

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
        }catch(Exception e)
        {
            System.out.println("Can not find field & add Email");
        }

        //Add password
        try {
            driver.findElement(By.name("password")).sendKeys("Lakti0n0v2209");
        }catch(Exception e)

        {
            System.out.println("Can not find field & add password");
        }

        //Click to checkbox "Запомнить"
        try {
            driver.findElement(By.className("remember")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to checkbox 'Запомнить'");
        }

        //driver.findElement(By.xpath("/html/body/app-root/app-auth-root/div/div[3]/app-login/div/form/div[3]/div/span")).click();

        //Click to button "Войти"
        try {
            driver.findElement(By.className("login")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to button 'Войти'");
        }

        //Wait for "Settings" button & click
        try {
            WebDriverWait wait = new WebDriverWait(driver, 80);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("НАСТРОЙКИ"))).click();
            //driver.findElement(By.linkText("НАСТРОЙКИ")).click();
        }catch(Exception e)
        {
            System.out.println("Can not Click to button 'НАСТРОЙКИ'");
        }

        //Click to "GSM Settings" link
        try {
            WebDriverWait wait2 = new WebDriverWait(driver, 80);
            wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-settings-page/div/app-home-settings-menu/div/a[3]"))).click();
            //driver.findElement(By.linkText("Пользователи")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to 'GSM Settings' link");
        }

        //driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-settings-page/div/app-home-settings-menu/div/a[2]")).click();

        //Click to "Добавить еще 1 номер" link
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-settings-page/div/div/app-home-settings-gsm/div/div[2]/ngx-masonry/ngxmasonryitem[1]/div[2]/div[2]/div")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to 'Добавить еще 1 номер' link");
        }

        //Click to "Add phone number" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-settings-page/div/div/app-home-settings-gsm/div/div[2]/ngx-masonry/ngxmasonryitem[1]/div[2]/div[2]/div/div[2]/input")).sendKeys("+380986629566");
        }catch(Exception e)

        {
            System.out.println("Can not Click to 'Add phone number' button");
        }

        //Click to "Add phone number" icon
        try {
            driver.findElement(By.className("icon-svg-add")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to 'Add phone number' icon");
        }

        //Click to "SMS" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-settings-page/div/div/app-home-settings-gsm/div/div[2]/ngx-masonry/ngxmasonryitem[1]/div[2]/div[2]/div/div[2]/div/div/div/div[2]")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to 'SMS' button");
        }

        //Click to "Состояние и Управление" checkbox
        try {
            driver.findElement(By.id("garbage")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to checkbox 'Состояние и Управление'");
        }

        //Click to "Сохранить" button
        try {
            driver.findElement(By.className("saveSettings")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to 'Сохранить' button");
        }

        //Click to "ОТВЯЗАТЬ" button
        try {
            driver.findElement(By.className("user_bottom-link")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to 'ОТВЯЗАТЬ' button");
        }

        //Click to "ПОДТВЕРДИТЬ" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-settings-page/div/div/app-home-settings-users/app-unlink-user-from-device-modal/div[2]/div/div[3]/div/button[2]")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to 'ПОДТВЕРДИТЬ' button");
        }

    }

    @After
    public void stop() {
        //driver.quit();
        //driver = null;
    }

}