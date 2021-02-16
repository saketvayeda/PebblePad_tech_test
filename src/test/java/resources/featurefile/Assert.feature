Feature: asserts that the evidence link shows and loads correctly
  Scenario: Verify that user should be navigate to the link page and loads correctly
    Given I click on the link
    Then I should navigate to the link page and loads correctly

    Scenario: asserts that comments that are posted to the "asset" are saved and visible
      Given I click on the link
      When I click on comment link
      And Comment box open
      And I write comment and click on post comment "This picture is beautiful"
      Then I should saved and visible successfully