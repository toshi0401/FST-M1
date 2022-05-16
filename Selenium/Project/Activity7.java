package LMSProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity7 {

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
            driver.findElement(By.xpath("//*[@id='menu-item-1508']/a")).click();
            Thread.sleep(2000);

           // Counting number of courses
            System.out.println(driver.findElements(By.className("ld_course_grid")).size());
        }

        @AfterTest
        public void Teardown()
        {
            // Close the browser
            driver.quit();
        }

    }

