Feature: Manage assignment page verification
Background:
    Given Logged on the LMS portal as admin
    And  Clicks on assignment button on the navigation bar
    
    @validatesearchbox
    Scenario Outline: Validation of search box functionality
    Given Admin is on manage assignment page
    When Clicks on search box and enters <assignment name>
    Then Displays all assignemts details with that assignment name with "<status>"
    
    Examples:
   | assignment name           |  status    | 
   | Cucmber Testing Framework |   pass     |
   | Appium                     |   fail     |
   
     Scenario Outline: Validation of search box functionality
     Given Admin is on manage assignment page
     When Clicks on search box and enters <assignment description>
     Then Displays all assignemts details with that assignment description with "<status>"
   
     Examples:
   | assignment description       |  status    | 
   | Cucmber is testing framework |   pass     |
   | Appium is testing  framework |   fail     |
   
     Scenario Outline: Validation of search box functionality
     Given Admin is on manage assignment page
     When Clicks on search box and enters <assignment duedate>
     Then Displays all assignemts details with that assignment duedate with "<status>"
   
     Examples:
   | assignment duedate   |  status    | 
   | sep142023            |   pass     |
   | sep152023            |   fail     |
   
   
    Scenario Outline: Validation of search box functionality
     Given Admin is on manage assignment page
     When Clicks on search box and enters <grade value>
     Then Displays all assignemts details with that assignment duedate with <status>
     
    Examples:
   | grade value          |  status    | 
   |   A+                 |   pass     |
   |   E                  |   fail     |