package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Objects;

public class Register_page {

    //initialize for web driver
    WebDriver driver;

    //constructor
    public Register_page(WebDriver driver) {
        this.driver = driver;
    }

    /* ******************************************************************************************************************/
    /* ********************************                  Register page                  *********************************/
    /* ******************************************************************************************************************/
    public void Navigate_register_page(){
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
    }

    public WebElement Valid_First_Name(){

        return driver.findElement(By.id("input-firstname"));
    }
    public void InValid_First_Name() throws InterruptedException {

        String Expected = "First Name must be between 1 and 32 characters!";
        Thread.sleep(5000);
        String Actual = driver.findElement(By.xpath("//*[@id=\"account\"]/div[2]/div/div")).getText();
        System.out.println(Expected);
        System.out.println(Actual);
        Assert.assertTrue(Actual.contains(Expected));
        // Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[2]/div/div")).isDisplayed());
    }

    public WebElement Valid_Last_Name(){

        return driver.findElement(By.id("input-lastname"));
    }
    public void InValid_Last_Name(){

       /* String Expected = "Last Name must be between 1 and 32 characters!";
        String Actual = driver.findElement(By.xpath("//*[@id=\"account\"]/div[3]/div/div")).getText();
        System.out.println(Expected);
        System.out.println(Actual);
        Assert.assertTrue(Actual.contains(Expected));*/
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"account\"]/div[3]/div/div")).isDisplayed());
    }

    public WebElement Valid_Email(){

        return driver.findElement(By.id("input-email"));
    }
    public void InValid_Email(){

       /* String Expected = "E-Mail Address does not appear to be valid!";
        String Actual = driver.findElement(By.xpath("//*[@id=\"account\"]/div[4]/div/div")).getText();
        System.out.println(Expected);
        System.out.println(Actual);
        Assert.assertTrue(Actual.contains(Expected));*/
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"account\"]/div[4]/div/div")).isDisplayed());

    }

    public WebElement Valid_Telephone(){

        return driver.findElement(By.id("input-telephone"));
    }
    public void InValid_Telephone(){

      /*  String Expected = "Telephone must be between 3 and 32 characters!";
        String Actual = driver.findElement(By.xpath("//*[@id=\"account\"]/div[5]/div/div")).getText();
        System.out.println(Expected);
        System.out.println(Actual);
        Assert.assertTrue(Actual.contains(Expected));*/
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"account\"]/div[5]/div/div")).isDisplayed());

    }

    public WebElement Valid_Password(){

        return driver.findElement(By.id("input-password"));
    }
    public void InValid_Password(){

        /*String Expected = "Password must be between 4 and 20 characters!";
        String Actual = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div")).getText();
        System.out.println(Expected);
        System.out.println(Actual);
        Assert.assertTrue(Actual.contains(Expected));*/
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div")).isDisplayed());

    }

    public WebElement Valid_Password_Confirm(){

        return driver.findElement(By.id("input-confirm"));
    }
    public void InValid_Password_Confirm(){

       /* String Expected = "Password confirmation does not match password!";
        String Actual = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div")).getText();
        System.out.println(Expected);
        System.out.println(Actual);
        Assert.assertTrue(Actual.contains(Expected));*/
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div")).isDisplayed());

    }

    public WebElement Subscription(){

        return driver.findElement(By.name("newsletter"));
    }

    public WebElement Valid_Check_Privacy(){

        return driver.findElement(By.name("agree"));
    }
    public void InValid_Check_Privacy(){

       /* String Expected = "Warning: You must agree to the Privacy Policy!";
        String Actual = driver.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]/text()")).getText();
        System.out.println(Expected);
        System.out.println(Actual);
        Assert.assertTrue(Actual.contains(Expected));*/
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]")).isDisplayed());

    }

    public WebElement Continue_Btn(){

        return driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
    }

    public boolean Valid_Register(){
        Assert.assertEquals(driver.getCurrentUrl() , "https://awesomeqa.com/ui/index.php?route=account/success");
        return (Objects.equals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=account/success"));
    }

    public WebElement Already_Registered_Email(){
        return driver.findElement(By.id("input-email"));
    }

    public void Already_Registered_Email_Error_Message(){

      /*  String Expected = "Warning: E-Mail Address is already registered!";
        String Actual = driver.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]/text()")).getText();
        System.out.println(Expected);
        System.out.println(Actual);
        Assert.assertTrue(Actual.contains(Expected));*/
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div[1]")).isDisplayed());
    }
}
