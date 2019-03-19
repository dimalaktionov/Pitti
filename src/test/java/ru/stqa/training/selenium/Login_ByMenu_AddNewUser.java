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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.management.modelmbean.ModelMBeanInfoSupport;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Login_ByMenu_AddNewUser {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start () {
        //System.setProperty("webdriver.gecko.driver", "/Users/polzovatel/Downloads/WebDrivers/firefox/geckodriver");
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        //WebDriver driver = new SafariDriver();
        //driver = new SafariDriver();
        //DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability(FirefoxDriver.MARIONETTE, false);
        //driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "/Users/polzovatel/Downloads/WebDrivers/firefox/geckodriver");
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        //wait = new WebDriverWait(driver,80);
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

        //Click to "Menu" button
        try {
             WebDriverWait wait2 = new WebDriverWait(driver, 20);
             wait2.until(ExpectedConditions.elementToBeClickable(By.className("menuBtn-line"))).click();
                  }catch(Exception e)

                       {
                        System.out.println("Can not Click to 'Menu' button");
                       }
        //Click to "Страница аккаунта" Submenu
        try {
            driver.findElement(By.linkText("Страница Аккаунта")).click();
                  }catch(Exception e)

                       {
                         System.out.println("Can not Click to button 'Войти'");
                       }

        //Click to "Добавить пользователя" button
        try {
             WebDriverWait wait3 = new WebDriverWait(driver, 20);
             wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/div/div[3]/div[2]"))).click();
                   }catch(Exception e)

                       {
                         System.out.println("Can not Click to button 'Войти'");
                       }

        //Add device's name
        try {
             driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[1]/div/input")).sendKeys("test");
                   }catch(Exception e)

                        {
                          System.out.println("Can not Add device's' name");
                        }
        //Add user name
        try {
             driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[2]/div/input")).sendKeys("test");
                   }catch(Exception e)

                        {
                          System.out.println("Can not Add user name");
                        }
        //Add password
        try {
             driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[3]/div[1]/div/input")).sendKeys("test");
                   }catch(Exception e)

                        {
                          System.out.println("Can not Add password");
                        }
        //Add repeat password
        try {
             driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[3]/div[2]/div/input")).sendKeys("test");
                   }catch(Exception e)

                        {
                          System.out.println("Can not Add repeat password");
                        }

        //Add phone number
        try {
             driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[4]/div/div/div/div[3]/input")).sendKeys("0986629566");
                   }catch(Exception e)

                         {
                           System.out.println("Can not Add phone number");
                         }

        //Click to "Администратор/Добавление устройств и удаление всех устройств"
        try {
             driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[5]/div[1]/label/div")).click();
                   }catch(Exception e)

                         {
                           System.out.println("Can not click to 'Администратор/Добавление устройств и удаление всех устройств'");
                          }

        // Click to "Добавление/удаление только добавленных собой устройств"
        try {
              driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[5]/div[1]/div/label[2]/div")).click();
                    }catch(Exception e)

                          {
                            System.out.println("Can not click to 'Администратор/Добавление устройств и удаление всех устройств'");
                          }

        //Click to "Модератор Администратор/Добавление устройств и удаление всех устройств"
        try {
              driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[5]/div[2]/label/div")).click();
                     }catch(Exception e)

                           {
                             System.out.println("Can not click to 'Модератор Администратор/Добавление устройств и удаление всех устройств");
                           }
        //Click to "Модератор Добавление/удаление только добавленных собой устройств"
        try {
              driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div")).click();
                     }catch(Exception e)

                           {
                             System.out.println("Can not click to 'Модератор Администратор/Добавление устройств и удаление всех устройств");
                            }
        //Click to "Пользователь"
        try {
             driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[5]/div[3]/label/div")).click();
                     }catch(Exception e)

                           {
                             System.out.println("Can not click to 'Пользователь");
                           }
        //Click to "Подвязка/отвязка устройств к себе без управления" checkbox
        try {
              driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[5]/div[3]/div/div/div[2]")).click();
                     }catch(Exception e)

                           {
                             System.out.println("Can not click to 'Подвязка/отвязка устройств к себе без управления");
                           }
        //Click to "Подтвердить" button
        try {
               driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[6]/button[2]")).click();
                     }catch(Exception e)

                           {
                             System.out.println("Can not click to 'Подтвердить' button");
                           }
        //Clear email's field
        try {
               driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[1]/div/input")).clear();
                     }catch(Exception e)

                           {
                             System.out.println("Can not Clear email's field");
                           }

        //Add correct email
        try {
                driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[1]/div/input")).sendKeys("test@gmail.com");
                      }catch(Exception e)

                            {
                              System.out.println("Can not Add correct email");
                            }
        //Click to "Подтвердить" button
        try {
                driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[6]/button[2]")).click();
                      }catch(Exception e)

                           {
                              System.out.println("Can not click to 'Подтвердить' button");
                           }

        //Click to "Show password"
        try {
                driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[3]/div[1]/div/div")).click();
                      }catch(Exception e)

                           {
                             System.out.println("Can not click to 'Show password'");
                           }

        //Click to "Repeat Show password"
        try {
                driver.findElement(By.xpath("/html/body/app-root/app-content-root/div/div/app-account/div/app-account-users-page/app-add-user-modal/div[2]/div/div[2]/form/div[3]/div[2]/div/div")).click();
                      }catch(Exception e)

                           {
                             System.out.println("Can not click to 'Repeat Show password'");
                           }










    }

    @After
    public void stop() {
        //driver.quit();
        //driver = null;
    }

}