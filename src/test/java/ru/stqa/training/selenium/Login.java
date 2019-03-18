package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;


import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Login {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start () {
        //System.setProperty("webdriver.gecko.driver", "/Users/polzovatel/Downloads/WebDrivers/firefox/geckodriver");
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,60);
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

        WebElement option1 = driver.findElement(By.className("checkbox_icon"));
        // This will Toggle On the Check box
        option1.click();

        //Check whether the Check box is toggled om
        if (option1.isSelected()) {
            System.out.println("Checkbox is Toggled On");
        }else{
            System.out.println("Checkbox is Toggled Off");
        }
        //This should Toggle off the check box
        option1.click();

        //Lets see whether its Toggled Off
        if(!option1.isSelected()){
            System.out.println("Checkbox is now Toggled Off");
        }

        option1.click();

        //Click to button "Войти"
       try {
            driver.findElement(By.className("login")).click();
        }catch(Exception e)

        {
            System.out.println("Can not Click to button 'Войти'");
        }

        //Wait to search result
        try {
            WebDriverWait wait2 = new WebDriverWait(driver, 10);
            wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/div[2]/div[1]/div[2]/div[336]/app-category-device/div")));

        } catch (Exception e) {
            System.out.println(" Filtered devices name is visible");
        }

        //Find element by link text, store in variable "Element" & scroll the page till the element is found
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/div[2]/div[1]/div[2]/div[336]/app-category-device/div/div[3]/div[2]/div[1]/span"));
            js.executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e) {
            System.out.println("cant Find element by xpath and store in variable 'Element'");
        }

        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-left-widget/div[1]/app-home-widget/div/div[2]/div[1]/div[2]/div[336]/app-category-device/div/div[3]/div[2]/div[1]/span")).click();

        //Actions actions = new Actions(driver);
        //actions.moveToElement(element);
        //actions.perform();

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
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/app-map-date-widget/div/ngb-datepicker/div[1]/ngb-datepicker-navigation/div[1]/button")).click();
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

        // Click(1) to "Периодические данные" button
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[2]/div[1]")).click();
        } catch (Exception e) {
            System.out.println("Can not Click(1) to 'Периодические данные' button");
        }

        //Find element by link text, store in variable "Element" & scroll the page till the element is found
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[3]/div[1]/div/div[12]/div/app-action-full-view/div/div[1]/div[1]/div/span"));
            js.executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e) {
            System.out.println("cant Find element by xpath and store in variable 'Element'");
        }

        driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-home/div/div/app-home-map-page/div[1]/app-map-actions-widget/div[2]/div[3]/div[1]/div/div[12]/div/app-action-full-view/div/div[1]/div[1]/div/span")).click();









    }

    @After
    public void stop() {
        //driver.quit();
        //driver = null;
    }

}