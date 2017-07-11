Feature: Batch Search Screen

Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to Batch Search 
       And Batch Transaction Inquiry is opened
       Then Click back Orange arrow
       And Close Gamma
       
      Examples:
         | aff | abo | period |
         | 010 | 670 | 062017 | 