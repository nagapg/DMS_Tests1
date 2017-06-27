Feature: Validate  Transaction Reports Screen

    Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
       And "<aff>" "<abo>" "<period>" submitted
      When Transaction Reports is selected 
     Then no values entered click on view
      And Click on ok button
      
       Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |
     
       Scenario:
       Given User enters From Bonus Period
       When User Clicks on Clear 
       Then Field is Cleared
       
       Scenario:
       Given User again enters From Bonus Period
       When email check box is checked
       Then   User email is populated
       
        Scenario:
       Given User Selects To Bonus Period
       And Check Original ABO
       And Select Order Number
       When Select Report View Excel
       And Select Business Entity 
       Then Click on View
        And Close https://magic-gamma/EBS_UI_Web/Magic
    
    
      