Feature: Logout function
Background: Admin  is in dashboard page after logged in


Scenario: Verify Logout button function
Given  Admin is in dashboard page
When Admin click Logout button on navigation bar
Then Admin should land on login in page
