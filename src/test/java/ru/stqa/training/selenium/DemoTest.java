package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;
import java.util.UUID;

public class DemoTest {

    private RemoteWebDriver driver;

    @Before
    public void openDriver() throws Exception {
        final DesiredCapabilities browser = DesiredCapabilities.chrome();
        browser.setCapability("enableVNC", true);
        browser.setCapability("screenResolution", "1920x1080x24");
        //browser.setCapability("version", "74");
        driver = new RemoteWebDriver(new URL("http://192.168.1.30:4444/wd/hub"), browser);
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    @Test
    public void browserTest() throws Exception {
        try {
             Thread.sleep(3000);
             driver.get("http://duckduckgo.com/");
             WebElement input = driver.findElement(By.cssSelector("input#search_form_input_homepage"));
             input.sendKeys(Keys.chord("selenium", Keys.ENTER));
             Thread.sleep(10000);
    }
        catch(Exception e)

        {
            System.out.println("Can not Click to 'ОТВЯЗАТЬ' button");
        }
    }

    //private void takeScreenshot (WebDriver driver) throws Exception {
      //  byte[] screen = ((TakesScreenshot)) new Augmenter().augment(driver)).getScreenshotAs(OutputType.BYTES);
      //  UUID uuid = UUID.randomUUID();
      //  FileUtils.writeByteByteArrayToFile(new File(uuid.toString() + ".png"), screen);
      //  }

    //@After
    //public void closeDriver(){
            //if (driver != null){
                //driver.quit();
                //driver = null;
            //}
    @After
    public void stop() {
        //driver.quit();
        //driver = null;
    }

}



