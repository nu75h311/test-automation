Narrative:
As a Test Automation User
I want to perform a search on a Search Engine Page
So that I can see my search results

Scenario: I can perform a search on Search Engine Page
Given I am on Search Engine Home Page
When I perform a search with text <searchText>
Then I will see the Search Results Page
Examples:
|searchText    |
|search through story file|