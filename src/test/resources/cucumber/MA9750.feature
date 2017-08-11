Feature: Transaction Reports Screen

    Scenario:
     Given user navigates to Transaction Reports
     When Click View
      Then Click Ok
    
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
        And Close Transaction Reports