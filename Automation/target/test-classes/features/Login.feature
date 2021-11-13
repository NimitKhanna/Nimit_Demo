Feature: Application Login

Scenario: Home Page Default Login
Given user is on netbanking login page
When User login into application with username and password
Then homepage is populated
And Cards are displayed

