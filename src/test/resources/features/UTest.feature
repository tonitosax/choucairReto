# Author: Antonio Montilla
@stories
Feature: UTest
  As user, I want to open a page and register an user
  @scenario1
  Scenario: Search for automation course
    Given than brandon wants to open a page UTest
    When he search for the join button and fill the form to register
      |strName     |strLastName     |strEmail           |strCity      |strZip  |strCountry |strPassword   |
      |Brandon     |Rogers          |brogers@mail.com   |La Chorrera  |00000   |Panama     |r39c7"UY4{    |
    Then he complete the register in page UTest
      |strWelcome                                                             |
      |Welcome to the world's largest community of freelance software testers!|