Feature: Create Account Testcases

Scenario: CreateAccount Testcase01
Given Open browser Navigate to "http://www.automationpractice.com"
When Click on the SignIn link
When Enter Email id in CreateAccount section "digitalcutlet2@gmail"
When Enter Firstname "Digital"
When Enter Lastname "Cutlet"
When Enter Password "123456"
When Click on the Submit button
Then Verify Account is created or not
