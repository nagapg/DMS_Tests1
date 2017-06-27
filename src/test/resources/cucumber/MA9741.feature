Feature: Validate Invoice Inquiry Screen

Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
       And "<aff>" "<abo>" "<period>" submitted
       When Invoice Inquiry Screen is slected
       And Click on Orange Link 
       And Click on Amount
       Then Bonus amount displays
       And Click on Cross to close 
       And Click on back button
       And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |
      