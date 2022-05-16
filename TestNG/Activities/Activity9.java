package LMSProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {


        WebDriver driver;
    JavascriptExecutor js;

    @BeforeTest
        public void setup() {

            // Create a new instance of the Firefox driver
            driver = new FirefoxDriver();
            // Open the browser
            driver.get("https://alchemy.hguy.co/lms");
            js = (JavascriptExecutor) driver;

        }
        @Test
        public void test_heading() throws InterruptedException {

            //navigating to all course
            driver.findElement(By.xpath("//*[@id='menu-item-1508']/a")).click();
            Thread.sleep(2000);

            //navigating to any course
            js.executeScript("window.scrollBy(0,1000)");
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[3]/article/div[2]/p[2]/a")).click();
                        //login
            driver.findElement(By.className("ld-login-text")).click();
            Thread.sleep(2000);

            //input user name and password
            driver.findElement(By.id("user_login")).sendKeys("root");
            driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");

            //press submit button
            driver.findElement(By.id("wp-submit")).click();

            //course expand
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id='ld-expand-283']/div/a/div[2]")).click();

            //Next lesson
            Thread.sleep(5000);
            driver.findElement(By.linkText("Next Lesson")).click();

            //Mark Complete
            Thread.sleep(5000);
            js.executeScript("window.scrollBy(0,1000)");

            driver.findElement(By.className("learndash_mark_complete_button")).click();


        }

        @AfterTest
        public void Teardown()
        {
            // Close the browser
            driver.quit();
        }

    }
