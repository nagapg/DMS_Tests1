Feature: Baseline Rerun Screen

  Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to Baseline Rerun
       And Enter eff PY and Click Rerun 
       Then Capture success message
      And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 430 | 46 | 062017 |