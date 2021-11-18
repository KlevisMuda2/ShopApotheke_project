
Feature: A customer is able to successfully log in with valid credentials

  Scenario: Using valid credentials, a customer can successfully log in.
    Given Customer is on the Login Page
    When Customer login with valid credentials: Username "klevismuda@gmail.com" and Password "klevisshop"
    Then Customer should see dashboard with text that contains "Hallo"

@wip
  Scenario: Using invalid credentials with not lead to a successful login.
    Given Customer is on the Login Page
    When Customer login with invalid credentials: Username "shop@gmail.com" and Password "shop1234"
    Then Customer should see error message "E-Mail-Adresse und/oder Passwort sind falsch. Bitte überprüfen Sie Ihre Eingaben."