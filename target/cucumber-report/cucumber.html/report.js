$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/Assert.feature");
formatter.feature({
  "line": 1,
  "name": "asserts that the evidence link shows and loads correctly",
  "description": "",
  "id": "asserts-that-the-evidence-link-shows-and-loads-correctly",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10711271000,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Verify that user should be navigate to the link page and loads correctly",
  "description": "",
  "id": "asserts-that-the-evidence-link-shows-and-loads-correctly;verify-that-user-should-be-navigate-to-the-link-page-and-loads-correctly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I click on the link",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I should navigate to the link page and loads correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iClickOnTheLink()"
});
formatter.result({
  "duration": 487063300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateToTheLinkPageAndLoadsCorrectly()"
});
formatter.result({
  "duration": 3378833800,
  "status": "passed"
});
formatter.after({
  "duration": 5912177700,
  "status": "passed"
});
formatter.before({
  "duration": 6408273700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "asserts that comments that are posted to the \"asset\" are saved and visible",
  "description": "",
  "id": "asserts-that-the-evidence-link-shows-and-loads-correctly;asserts-that-comments-that-are-posted-to-the-\"asset\"-are-saved-and-visible",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I click on the link",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on comment link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Comment box open",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I write comment and click on post comment \"This picture is beautiful\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should saved and visible successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iClickOnTheLink()"
});
formatter.result({
  "duration": 34700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnCommentLink()"
});
formatter.result({
  "duration": 24700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.commentBoxOpen()"
});
formatter.result({
  "duration": 3210580100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This picture is beautiful",
      "offset": 43
    }
  ],
  "location": "MyStepdefs.iWriteCommentAndClickOnPostComment(String)"
});
formatter.result({
  "duration": 1101538900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSavedAndVisibleSuccessfully()"
});
formatter.result({
  "duration": 199713400,
  "status": "passed"
});
formatter.after({
  "duration": 1194424400,
  "status": "passed"
});
});