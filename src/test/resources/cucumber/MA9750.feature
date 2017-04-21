Feature: Validating  MA 9750

     Scenario:
       Given Go to MAGIC Gamma
       When aff abo period entered and Click on submit
       Then Select Reports Transacaction Reports Transaction Reports
    
     Scenario:
      Given User Clicks on View
      When Alert Message Pops Up
      Then Click on ok
       
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