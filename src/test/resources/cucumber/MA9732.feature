Feature: Testing  MA 9732

Scenario Outline:
       Given User goes to MAGIC ValidateMA9732
       And "<aff>" "<abo>" "<period>" entered Click on submit and Go to  Maintenance GIP  Baseline Rerun
      And Enter eff PY 
      When Click on Rerun button 
      Then Capture the success message
      And Close MAGICGamma
    
    Examples:
     | aff | abo | period |
     | 430 | 46 | 042017 |
    
      