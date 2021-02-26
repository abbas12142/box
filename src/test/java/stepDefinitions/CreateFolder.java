package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateFolder extends Configuration {
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    @Given("User Press New Button")
    public void User_Create_a_new_folder() throws InterruptedException {








      WebDriverWait wait = new WebDriverWait (driver, 10);
       // WebElement create2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-resin-target=\"newmenubutton\"]")));


      //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //btn create-dropdown-menu-toggle-button
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-resin-target=\"newmenubutton\"]")));

        Thread.sleep(5000);

        WebElement create2 = driver.findElement(By.xpath("//*[@data-resin-target=\"newmenubutton\"]"));
        jse.executeScript("arguments[0].click()", create2);
        //*[@data-resin-target="newmenubutton"]
      //  WebElement create = driver.findElement(By.xpath(("//button[contains(.,'New')]")));
//btn create-dropdown-menu-toggle-button dropdown-menu-target dropdown-menu-element-attached-top dropdown-menu-element-attached-right dropdown-menu-target-attached-bottom dropdown-menu-target-attached-right
      //uploadmenubutton

      //  create2.click();
      //  create.submit();







       // wait = new WebDriverWait(driver, 15);

     //   WebDriverWait wait = new WebDriverWait (driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label=\"Create a new Folder\"]")));

        WebElement avitar2 = driver.findElement(By.xpath("//*[@aria-label=\"Create a new Folder\"]"));

        jse.executeScript("arguments[0].click()", avitar2);




    }





    @Then("User Write Folder Name")
    public void user_write_folder_name() {

        WebDriverWait wait1 = new WebDriverWait (driver, 15);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("folder-name")));
        boolean dialog = driver.findElement(By.name("folder-name")).isDisplayed();
        Assert.assertEquals(true,dialog);


        WebElement foldername = driver.findElement(By.name("folder-name"));

        foldername.click();
        foldername.sendKeys(FolderName);


    }



    @And("Press Create button")
    public void press_create_button() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait (driver, 15);

        //btn create-dropdown-menu-toggle-button
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-resin-target=\"primarybutton\"]")));

        WebElement create = driver.findElement(By.xpath(("//*[@data-resin-target=\"primarybutton\"]")));

       // create.click();
        jse.executeScript("arguments[0].click()", create);


    }
    @Then("Verify that folder should be Created Successfully")
    public void Folder_Created_Successfullye() throws InterruptedException {

        //      "//*[@data-resin-target=\"accountmenu\"]"  Software Requirement Specification


        WebDriverWait wait = new WebDriverWait (driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title=\""+FolderName+"\"]")));


        boolean status = driver.findElement(By.xpath("//*[@title=\""+FolderName+"\"]")).isDisplayed();
        Assert.assertEquals(true,status);


    }
}
