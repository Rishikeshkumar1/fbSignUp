package stepDefinition;

import data.TestData;
import data.TestDataLoader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.pObject;

import java.io.IOException;

public class stepdef001 {



        WebDriver driver;
        TestData[] testDataArray;
        pObject obj;

        @Given("Open Facebook Signup URL {string}")
        public void open_facebook_signup_url(String url) throws IOException {
            // Load test data from JSON file
            testDataArray = TestDataLoader.loadTestData("C:\\Users\\19040\\Downloads\\fbSignUp\\src\\test\\java\\data\\loginCredentials.json");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
            obj= new pObject(driver);

        }
        @When("Click on Create New Account")
        public void click_on_create_new_account() throws InterruptedException {
            obj.clickOnCreateNewAccount();
        }
        @When("Enter details from {int}")
          public void enter_details_from(Integer int1) throws InterruptedException {

            TestData data = testDataArray[int1];
            Thread.sleep(1000);
            obj.enterFirstname(data.fname);
            obj.enterLastName(data.lname);
            obj.enterMobile(data.mobile);
            obj.enterPassword(data.password);
            obj.enterDayForDob(data.day);
            obj.enterMonthForDob(data.mon);
            obj.enterYearForDob(data.year);
            obj.selectGender();

         }
        @When("Click on SignUp")
        public void click_on_sign_up() {
            obj.clickSignUp();
        }
        @Then("Error should be {string}")
        public void error_should_be(String error) throws InterruptedException {

            Assert.assertEquals( obj.getError(),error);

        }
              @Then("Browser quit post completion")
        public void browser_quit_post_completion() {
        driver.quit();
        }




}
