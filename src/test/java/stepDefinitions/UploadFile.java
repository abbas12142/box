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

import java.text.SimpleDateFormat;
import java.util.Date;

public class UploadFile extends Configuration {
    @Given("User Click On Folder Name")
    public void user_click_on_folder_name() throws InterruptedException {

        WebDriverWait wait3 = new WebDriverWait (driver, 15);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title=\""+FolderName+"\"]")));

        WebElement click = driver.findElement(By.xpath("//*[@title=\""+FolderName+"\"]"));

        click.click();



    }






    @When("User Click Upload File Button and Select File")
    public void user_click_upload_file_button_and_select_file() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript(
                "HTMLInputElement.prototype.click = function() {                     " +
                        "  if(this.type !== 'file') HTMLElement.prototype.click.call(this);  " +
                        "};                                                                  " );
        WebDriverWait wait2 = new WebDriverWait (driver, 15);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-resin-target=\"emptystateuploadlink\"]")));

        driver.findElement(By.xpath("//*[@data-resin-target=\"emptystateuploadlink\"]")).click();
        String dateStr =(new SimpleDateFormat("ss")).format(new Date());
        driver.findElement(By.className("hidden")).sendKeys(FilePath+FileName);


    }




    @Then("Verify that file should be Upload Successfully")
    public void file_should_be_upload_successfully() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait (driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title=\"Get Started with Box.pdf\"]")));


        boolean status = driver.findElement(By.xpath("//*[@title=\""+FileName+"\"]")).isDisplayed();
        Assert.assertEquals(true,status);







    }

}
