@smoke @MB2P-126
Feature: Validating OrangeHRM  functionalities

  Scenario: Validating OrangeHRM search functionality
    Given provide to the OrangeHRM web application
    When provide username "Admin" and password "admin123"
    And click on Admin tab
    And provide any user name in username searchBox
    And click on search button
    Then validates that user name is searched

