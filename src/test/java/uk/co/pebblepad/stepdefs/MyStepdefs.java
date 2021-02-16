package uk.co.pebblepad.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.pebblepad.pages.LinkPage;

public class MyStepdefs {
    @Given("^I click on the link$")
    public void iClickOnTheLink() {
    }

    @Then("^I should navigate to the link page and loads correctly$")
    public void iShouldNavigateToTheLinkPageAndLoadsCorrectly() {
        Assert.assertEquals("My sunset picture",new LinkPage().getLinkText());
    }

    @When("^I click on comment link$")
    public void iClickOnCommentLink() {
    }

    @And("^Comment box open$")
    public void commentBoxOpen() {
        new LinkPage().clickOnCommentLink();
    }
    @And("^I write comment and click on post comment \"([^\"]*)\"$")
    public void iWriteCommentAndClickOnPostComment(String comment)  {
        new LinkPage().addCommentOnCommentBox(comment);

    }

    @Then("^I should saved and visible successfully$")
    public void iShouldSavedAndVisibleSuccessfully() {
        Assert.assertEquals("Comment left on: My sunset picture", new LinkPage().getCommentText());
    }


}
