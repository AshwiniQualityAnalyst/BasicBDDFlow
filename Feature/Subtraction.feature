@FunctionalTest
Feature: Subtracting two numbers

  Background: Common first steps for all the scenarios again
    Given Print to check again

  @SmokeTest2
  Scenario: Minus a and b
    Given I have e
    Given I have f
    When I minus e and f
    Then I display the minus
    Then Print message

  @RegressionTest
  Scenario: Minus a and b
    Given I have g
    Given I have h
    When I minus g and h
    Then I display the minuss
    Then Print messagee

  @SmokeTest @RegressionTest
  Scenario: Parameterizing again without Example Keyword
    Given I agsin have two numbers
    When I sub "10" and "20"
    Then I display the Subtraction

  @SmokeTest @RegressionTest
  Scenario Outline: Parameterizing with Example Keyword
    Given I have numbers for subtraction
    When I enteragain <Number 1> and <Number 1>
    Then Print Subtraction

    Examples: 
      | Number 1 | Number 2 |
      |        3 | Number 4 |
      |        5 |        6 |

  @SmokeTest @RegressionTest
  Scenario: Use of Data Table
    Given I got two numbers
    When And I enter
      | 5 | 6 |
      | 7 | 8 |
    Then I print message
