package LMSProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity6 {

        WebDriver driver;


        @BeforeTest
        public void setup() {

            // Create a new instance of the Firefox driver
            driver = new FirefoxDriver();
            // Open the browser
            driver.get("https://alchemy.hguy.co/lms");

        }
        @Test
        public void test_heading() throws InterruptedException {
            //Clicking my account button
            driver.findElement(By.xpath("//*[@id='menu-item-1507']/a")).click();
            Thread.sleep(2000);
            String Title = driver.getTitle();
            System.out.println(Title);
            Assert.assertEquals(Title,"My Account – Alchemy LMS");

            //Click on login button
            driver.findElement(By.linkText("Login")).click();

            //input user name and password
            driver.findElement(By.id("user_login")).sendKeys("root");
            driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");

            //press submit button
            driver.findElement(By.id("wp-submit")).click();

            //Verifying login successful
            driver.findElement(By.id("wp-admin-bar-my-account")).isDisplayed();


        }

        @AfterTest
        public void Teardown()
        {
            // Close the browser
            driver.quit();
        }

    }





