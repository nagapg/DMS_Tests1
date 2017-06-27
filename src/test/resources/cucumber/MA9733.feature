Feature: Validating Batch Search Screen

Scenario Outline:
        Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
       And "<aff>" "<abo>" "<period>" submitted
       When Batch Search is selected
       Then go to Batch Transaction Inquiry Screen
       And Click on back Orange arrow
       And Close https://magic-gamma/EBS_UI_Web/Magic
      
       Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |