Feature: Invoice Inquiry Screen

 Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When in Invoice Inquiry Screen
       And Click Orange Link 
       And Click Amount
       Then Bonus amount displays
       And Click Cross
       And Click back
       And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |