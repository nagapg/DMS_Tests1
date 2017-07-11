Feature: Invoice Inquiry Screen

Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to Invoice Inquiry
       And Click Orange link  
       Then view bonus amount details
      And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |
    