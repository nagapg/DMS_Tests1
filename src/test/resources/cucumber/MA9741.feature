Feature: Testing  MA 9741

Scenario Outline:
       Given  Given User goes to MAGIC_ValidateMA9741
       And "<aff>" "<abo>" "<per>" entered 
       And  Click on submit 
       And Payment Inquiry Invoice Inquiry is Selected
       When Click on Orange Link 
       And Click on Amount
       Then Bonus amount displays
       And Click on Cross to close 
       And Click on back button
       And Close QA

    Examples:
     | aff | abo | per |
     | 010 | 9995 | 042017 |
     
     
     