Feature: Add/Delete Postal Code Field  in Bank Search Screen

Scenario:  
Given MAGIC User goes to Bank Search Screen
When Postal code added
Then Add is successful

Given user is in Bank Search Screen
When Postal code is removed
Then remove is successful
And Close Bank Search Screen