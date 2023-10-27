package newProject.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import newProject.page.HomePage;
import newProject.utilies.ConfigurationReader;
import newProject.utilies.Driver;
import newProject.utilies.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;
import java.sql.DriverManager;

public class HomePage_StepDefinitions extends Helper {

    HomePage homePage = new HomePage();

    @When("click go to homepage")
    public void clickGoToHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String cuurentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(cuurentUrl.contains("aloware.com"));

    }

    @And("click on AloBot live chat icon")
    public void clickOnAloBotLiveChatIcon() {
        waitUntilElementIsVisible(homePage.getLiveChatIconIframe(),20);
        Driver.getDriver().switchTo().frame(homePage.getLiveChatIconIframe());
        homePage.getLiveChatIcon().click();
    }

    @And("write a text on AloBot")
    public void writeATextOnAloBot() {
        homePage.getLiveChatTextInbox().click();
        homePage.getLiveChatTextInbox().sendKeys("Hello" + Keys.ENTER);

    }

    @And("verify can we have your email message")
    public void verifyCanWeHaveYourEmailMessage() {
        waitUntilElementIsVisible(homePage.getCanWeHaveYouEmailMessage(),10);
        Assert.assertTrue(homePage.getCanWeHaveYouEmailMessage().isDisplayed());
    }

    @And("click No button to answer message")
    public void clickNoButtonToAnswerMessage() {
        waitUntilElementIsVisible(homePage.getNoButtonOnAloBot(),20);
        homePage.getNoButtonOnAloBot().click();

        if(homePage.getNotDeliveredMessageOnAloBot().isDisplayed()){
            homePage.getNotDeliveredMessageOnAloBot().click();
            waitUntilElementIsVisible(homePage.getNoButtonOnAloBot(),20);
            homePage.getNoButtonOnAloBot().click();
        }

    }

    @And("verify AloBot will connect to specialist message")
    public void verifyAloBotWillConnectToSpecialistMessage() {
        Assert.assertTrue(homePage.getAnswerOfAloBotAfterNo().isDisplayed());
        Assert.assertTrue(homePage.getAnswerOfAloBotAfterNo().getText().contains("Thanks"));
        Driver.closeDriver();
    }
}
