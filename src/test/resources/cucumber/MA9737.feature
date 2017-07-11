Feature: ILB Alt Name Screen

Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to ILB Alt Name Screen
       When BE should be empty
       Then Drop down in BE
       Then Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 670 | 062017 |
       
       