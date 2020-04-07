Feature: Search

  @Test-2
  Scenario Outline: Search on Yandex Market
    * I am on Yandex Market Home page
    * I search '<searched_item>' on the Yandex Market
    * I click on the <index>-st searched item on the Search result page
    * item should have cost <price> RUB on the Item page

    Examples:
      | searched_item | index | price |
      | Iphone SE     | 1     | 18480 |
      | Iphone 7      | 3     | 29590 |
      | Iphone 8      | 5     | 41970 |
      | Iphone XS     | 4     | 68750 |