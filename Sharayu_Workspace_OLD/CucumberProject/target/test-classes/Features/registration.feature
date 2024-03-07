Feature: User registration 
Scenario: User registration with data
Given user is on registration page
When user enter following details
  |firstname|lastname|email|phone|city|
  |tom|hanks|tom@gmail.com|1111|Pune|
  |lara|sharma|lara@gmail.com|2222|Banglore|
  |peter|kapoor|peter@gmail.com|3333|London|
Then user is registered successfully

Scenario: User registration with dataTable
Given user is on registration page
When user enter following details
  |tom|hanks|tom@gmail.com|1111|Pune|
  |lara|sharma|lara@gmail.com|2222|Banglore|
  |peter|kapoor|peter@gmail.com|3333|London|
Then user is registered successfully



  