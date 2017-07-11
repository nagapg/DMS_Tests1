Feature: Region Security Screen

 Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to Region Security 
        Then Validate Expand All and Collapse All
        And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |
        
        