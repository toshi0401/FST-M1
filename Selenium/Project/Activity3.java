package LMSProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity3 {

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
        String Title = driver.findElement(By.xpath("//*[@id='uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810']/div/div/div/div[2]/h3")).getText();
        System.out.println(Title);
        Assert.assertEquals(Title,"Actionable Training");
    }

    @AfterTest
    public void Teardown()
    {
        // Close the browser
        driver.quit();
    }

}
