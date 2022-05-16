package LMSProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Activity1 {

        WebDriver driver;


        @BeforeTest
        public void setup() {

            // Create a new instance of the Firefox driver
            driver = new FirefoxDriver();
            // Open the browser
            driver.get("https://alchemy.hguy.co/lms");

        }
        @Test
        public void test_title() {
            //Comparing the title
            String Title = driver.getTitle();
            System.out.println(Title);
           Assert.assertEquals(Title,"Alchemy LMS – An LMS Application");
        }

        @AfterTest
        public void Teardown()
        {
            // Close the browser
            driver.quit();
        }


    }




