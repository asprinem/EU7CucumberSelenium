Feature: Tags filter under the All Car Page

  Background:
    Given the user is on the login page
    And the user enters the store manager information
    When the user navigates to "Fleet" "Vehicles"
    And the user clicks on filter button
    Then the user selects Tags filter

  Scenario:Using Tags filter as a Store manager and Tags Filter provides methods
    Then the filter provides below options
      | Is Any Of     |
      | Is Not Any Of |

    @wipi
   Scenario: Is any Of method with Compact Option
     When the user clicks on Is any Of button
     And the user chooses compact option
     Then table contains the corresponding value


