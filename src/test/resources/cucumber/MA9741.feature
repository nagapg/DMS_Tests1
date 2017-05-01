Feature: Testing  MA 9741

Scenario Outline:
       Given Open Browser 
       And Navigate to QA
       And "<aff>" "<abo>" <"period"> entered 
       And  Click on submit 
       And Payment Inquiry Invoice Inquiry is Selected
       When Click on Orange Link 
       And Click on Amount
       Then Bonus amount displays
       And Click on Cross to close 
       And Click on back button
       And Close QA

    Examples:
     | aff | abo | period |
     | 010 | 9995 | 042017 |
     | 430 | 46 | 042017 |
     
     