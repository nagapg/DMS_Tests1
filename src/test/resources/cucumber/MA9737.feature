Feature: Validate ILB Alt Name Screen

Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
       And "<aff>" "<abo>" "<period>" submitted
       When ILB Alt Name Screen is selected
       Then BE should be empty
       And Drop down in BE
       And Close https://magic-gamma/EBS_UI_Web/Magic
       
        Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |