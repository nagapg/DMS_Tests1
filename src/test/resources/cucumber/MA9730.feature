Feature: Annual Bonus Screen

Scenario Outline:
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to Annual Bonus Screen
        And PY selected and Clicked Go
       Then Capture Total Bonus
       And Close Gamma
       
        Examples:
         | aff | abo | period |
         | 010 | 670 | 062017 |