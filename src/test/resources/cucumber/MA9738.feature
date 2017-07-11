Feature: ILB Bank File

Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to ILB Bank File
       And Transmitted links selected
      Then view audit details
      And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |