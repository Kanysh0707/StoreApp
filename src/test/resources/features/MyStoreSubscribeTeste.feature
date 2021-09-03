@regression @MB2P-214
  Feature: Validating subscription functionality
    Scenario: Validating subscribe to newsletter of application
      Given navigate to the store application
      When provide email "k.oroxbekkyzy0707@gmail.com" in newsletter search box
      Then Validates success message "Newsletter : You have successfully subscribed to this newsletter."
