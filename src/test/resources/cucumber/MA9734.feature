Feature: Business Owner Attributes Links

  Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to Bus Owner Attributes Screen
         And Notes entered and click on Update
         Then Capture message
         Then Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 5166282 | 062017 |