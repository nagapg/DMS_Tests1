Feature: Transaction Reports Screen

     Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
        When navigated to Transaction Reports
     And Click View
      Then Click Ok
    
    Examples:
         | aff | abo | period |
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
       And Close Gamma
         
    
    
      