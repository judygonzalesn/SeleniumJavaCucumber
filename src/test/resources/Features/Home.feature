Feature: Feature to test Home Page
  Scenario Outline: Open Home Page
    Given user enters the <url> and hit enter
    When user search in the text <searchItem> and hit enter
    Then user should be in the Search page <url> and <searchItem>
    Examples:
      | url | searchItem |
      | https://www.google.com/|try|