Feature: MAGIC Screens

Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         Then Capture Dashboard
       And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |
    
Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to AwardDetails
       Then Capture Award Details
       And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |

Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to AwardSearch
       Then Capture Award Search
       And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |
     
Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to FAA
       Then Capture FAA
       And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |

Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to Frontliner Map
       Then Capture Frontliner Map
        And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |

 Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to FTAQRpts
       Then Capture FTAQRpts
      And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |
  
 Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to LOS Map
       Then Capture LOS Map
      And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |
       
 Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to Qualifications
       Then Capture Qualifications
       And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |
       
 Scenario Outline:  
         Given user navigates to GAMMA
         And "<aff>" "<abo>" "<period>" entered and click on submit 
         When navigated to Volumes
       Then Capture Volumes
       And Close Gamma
         
         Examples:
         | aff | abo | period |
         | 010 | 9995 | 062017 |