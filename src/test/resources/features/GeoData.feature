Feature: GeoData Login Feature

  Scenario: Check Kickout functionality test case
    When user enters username and password and submits
      | username                         | password  |
      | gauravkapoor@cssoftsolutions.com | Test@2020 |
    Then user checks for kickout message
    Then user verifies title of main page

 