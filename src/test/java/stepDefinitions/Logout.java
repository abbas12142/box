package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Logout extends Configuration {

    @Given("User Click On profile avatar")
    public void user_click_on_profile_avatar() {
        WebElement avitar = driver.findElement(By.xpath("//*[@data-resin-target=\"accountmenu\"]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", avitar);
        driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
    }



    @When("User click logout option in menu")
    public void user_click_logout_option_in_menu() {
        WebDriverWait wait1 = new WebDriverWait (driver, 15);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-resin-target=\"accountmenu\"]")));

        WebElement logout = driver.findElement(By.xpath("//*[@data-resin-target=\"logout\"]"));
        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
        jse1.executeScript("arguments[0].click()", logout);
    }
    @Then("Verify that user Should Logout Successfully")
    public void user_should_logout_successfully() {
        boolean status = driver.findElement(By.xpath("//*[@data-resin-page=\"login\"]")).isDisplayed();
        Assert.assertEquals(true,status);

    }


}
