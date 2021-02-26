package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginBoxUserSuccess extends Configuration {




    @Given("User entered correct email address")
    public void I_entered_correct_email_address() {




        WebElement LoginEmail = driver.findElement(By.id("login-email"));

        LoginEmail.click();
        LoginEmail.sendKeys(Email);



    }

    @When("Press next button")
    public void Press_next_button() throws InterruptedException {


        WebElement nextbutton = driver.findElement(By.id("login-submit"));
        nextbutton.click();


    }
    @Then("Verify tha system should show password screen")
    public void System_should_show_password_screen() throws InterruptedException {


        boolean passwordscreen = driver.findElement(By.xpath("//*[@title=\"Enter Your Password\"]")).isDisplayed();
        Assert.assertEquals(true,passwordscreen);


    }




    @Given("User entered correct password")
    public void I_entered_correct_password() {


        boolean password1 = driver.findElement(By.id("password-login")).isDisplayed();
        Assert.assertEquals(true,password1);

        WebElement LoginPassword = driver.findElement(By.id("password-login"));
        LoginPassword.click();
        LoginPassword.sendKeys(Password);




    }
    @When("Press login button")
    public void Press_login_button() throws InterruptedException {

        boolean login = driver.findElement(By.id("login-submit-password")).isDisplayed();
        Assert.assertEquals(true,login);

        WebElement loginbutton = driver.findElement(By.id("login-submit-password"));
        loginbutton.click();


    }

    @Then("Verify that user should be logged in Successfully")
    public void User_should_be_logged_in_Successfully() throws InterruptedException {


        boolean LoginSuccess = driver.findElement(By.xpath("//*[@data-resin-target=\"accountmenu\"]")).isDisplayed();
        Assert.assertEquals(true,LoginSuccess);


    }


}
