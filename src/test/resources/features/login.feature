@wip
Feature: A customer is able to successfully log in with valid credentials

  Background: Landing on the Login Page
    Given Customer is on the Login Page

  Scenario: Using valid credentials, a customer can successfully log in.
    When Customer login with valid credentials: Username "klevismuda@gmail.com" and Password "klevisshop"
    Then Customer should see dashboard with text that contains "Hallo"


  Scenario: Using invalid credentials with not lead to a successful login.
    When Customer login with invalid credentials: Username "shop@gmail.com" and Password "shop1234"
    Then Customer should see error message "E-Mail-Adresse und/oder Passwort sind falsch. Bitte überprüfen Sie Ihre Eingaben."


  Scenario: Using blank credentials for both, and Submit button is clicked.
    When Customer login with empty credentials: Username "" and Password ""
    Then Customer should see error message under username field "Bitte geben Sie die in Ihrem Account hinterlegte E-Mail-Adresse an. Eine Anmeldung per Benutzername ist nicht mehr möglich."
    And  Customer should see error message under password field "Bitte geben Sie Ihr Passwort ein."


