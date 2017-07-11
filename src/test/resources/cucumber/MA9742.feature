Feature:  Dashboard

 Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         And Capture Platinum value and sponsor value 
      Then Values are same
      And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |