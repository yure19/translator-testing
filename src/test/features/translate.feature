Feature: translate

  @regression
  Scenario Outline: translate a word
    Given a source as "<source>", a target as "<target>" and a word as "<word>"
    When i translate the word
    Then i can view the translated word as "<translated word>"
    Examples:
      | source  | target  | word    | translated word |
      | spanish | english | familia | family |