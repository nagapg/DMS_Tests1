Feature: Testing Sample

Scenario Outline:
       Given Open Browser and Navigate to MAGIC Gamma1
       And "<aff>" "<abo>" "<period>" entered Click on submit and Go to  Maintenance GIP  Baseline Rerun1
      And Enter eff PY1
      When Click on Rerun button1
      Then Capture the success message1
      And Close the browser1
     
     Examples:
     | aff | abo | period |
     | 430 | 46 | 042017 |
