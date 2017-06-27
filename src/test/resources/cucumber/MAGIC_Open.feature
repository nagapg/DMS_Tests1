Feature: Open MAGIC QA

Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
      When "<aff>" "<abo>" "<period>" submitted
      Then Close https://magic-gamma/EBS_UI_Web/Magic
       
        Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |