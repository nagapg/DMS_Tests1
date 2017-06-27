Feature: Validate MAGIC Screens

Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
       And "<aff>" "<abo>" "<period>" submitted 
       Then Capture Dashboard
        And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |

    Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
        And "<aff>" "<abo>" "<period>" submitted 
        When AwardDetails is selected
        Then Capture Award Details
         And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |

   Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
        And "<aff>" "<abo>" "<period>" submitted
         When AwardSearch is selected
         Then Capture Award Search
        And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |
     
Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
        And "<aff>" "<abo>" "<period>" submitted
         When FAA is selcted
         Then Capture FAA
         And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |

Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
        And "<aff>" "<abo>" "<period>" submitted
         When Frontliner Map is selected
         Then Capture Frontliner Map
          And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |

  
 Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
        And "<aff>" "<abo>" "<period>" submitted
         When FTAQRpts is selected
         Then Capture FTAQRpts
         And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |
   
Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
        And "<aff>" "<abo>" "<period>" submitted
        When LOS Map is selected
        Then Capture LOS Map
       And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |
         
Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
        And "<aff>" "<abo>" "<period>" submitted
        When Qualifications is selected
        Then Capture Qualifications
        And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |
      
Scenario Outline:
       Given User navigates to https://magic-gamma/EBS_UI_Web/Magic
        And "<aff>" "<abo>" "<period>" submitted
        When Volumes is selected
        Then Capture Volumes
        And Close https://magic-gamma/EBS_UI_Web/Magic
    
     Examples:
      | aff   | abo   | period   |
     | 010 | 9995 | 062017 |
      
    
