Feature: Validate ILB Bank File

Scenario Outline:
        Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
        And "<aff>" "<abo>" "<period>" submitted
      When ILB Bank File is selected
      And select Transmitted links
      Then user should be able to view audit details
      And Close https://magic-gamma/EBS_UI_Web/Magic
      
      Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |