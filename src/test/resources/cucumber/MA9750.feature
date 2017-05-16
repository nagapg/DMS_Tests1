Feature: Validating  MA 9750

     Scenario:
       Given  User is in Transaction Reports Screen 
       When Clicked view without values
      Then Click on ok button
     
       Scenario:
       Given User enters From Bonus Period
       When User Clicks on Clear 
       Then Field is Cleared
       
        Scenario:
       Given User again enters From Bonus Period
       When email check box is checked
       Then User email is populated
       
         Scenario:
       Given User Selects To Bonus Period
       And Check Original ABO
       And Select Order Number
       When Select Report View Excel
       And Select Business Entity 
       Then Click on View
       And Close 