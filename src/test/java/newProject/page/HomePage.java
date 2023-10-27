package newProject.page;

import newProject.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@aria-label='Open live chat']")
    private WebElement liveChatIcon;

    @FindBy(id = "hubspot-conversations-iframe")
    private WebElement liveChatIconIframe;

    @FindBy(xpath = "//div[@aria-label='Write a message']")
    private WebElement liveChatTextInbox;

    @FindBy(xpath = "(//div[.='Can we have your email? :)'])[1]")
    private WebElement canWeHaveYouEmailMessage;

    @FindBy(xpath = "//div[.='No']")
    private WebElement NoButtonOnAloBot;

    @FindBy(xpath = "(//div[@data-test-id='primary-message-content'])[6]")
    private WebElement AnswerOfAloBotAfterNo;

    @FindBy(xpath = "//a[.='Not delivered. Click to retry.']")
    private WebElement notDeliveredMessageOnAloBot;

    public WebElement getLiveChatIcon() {
        return liveChatIcon;
    }

    public WebElement getLiveChatIconIframe() {
        return liveChatIconIframe;
    }

    public WebElement getLiveChatTextInbox() {
        return liveChatTextInbox;
    }

    public WebElement getCanWeHaveYouEmailMessage() {
        return canWeHaveYouEmailMessage;
    }

    public WebElement getNoButtonOnAloBot() {
        return NoButtonOnAloBot;
    }

    public WebElement getAnswerOfAloBotAfterNo() {
        return AnswerOfAloBotAfterNo;
    }

    public WebElement getNotDeliveredMessageOnAloBot() {
        return notDeliveredMessageOnAloBot;
    }
}
