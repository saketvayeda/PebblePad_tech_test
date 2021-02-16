package uk.co.pebblepad.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.pebblepad.utility.Utility;

public class LinkPage extends Utility {
    private static final Logger log = LogManager.getLogger(LinkPage.class.getName());

    @FindBy(xpath = "//h3[contains(text(),'My sunset picture')]")
    WebElement _linkText;
    @FindBy(xpath = "//body/div[@id='app-container']/div[@id='app']/div[1]/asset-viewer[1]/div[2]/div[1]/div[1]/asset-viewer-options[1]/section[1]/button[2]/span[1]")
    WebElement _commentLink;
    @FindBy(xpath = "//*[@id=\"spa-asset-info-panel\"]/asset-info-panel/div[2]/div[2]/div/asset-comments/section/section/comment-input-box/div/rich-text-editor-component/div/div[2]")
    WebElement _commentBox;
    @FindBy (xpath = "//*[@id=\"spa-asset-info-panel\"]/asset-info-panel/div[2]/div[2]/div/asset-comments/section/section/comment-input-box/div/div[2]/button[1]")
    WebElement _postCommentTab;
    @FindBy(xpath = "//p[contains(text(),'Comment left on: My sunset picture')]")
    WebElement _commentText;



    //this method will assert and verify page load successfully
    public String getLinkText() {
        Reporter.addStepLog("Get link text" + _linkText.toString() + "<br>");
        log.info("Get link text" + _linkText.toString());
        return getTextFromElement(_linkText);
    }
    //this method will click on comment link
    public void clickOnCommentLink(){
        Reporter.addStepLog("Click on comment link" + _commentLink.toString() + "<br>");
        log.info("Click on comment link" + _commentLink.toString());
        clickOnElement(_commentLink);

    }
    //this method will add comment on comment box
    public void addCommentOnCommentBox(String comment){
        Reporter.addStepLog("Add comment on comment box"+ comment + _commentBox.toString() + "<br>");
        log.info("Add comment on comment box" + comment + _commentBox.toString());
        sendTextToElement(_commentBox,comment);

    }
    //this method will click on post comment tab
    public void clickOnPostCommentTab() {
        Reporter.addStepLog("Click on post comment Tab" + _postCommentTab.toString() + "<br>");
        log.info("Click on post comment Tab" + _postCommentTab.toString());
        clickOnElement(_postCommentTab);
    }
    //this method will assert and verify comment saves and visible
    public String getCommentText() {
        Reporter.addStepLog("Get link text" + _commentText.toString() + "<br>");
        log.info("Get link text" + _commentText.toString());
        return getTextFromElement(_commentText);
    }
}
