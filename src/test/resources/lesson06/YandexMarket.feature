Feature: Yandex Market search

  @Test-1
  Scenario: Search on Yandex Market
    Given I am on Yandex Market Home page
    And I search 'Iphone SE' on the Yandex Market
    When I click on the 1-st searched item on the Search result page
    Then item should have cost 18480 RUB on the Item page