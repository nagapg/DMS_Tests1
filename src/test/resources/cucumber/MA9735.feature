Feature: Validate  Region Security Screen

Scenario Outline:
         Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
       And "<aff>" "<abo>" "<period>" submitted
        When Region Security is selected
        Then Validate Expand All and Collapse All
       And Close https://magic-gamma/EBS_UI_Web/Magic
      
       Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |