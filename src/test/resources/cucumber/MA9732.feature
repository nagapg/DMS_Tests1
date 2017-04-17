Feature: Testing  MA 9732

Scenario Outline:
       Given Open Browser and Navigate to MAGIC Gamma
       And "<aff>" "<abo>" "<period>" entered Click on submit and Go to  Maintenance GIP  Baseline Rerun
      And Enter eff PY 
      When Click on Rerun button 
      Then Capture the success message
      And Close MAGIC Gamma
      
     Examples:
     | aff | abo | period |
     | 430 | 243744 | 042017 |
    | 430 | 110697 | 042017 |
   | 430 | 608326 | 042017 |
     
    
