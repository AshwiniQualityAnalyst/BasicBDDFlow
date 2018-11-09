@FunctionalTest1
Feature: Adding two numbers

  Background: Common first steps for all the scenarios again
    Given Print to check

  @SmokeTest1
  Scenario: Add a and b
    Given I have a
    Given I have b
    When I add a and b
    Then I display the sum
    Then Print something

  @RegressionTest
  Scenario: Again Add c and d
    Given I have c
    Given I have d
    When I add c and d
    Then I display the summ
    Then Print somethingg

  @SmokeTest @RegressionTest
  Scenario: Parameterizing without Example Keyword
    Given I have two numbers
    When I add "10" and "10"
    Then I display the Addition

  @SmokeTest @RegressionTest
  Scenario Outline: Parameterizing with Example Keyword
    Given I have numbers for addition
    When I enter <Number 1> and <Number 1>
    Then Print Addition

    Examples: 
      | Number 1 | Number 2 |
      |        7 | Number 8 |
      |        9 |       10 |

  @SmokeTest @RegressionTest
  Scenario: Use of Data Table
    Given You got two numbers
    When And You enter
      | 1 | 2 |
      | 3 | 4 |
    Then You print message
