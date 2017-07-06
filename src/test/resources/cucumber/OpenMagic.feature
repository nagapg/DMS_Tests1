  Feature: Open and Close MAGIC  QA

  Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         Then Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 5166282 | 062017 |