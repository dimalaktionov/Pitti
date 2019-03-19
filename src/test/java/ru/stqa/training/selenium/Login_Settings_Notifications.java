package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Login_Settings_Notifications {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {

        System.setProperty("webdriver.gecko.driver", "/Users/polzovatel/Downloads/WebDrivers/firefox/geckodriver");
        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
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

        //Click to button "Войти"
        try {
             driver.findElement(By.className("login")).click();
                     }catch(Exception e)

                           {
                             System.out.println("Can not Click to button 'Войти'");
                           }

        //Wait for "Settings" button & click
        try {
             driver.findElement(By.linkText("НАСТРОЙКИ")).click();
                     }catch(Exception e)

                           {
                             System.out.println("Can not Click to button 'НАСТРОЙКИ'");
                           }

        //Click to "Выбрать все" button
        try {
              driver.findElement(By.className("checkAll")).click();
                     }catch(Exception e)

                           {
                             System.out.println("Can not Click to button 'Выбрать все'");
                           }

        //Click to "Сохранить" button
        try {
              driver.findElement(By.className("saveSettings")).click();
                     }catch(Exception e)

                           {
                             System.out.println("Can not Click to 'Сохранить' button");
                           }

        //Click to "Снять все" button
        try {
              driver.findElement(By.className("unCheckAll")).click();
                     }catch(Exception e)

                           {
                             System.out.println("Can not Click to button 'Снять все'");
                           }

        //Click to "Сохранить" button
        try {
               driver.findElement(By.className("saveSettings")).click();
                     }catch(Exception e)

                            {
                              System.out.println("Can not Click to 'Сохранить' button");
                            }

        //Click to "Присылать push-уведомления" checkbox
        try {
                driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-settings-page/div/div/app-home-settings-notifications/div[1]/div[1]/div[1]/div[2]/div[2]")).click();
                      }catch(Exception e)

                            {
                              System.out.println("Can not Click to 'Присылать push-уведомления' checkbox");
                             }

        //Click to "Сохранить" button
        try {
            driver.findElement(By.className("saveSettings")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to 'Сохранить' button");
        }
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}