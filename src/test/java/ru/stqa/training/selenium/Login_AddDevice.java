package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Login_AddDevice {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start () {
        //System.setProperty("webdriver.gecko.driver", "/Users/polzovatel/Downloads/WebDrivers/firefox/geckodriver");
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,20);
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

        //Click to "Add device" button
        try {
             driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/app-home-widget-top/div/div/button[2]")).click();
                   }catch(Exception e)

                         {
                           System.out.println("Can not Click to 'Add device' button");
                         }

        //Put device name
        try {
              driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/app-home-widget-top/app-add-device-modal/div[2]/div/div[1]/div[2]/form/div[1]/div/input")).sendKeys("testdevice1");
                    }catch(Exception e)

                         {
                           System.out.println("Can not Put device name");
                         }

        //Add ID (IMEI)
        try {
              driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/app-home-widget-top/app-add-device-modal/div[2]/div/div[1]/div[2]/form/div[2]/div/input")).sendKeys("353425689785466");
                    }catch(Exception e)

                         {
                           System.out.println("Can not Add ID (IMEI)");
                         }

        //Open device's list
        try {
             driver.findElement(By.xpath("//*[@id='mat-select-1']/div/div[1]/span")).click();
                    }catch(Exception e)

                         {
                           System.out.println("Can not Open device's list");
                          }

        //Choose device from the list
        try {
             driver.findElement(By.xpath("//*[@id='mat-option-246']/span")).click();
                     }catch(Exception e)

                         {
                           System.out.println("Can not Open device's list");
                         }

        //Add phone number
        try {
              driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/app-home-widget-top/app-add-device-modal/div[2]/div/div[1]/div[2]/form/div[4]/div/div/div/div/div[3]/input")).sendKeys("0986629566");
                     }catch(Exception e)

                         {
                           System.out.println("Can not Add phone number");
                         }

        //Add APN settings
        try {
               driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/app-home-widget-top/app-add-device-modal/div[2]/div/div[1]/div[2]/form/div[5]/div/input")).sendKeys("Internet");
                      }catch(Exception e)

                          {
                           System.out.println("Can not Add phone number");
                          }

        //Choose manual settings
        try {
                driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/app-home-widget-top/app-add-device-modal/div[2]/div/div[1]/div[2]/form/div[7]/div[2]")).click();
                      }catch(Exception e)

                           {
                             System.out.println("Can not Add phone number");
                           }

        //Click to "ОТПРАВИТЬ" button
            try {
                 driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/app-home-widget-top/app-add-device-modal/div[2]/div/div[1]/div[2]/form/div[10]/button[2]")).click();
                       }catch(Exception e)


                           {
                             System.out.println("Can not Add phone number");
                           }

    }

    @After
    public void stop() {
        //driver.quit();
        //driver = null;
    }

}