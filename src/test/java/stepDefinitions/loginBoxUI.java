package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginBoxUI extends Configuration {

    @Given("User launch chrome browser")
    public void i_launch_chrome_browser() {

     System.setProperty("webdriver.chrome.driver",DriverPath);
      driver = new ChromeDriver();

    }

    @When("User open box.com login page.")
    public void i_open_box_login_page() {

        driver.get("https://account.box.com/login");
        driver.manage().window().maximize();

    }

    @Then("Verify that login page should be loaded successfully")
    public void i_verify_that_the_logo_should_be_present_on_page() throws InterruptedException {




        boolean status = driver.findElement(By.id("login-form")).isDisplayed();
        Assert.assertEquals(true,status);


    }



    @Then("Verify that the Email address field should be present on page")
    public void i_verify_that_the_UserName_field_should_be_present_on_page() throws InterruptedException {




        boolean username = driver.findElement(By.id("login-email")).isDisplayed();
        Assert.assertEquals(true,username);


    }



    @Then("Verify that the Next button should be present on page")
    public void i_verify_that_the_Login_Button_should_be_present_on_page() throws InterruptedException {


        boolean next = driver.findElement(By.id("login-submit")).isDisplayed();
        Assert.assertEquals(true,next);


    }


    @Then("Verify that the Reset password page link should be present on page")
    public void i_verify_that_the_Reset_Password_Link_should_be_present_on_page() throws InterruptedException {




        boolean resetpassword = driver.findElement(By.id("reset-password-login")).isDisplayed();
        Assert.assertEquals(true,resetpassword);



    }


}
