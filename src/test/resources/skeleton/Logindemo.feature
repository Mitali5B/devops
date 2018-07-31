@Login
Feature: Login

In order to login in TestMe App
As a user
I need to register first

Business rules:
 - Registered user can only do the transactions
 

 
 Scenario: user can do the successful login
 Given user is on the login page of newtours
 When  user enters correct credentials in newtours
 Then  user can do sucessful login