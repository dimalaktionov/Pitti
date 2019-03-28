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

public class Login_Map_DateFilter {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void openDriver() throws Exception {

        //System.setProperty("webdriver.gecko.driver", "/Users/polzovatel/Downloads/WebDrivers/firefox/geckodriver");
        //driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        final DesiredCapabilities browser = DesiredCapabilities.chrome();
        //browser.setCapability("enableVNC", true);
        //browser.setCapability("screenResolution", "1920x1080x24");
        //WebDriver driver = new SafariDriver();
        //driver = new SafariDriver();
        driver = new RemoteWebDriver(new URL("http://192.168.1.30:4444/wd/hub"), browser);
        driver.manage().window().setSize(new Dimension(1920, 1080));
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

        //Click to checkbox "Запомнить"
        //try {
          //  driver.findElement(By.className("remember")).click();
        //} catch (Exception e) {
          //  System.out.println("Can not Click to checkbox 'Запомнить'");
        //}

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

        //Add device's name to Search field
        try {
            WebDriverWait wait = new WebDriverWait(driver, 80);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Период"))).click();
            driver.findElement(By.name("car")).sendKeys("GT06N");
        } catch (Exception e) {
            System.out.println("Can not device's name to Search field");
        }

        //Wait to search result
        try {
            WebDriverWait wait2 = new WebDriverWait(driver, 10);
            wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/div[2]/div[1]/div[2]/div[336]/app-category-device/div")));

        } catch (Exception e) {
            System.out.println(" Filtered devices name is visible");
        }

        //Click to button "Период"
        try {
            driver.findElement(By.linkText("Период")).click();
        } catch (Exception e) {
            System.out.println("Can not Click to button 'Период'");
        }

        //Click to date picker's button "Вперед"
        try {
            WebDriverWait wait2 = new WebDriverWait(driver, 10);
            wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.className("btn btn-link ngb-dp-arrow-btn")));
        } catch (Exception e) {
            System.out.println("Can not Click to arrow 'Вперед'");
        }

        //Click to 01.01.19 button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/app-map-date-widget/div/ngb-datepicker/div[2]/div[1]/ngb-datepicker-month-view/div[2]/div[2]/span")).click();
        } catch (Exception e) {
            System.out.println("Can not Click to 01.01.19 button");
        }

        //Click to button "Назад"
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/app-map-date-widget/div/ngb-datepicker/div[2]/div[1]/ngb-datepicker-month-view/div[2]/div[2]/span")).click();
        } catch (Exception e) {
            System.out.println("Can not Click to button 'Назад'");
        }

        //Click to 31,03,19 button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/app-map-date-widget/div/ngb-datepicker/div[1]/ngb-datepicker-navigation/div[2]/button")).click();
        } catch (Exception e) {
            System.out.println("Can not Click to 31,03,19 button");
        }

        //Click to button "Вперед"
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/app-map-date-widget/div/ngb-datepicker/div[2]/div[2]/ngb-datepicker-month-view/div[6]/div[7]/span")).click();
        } catch (Exception e) {
            System.out.println("Can not Click to button 'Вперед'");
        }

        //Click to button "ОК"
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/app-map-date-widget/div/div[2]/div[2]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click to button 'ОК'");
        }

        WebElement link_Home = driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[1]"));
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();


        // Click(1) to "Периодические данные" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[1]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(1) to 'Периодические данные' button");
        }

        // Click to "Координаты" image
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[3]/div[1]/div/div[1]/div/app-action-multi-view/div/div[1]/div")).click();
        } catch (Exception e) {
            System.out.println("Can not Click to 'Координаты' image");
        }

        // Click(2) to "Периодические данные" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[1]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(2) to 'Периодические данные' button");
        }

        // Click(1) to "Геозоны" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[2]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(1) to 'Геозоны' button");
        }

        // Click to "Вьезд в геозону" image
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[3]/div[1]/div/div[1]/div/app-action-multi-view/div/div[2]/div[1]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click to 'Вьезд в геозону' image");
        }

        // Click(2) to "Геозоны" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[2]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(2) to 'Геозоны' button");
        }

        // Click(1) to "Режим охраны" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[3]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(1) to 'Режим охраны' button");
        }

        // Click(2) to "Режим охраны" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[3]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(2) to 'Режим охраны' button");
        }

        // Click(1) to "Тревога" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[4]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(1) to 'Тревога' button");
        }

        // Click(2) to "Тревога" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[4]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(2) to 'Тревога' button");
        }

        // Click(1) to "Питание" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[5]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(1) to 'Питание' button");
        }

        // Click(2) to "Питание" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[5]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(2) to 'Питание' button");
        }

        // Click(1) to "Оповещения" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[5]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(1) to 'Оповещения' button");
        }

        // Click(2) to "Оповещения" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[5]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(2) to 'Оповещения' button");
        }

        // Click(1) to "Поездки" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[6]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(1) to 'Поездки' button");
        }

        // Click(2) to "Поездки" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[6]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(2) to 'Поездки' button");
        }





    }

    @After
    public void stop() {
        //driver.quit();
        //driver = null;
    }

}