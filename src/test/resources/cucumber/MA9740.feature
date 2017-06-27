Feature: Validate LTS Screen

Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
       And "<aff>" "<abo>" "<period>" submitted
      When LTS is selected
      And Capture Trip Number and Target Number
     And Compare Values
     Then Display the values
      And Close https://magic-gamma/EBS_UI_Web/Magic
      
       Examples:
      | aff   | abo   | period   |
     | 430 | 46 | 062017 |
      
    
   