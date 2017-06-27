Feature: Validate Invoice Inquiry Screen

Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
       And "<aff>" "<abo>" "<period>" submitted
       When Invoice Inquiry is selected
       And Orange link is clicked 
       Then view bonus amount details
      And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |
      
    