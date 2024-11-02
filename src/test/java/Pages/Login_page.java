package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Login_page {

    //initialize for web driver
    WebDriver driver;

    //constructor
    public Login_page(WebDriver driver) {
        this.driver = driver;
    }

/* ******************************************************************************************************************/
/* *********************************                  Login page                  ***********************************/
/* ******************************************************************************************************************/
    public void Navigate_login_page(){
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/login");
    }


    public WebElement Valid_Email(){

        return driver.findElement(By.id("input-email"));
    }

    public WebElement Invalid_Email(){
        return driver.findElement(By.id("input-email"));
    }


    public WebElement Valid_Password(){
        return driver.findElement(By.id("input-password"));
    }

    public WebElement Login_Btn(){
        return driver.findElement(By.xpath("//input[@type=\"submit\"]"));
    }

    public boolean Valid_Login(){
        Assert.assertEquals(driver.getCurrentUrl() , "https://awesomeqa.com/ui/index.php?route=account/account");
        return (Objects.equals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=account/account"));
    }

    public void Invalid_Login(){
        String Expected = "Warning: No match for E-Mail Address and/or Password.";
        String Actual = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }

/* *****************************************************************************************************************/
/* ****************************                  Forgot_Password page                  *****************************/
/* *****************************************************************************************************************/



    public WebElement Enters_Valid_Email_In_Forgotten_Password_Page(){
        return driver.findElement(By.name("email"));
    }

    public WebElement Enters_In_Valid_Email_In_Forgotten_Password_Page(){
        return driver.findElement(By.name("email"));
    }

    public WebElement Forgotten_Password_Btn(){
        return driver.findElements(By.xpath("//a[@href=\"https://awesomeqa.com/ui/index.php?route=account/forgotten\"]")).getFirst();
    }

    public WebElement Forgotten_Password_Page_Continue_Btn(){
        return driver.findElement(By.xpath("//input[@type=\"submit\"]"));
    }

    public void Confirmation_Msg(){
        String Expected = "An email with a confirmation link has been sent your email address.";
        String Actual = driver.findElement(By.xpath("//*[@id=\"account-login\"]")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }

    public void Forgot_Msg ()
    {
        String Expected = "Enter the e-mail address associated with your account. Click submit to have a password reset link e-mailed to you.";
        String Actual = driver.findElement(By.xpath("//*[@id=\"content\"]")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }
    public void Error_Msg_Of_Forget_Invalid_Email(){
        String Expected = "Warning: The E-Mail Address was not found in our records, please try again!";
        String Actual = driver.findElement(By.xpath("//*[@id=\"account-forgotten\"]/div[1]")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }

/* *****************************************************************************************************************/
/* ***************************                  search for any product                  ****************************/
/* *****************************************************************************************************************/


    public void Navigate_Home_page(){
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
    }

    public WebElement Clicks_On_Search_TextBox(){
        return driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
    }

    public WebElement Clicks_On_Search_Button(){
        return driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));                  /* **********************/
    }

    public void Find_The_Desired_Product(){

        String Expected = "Search - Mac";
        String Actual = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
        //Assert.assertTrue(driver.findElement(By.className("col-sm-6 text-right")).isDisplayed());
    }

    public WebElement Currency_Drop_Down_List()
    {
        return driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div"));
    }

    public WebElement Currency_US_Selected()
    {
        return driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[3]"));
    }

    public void Assert_Currency_Is_US()
    {
        String Expected = "$";
        String Actual = driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }

    public WebElement Currency_Euro_Selected()
    {
        return driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]"));
    }

    public void Assert_Currency_Is_Euro()
    {
        String Expected = "€";
        String Actual = driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }

    public WebElement Hovering_Randomly_El1()
    {
        return driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]"));
    }

    public WebElement Hovering_Randomly_El2()
    {
        return driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[2]"));
    }

    public WebElement Hovering_Randomly_El3()
    {
        return driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]"));
    }

    public WebElement Hovering_Randomly_El4()
    {
        return driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div"));
    }

    public void SeeSubcategories()
    {
        String Expected = "Mac (1)";
        String Actual = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));




    }



    public WebElement Add_Item_To_Wish_list()
    {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[2]"));
    }

    public WebElement GoToWishList()
    {
        return driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]/span"));
    }

    public void See_A_Wishlist_Confirmation_Msg() throws InterruptedException {
        String Expected = "Success: You have added iMac to your wish list!";
        Thread.sleep(500);
        String Actual = driver.findElement(By.xpath("//*[@id=\"product-search\"]/div[1]")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }

    public WebElement AddItemToCompareList()
    {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[3]"));
    }

    public void CompareListConfirmationMsg() throws InterruptedException {
        String Expected = "Success: You have added iMac to your product comparison!";
        Thread.sleep(500);
        String Actual = driver.findElement(By.xpath("//*[@id=\"product-search\"]/div[1]")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }


    public WebElement Add_Item_To_Shipping_Cart()
    {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"));
    }

    public void See_A_Shipping_Cart_Confirmation_Msg() throws InterruptedException {
        String Expected = "Success: You have added iMac to your shopping cart!";
        Thread.sleep(500);
        String Actual = driver.findElement(By.xpath("//*[@id=\"product-search\"]/div[1]")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }


    /* ****************************************************************************************************************/


    public void ChooseOneOfListElements()
    {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"input-sort\"]"));
        Select List_ele = new Select(element);
        List_ele.selectByVisibleText("Price (High > Low)");
    }


    public void SeeASortingConfirmationMsg()
    {
        String Expected = "Price (High > Low)";
        String Actual = driver.findElement(By.xpath("//*[@id=\"input-sort\"]/option[5]")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }
    /* ****************************************************************************************************************/

    public void Navigate_TO_Search_page(){
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=product/search");
    }

    public WebElement ClicksOnSearchInSubcategoriesCheckButton(){
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/label/input"));
    }

    public void ChooseTheSubcategories(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/select"));
        Select List_ele = new Select(element);
        List_ele.selectByValue("27");
    }

    public WebElement Clicks_On_Search_Subcategories_Button(){
        return driver.findElement(By.xpath("//*[@id=\"button-search\"]"));                  /* **********************/
    }

    public WebElement EnterTheDesiredProductSubcategoriesMac(){
        return driver.findElement(By.xpath("//*[@id=\"input-search\"]"));
    }

    public void SeeASubcategoriesSearchingConfirmationMsg()
    {
        String Expected = "Search - Mac";
        String Actual = driver.findElement(By.xpath("//*[@id=\"content\"]")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
        //Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div/h2")).isDisplayed());
    }

    /* ***************************************************************************************************************/



    public void ScrollDown(){
        JavascriptExecutor jse =  (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,900)");
    }

    public WebElement HoversToImage(){
            return driver.findElement(By.xpath("//*[@id=\"slideshow0\"]/div/div[2]/a/img"));
    }



   /* public void SeeAnotherItem_Swiper() {
        String Active_Back_Ground = "#333";
        String Inactive_Back_Ground = "#666";
        WebElement ele1 = (WebElement) driver.findElements(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/span[1]"));
        WebElement ele2 = (WebElement) driver.findElements(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/span[2]"));
        String ele1_BC = ele1.getCssValue("color");
        String ele2_BC = ele1.getCssValue("color");
        if (ele1_BC.equals(Active_Back_Ground)) {
            Assert.assertEquals(Active_Back_Ground, driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/span[1]")).getCssValue("color"));
        }
        else{
            Assert.assertEquals(Inactive_Back_Ground, driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/span[1]")).getCssValue("color"));
        }*/

    public void ShowingPrevAndNextSwiperButtons()
    {
        WebElement prev_swiper = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[3]/div[2]"));
        WebElement next_swiper = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[3]/div[1]"));
        Assert.assertTrue(prev_swiper.isDisplayed());
        Assert.assertTrue(next_swiper.isDisplayed());
    }

    public WebElement HoverToIcon ()
    {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]"));
    }

    public void CheckTheChangedColorOfIcon()
    {
        String Expected = "#444";
        String Actual = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]/i")).getCssValue("color");
        Color icon = Color.fromString(Actual);
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + icon.asHex());
        Assert.assertTrue(icon.asHex().contains(Expected));
    }

    public WebElement ClickingOnLogo()
    {
        return driver.findElement(By.xpath("//*[@id=\"logo\"]/a"));
    }

    public void CheckHomePage ()
    {
        String Actual = driver.getCurrentUrl();
        String Expected = "https://awesomeqa.com/ui/index.php?route=common/home";
        Assert.assertEquals(Actual,Expected);
    }

    public void SelectingLogoutFromMyAccountList()
    {
       /* WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul"));
        Select item = new Select(myAccount);
        item.selectByVisibleText("Logout");*/
        // Locate the sub category dropdown

        WebElement mainDropdown = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
        mainDropdown.click();
        // Click to open the dropdown

        WebElement subDropdown = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
        subDropdown.click();
        // Click to open the dropdown

    }

    public void CheckLogoutPage()
    {
        String Expected = "You have been logged off your account. It is now safe to leave the computer.";
        String Actual = driver.findElement(By.xpath("//*[@id=\"content\"]/p[1]")).getText();
        System.out.println("Expected: "+Expected);
        System.out.println("Actual: "+Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }

    public WebElement ClickingOnChangingPassword()
    {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/ul[1]/li[2]/a"));
    }

    public void EnterPasswordAndConfirmationPassword()
    {
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("1234");
    }

    public WebElement ClickingOnContinueButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input"));
    }

    public void PasswordChangedMsg()
    {
        String Expected = "Success: Your password has been successfully updated.";
        String Actual = driver.findElement(By.xpath("//*[@id=\"account-account\"]/div[1]")).getText();
        System.out.println("Expected:"+Expected);
        System.out.println("Actual:"+Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }

    public void EnterPasswordAndWrongConfirmationPassword()
    {
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("1245");
    }

    public void PasswordFailedChangedMsg()
    {
        String Expected = "Password confirmation does not match password!";
        String Actual = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[2]/div/div")).getText();
        System.out.println("Expected:"+Expected);
        System.out.println("Actual:"+Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }

    public void SelectMainCategoriesRandomly(){
        // Locate the main category dropdown
        WebElement mainDropdown = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul"));
        mainDropdown.click(); // Click to open the dropdown

        // Get all options from the main category dropdown
        List<WebElement> mainOptions = driver.findElements(By.xpath("//*[@id=\"menu\"]/div[2]/ul"));

        // Generate random index for main categories
        Random random = new Random();
        int randomMainIndex = random.nextInt(mainOptions.size());

        // Select a random main category
        System.out.println("Selected Main Category: " + mainOptions.get(randomMainIndex).getText());
        mainOptions.get(randomMainIndex).click(); // Click on the randomly selected option

    }





    public void Select_Main_and_Sub_Categories_Randomly()   {
        // Locate the sub category dropdown
        WebElement mainDropdown = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul"));
        mainDropdown.click(); // Click to open the dropdown

        WebElement subDropdown = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div"));
        subDropdown.click(); // Click to open the dropdown

        // Get all options from the sub category dropdown
        List<WebElement> subOptions = driver.findElements(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div"));

        // Generate random index for main categories
        Random random = new Random();
        int randomSubIndex = random.nextInt(subOptions.size());

        // Select a random main category
        System.out.println("Selected sub Category: " + subOptions.get(randomSubIndex).getText());
        subOptions.get(randomSubIndex).click(); // Click on the randomly selected option
    }

    public WebElement GoesToCheckout(){
        return driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[5]/a/span"));
    }

    public WebElement EntersValidFirstNameCheckout(){
        return driver.findElement(By.xpath("//*[@id=\"input-payment-firstname\"]"));
    }

    public WebElement EntersValidLastNameCheckout(){
        return driver.findElement(By.xpath("//*[@id=\"input-payment-lastname\"]"));
    }
    public WebElement EntersValidAddressCheckout(){
        return driver.findElement(By.xpath("//*[@id=\"input-payment-address-1\"]"));
    }

    public WebElement EntersValidCityCheckout(){
        return driver.findElement(By.xpath("//*[@id=\"input-payment-city\"]"));
    }
    public WebElement EntersValidPostCodeCheckout(){
        return driver.findElement(By.xpath("//*[@id=\"input-payment-postcode\"]"));
    }
    public void ChoosesValidCountryCheckout(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"input-payment-country\"]"));
        Select List_ele = new Select(element);
        List_ele.selectByValue("63");
    }

    public void ChoosesValidRegionCheckout(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"input-payment-zone\"]"));
        Select List_ele = new Select(element);
        List_ele.selectByValue("1001");
    }


    /* ******************************************************************************************************************/
    public WebElement ClicksOnContinueButtonBillingCheckout() {
        return driver.findElement(By.cssSelector("input[id=\"button-payment-address\"]"));           // done
    }

    public WebElement ClicksOnContinueButtonDeliveryCheckout() {
        return driver.findElement(By.xpath("//*[@id=\"button-shipping-address\"]"));           // done
    }

    public WebElement ClicksOnContinueButtonDeliveryMethodCheckout() {
        return driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]"));            // done
    }

    public WebElement ClicksOnContinueButtonPaymentMethodCheckout() {
        return driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]"));            // done
    }

    public WebElement ClicksOnContinueButtonConfirmOrderCheckout() {
        return driver.findElement(By.xpath("//*[@id=\"button-confirm\"]"));            // done
    }


    public WebElement ClicksOnTermsCheckButtonCheckout() {
        return driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]"));  // done
    }


    public void CreateAnOrderWithASuccessfulPayment() {
        String Expected = "Your order has been placed!";
        String Actual = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
        System.out.println("Expected: " + Expected);
        System.out.println("Actual: " + Actual);
        Assert.assertTrue(Actual.contains(Expected));
    }


}


