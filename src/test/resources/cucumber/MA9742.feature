Feature: Validate Dashboard

Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
       And "<aff>" "<abo>" "<period>" submitted
      When Platinum value and sponsor value 
      Then Values should be same
      And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |