package Step_Def;

import Pages.Register_page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Register_step_def {

    WebDriver driver;

    // Instance of the Register_page class for interacting with the register page
    Register_page registerpage_obj;
    Actions act;
    boolean register_state = false;

    // Method to set up preconditions before each test scenario
    @Before
    public void precondition() {
        driver = new ChromeDriver();
        // Initialize the ChromeDriver and maximize the browser window
        driver.manage().window().maximize();
        // Create an instance of Login_page with the WebDriver
        registerpage_obj = new Register_page(driver);
        //
        act = new Actions(driver);
    }


    @After
    public void Quit_Browser() throws InterruptedException {
        Thread.sleep(200);
        driver.quit();
    }

    /* ****************************************************************************************************************/
    /* ****************************   Scenario: Validate Register using valid credentials   ***************************/
    /* ****************************************************************************************************************/


    @Given("User Navigate To Register Page Register")
    public void User_Navigate_To_Register_Page(){
        registerpage_obj.Navigate_register_page();

    }


    @When("User Enters Valid First Name Register")
    public void userEntersValidFirstName() {
        //First Name must be between 1 and 32 any characters!
        registerpage_obj.Valid_First_Name().sendKeys("Ibrahim");

    }

    @And("User Enters Valid Last Name Register")
    public void userEntersValidLastName() {
        //First Name must be between 1 and 32 any characters!
        registerpage_obj.Valid_Last_Name().sendKeys("Salman");
    }

    @And("User Enters Valid Email Register")
    public void User_Enters_Valid_Email() {
        // Accepts valid email input validate for '@' symbol and mustn't have any spaces
        registerpage_obj.Valid_Email().sendKeys("iaafjs@dkljlk.com");
    }

    @And("User Enters Valid Telephone Register")
    public void userEntersValidTelephone() {
        // Telephone must be between 3 and 32 any characters!
        registerpage_obj.Valid_Telephone().sendKeys("123");

    }

    @And("User Enters Valid Password Register")
    public void User_Enters_Valid_Password() {
        // Accepts valid password input Password must be between 4 and 20 any characters!
        registerpage_obj.Valid_Password().sendKeys("1234");
    }

    @And("User Enters Valid Password Confirm Register")
    public void userEntersValidPasswordConfirm() {
        registerpage_obj.Valid_Password_Confirm().sendKeys("1234");

    }


    @And("User Chooses Subscription for Newsletter Register")
    public void userChoosesSubscriptionForNewsletter() {
        registerpage_obj.Subscription().click();


    }
    @And("User Clicks on Check Privacy Register")
    public void userClicksOnCheckPrivacy() {
        registerpage_obj.Valid_Check_Privacy().click();
    }

    @And("User Clicks on Continue Button Register")
    public void userClicksOnContinueButton() {
        registerpage_obj.Continue_Btn().click();
    }

    @Then("User Should Register Successfully Register")
    public void userShouldRegisterSuccessfully() {
// Verifies that the user has register successfully by checking for a valid data message
        registerpage_obj.Valid_Register();
        if (registerpage_obj.Valid_Register())
        {
            register_state = true;
        }


    }

    /* ****************************************************************************************************************/
    /* *************************   Scenario: Validate Register using invalid credentials   ****************************/
    /* ****************************************************************************************************************/


    @When("User Enters InValid First Name Register")
    public void userEntersInValidFirstName() {
        registerpage_obj.Valid_First_Name().sendKeys("abcdefghijklmnopqrstuvyzabcdefgshdhkjhhijklmnopqrstuvwxyz");

    }

    @And("User Enters InValid Last Name Register")
    public void userEntersInValidLastName() {
        registerpage_obj.Valid_Last_Name().sendKeys("abcdefghijklmnopqrstuvyzabcdekdsjkjhdshklfghijklmnopqrstuvwxyz");

    }

    @And("User Enters InValid Email Register")
    public void userEntersInValidEmail() {
        registerpage_obj.Valid_Email().sendKeys("");


    }

    @And("User Enters InValid Telephone Register")
    public void userEntersInValidTelephone() {
        registerpage_obj.Valid_Telephone().sendKeys("12");

    }

    @And("User Enters InValid Password Register")
    public void userEntersInValidPassword() {
        registerpage_obj.Valid_Password().sendKeys("123");

    }

    @And("User Enters InValid Password Confirm Register")
    public void userEntersInValidPasswordConfirm() {
        registerpage_obj.Valid_Password_Confirm().sendKeys("12346");
    }

    @Then("User Should See Error Message for First Name Register")
    public void userShouldSeeErrorMessageForFirstName() throws InterruptedException {
        registerpage_obj.InValid_First_Name();

    }

    @Then("User Should See Error Message for Last Name Register")
    public void userShouldSeeErrorMessageForLastName() {
        registerpage_obj.InValid_Last_Name();
    }

    @Then("User Should See Error Message for Email Register")
    public void userShouldSeeErrorMessageForEmail() {
        registerpage_obj.InValid_Email();
    }

    @Then("User Should See Error Message for Telephone Register")
    public void userShouldSeeErrorMessageForTelephone() {
        registerpage_obj.InValid_Telephone();
    }

    @Then("User Should See Error Message for Password Register")
    public void userShouldSeeErrorMessageForPassword() {
        registerpage_obj.InValid_Password();
    }

    @Then("User Should See Error Message for Password Confirm Register")
    public void userShouldSeeErrorMessageForPasswordConfirm() {
        registerpage_obj.InValid_Password_Confirm();
    }

    @Then("User Should See Error Message for Check Privacy Register")
    public void userShouldSeeErrorMessageForCheckPrivacy() {
        registerpage_obj.InValid_Check_Privacy();
    }


    /* ****************************************************************************************************************/
    /* ***********   Scenario: Validate Register using valid credentials but already registered email   ***************/
    /* ****************************************************************************************************************/


    @And("User Enters Valid Registered Email Register")
    public void userEntersValidRegisteredEmail() {
        registerpage_obj.Valid_Email().sendKeys("fipipay641@rowplant.com");
    }

    @Then("User Should See Error Message for Already Registered Register")
    public void userShouldSeeErrorMessageForAlreadyRegistered() {
        registerpage_obj.Already_Registered_Email_Error_Message();
    }
}
