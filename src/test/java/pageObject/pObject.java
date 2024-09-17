package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class pObject {
    WebDriver driver;
    public pObject(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")
    private WebElement createNewAccount;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElement FirstName;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement LastName;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement MobileNumber;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    private WebElement newPassword;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[1]")
    private WebElement Bday;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[2]")
    private WebElement bMonth;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[3]")
    private WebElement bYear;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[2]/input[1]")
    private WebElement gender;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[11]/button[1]")
    private WebElement signUp;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/i[1]")
    private WebElement iError;

    @FindBy(xpath = "//div[@class='uiContextualLayerPositioner _572t uiLayer']/div/div/div[@class = '_5633 _5634 _53ij']")
    private WebElement errorMsg;

//    @FindBy(xpath = "(//div[@class='mbs _52lq fsl fwb fcb'])[1]")
//    private WebElement textSignUp;

    public void clickOnCreateNewAccount() throws InterruptedException {
       createNewAccount.click();
       Thread.sleep(500);
    }
    public void enterFirstname(String fName)
    {
        FirstName.sendKeys(fName);
    }

    public void enterLastName(String lNAme)
    {
        LastName.sendKeys(lNAme);
    }
    public void enterMobile(String mobile)
    {
        MobileNumber.sendKeys(mobile);
    }
    public void enterPassword(String pass)
    {
        newPassword.sendKeys(pass);
    }
    public void enterDayForDob(String day)
    {
        Bday.sendKeys(day);
    }
    public void enterMonthForDob(String mon)
    {
        bMonth.sendKeys(mon);
    }
    public void enterYearForDob(String year)
    {
        bYear.sendKeys(year);
    }
    public void selectGender()
    {
        gender.click();
    }
    public void clickSignUp()
    {
        signUp.click();
    }
    public void click_i_Error()
    {
        iError.click();
    }
    public String getError() throws InterruptedException {
        Thread.sleep(500);
       return errorMsg.getText();
    }

}
