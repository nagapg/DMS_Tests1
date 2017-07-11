Feature: LTS Screen

Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to LTS
      And Capture Trip Number and Target Number
     And Compare Values
     Then Display values
      And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |
      
    
   