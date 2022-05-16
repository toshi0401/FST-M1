package LMSProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Activity2 {

    WebDriver driver;


    @BeforeTest
    public void setup() {

        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        // Open the browser
        driver.get("https://alchemy.hguy.co/lms");

    }
    @Test
    public void test_heading() {
        //Comparing the title
        String Title = driver.findElement(By.className("uagb-ifb-title")).getText();
        System.out.println(Title);
        Assert.assertEquals(Title,"Learn from Industry Experts");
    }

    @AfterTest
    public void Teardown()
    {
        // Close the browser
        driver.quit();
    }


}




