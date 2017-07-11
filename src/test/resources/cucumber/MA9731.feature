Feature: Update/Delete/Add Name in Award Board Name

Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to Award board Name
         And add name
         And Confirm add
         And update name
         And  Confirm update
         Then delete name
         And Confirm delete
        And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |
         
        