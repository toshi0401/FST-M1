package LMSProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {


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
            //Clicking contact us
            driver.findElement(By.xpath("//*[@id='menu-item-1506']/a")).click();
            Thread.sleep(2000);

            //Fill form
            driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Toshi Sharma");
            driver.findElement(By.id("wpforms-8-field_1")).sendKeys("abc@gmail.com");
            driver.findElement(By.id("wpforms-8-field_3")).sendKeys("subject");
            driver.findElement(By.id("wpforms-8-field_2")).sendKeys("message");


            //press send message button
            driver.findElement(By.id("wpforms-submit-8")).click();

            //Verifying confirmation message
            driver.findElement(By.id("wpforms-confirmation-8")).isDisplayed();
            String Message = driver.findElement(By.xpath("//*[@id='wpforms-confirmation-8']/p")).getText();
            System.out.println(Message);


        }

        @AfterTest
        public void Teardown()
        {
            // Close the browser
            driver.quit();
        }

    }







