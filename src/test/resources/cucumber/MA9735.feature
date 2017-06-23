Feature: Validate Hierarchy in Region Security Screen

Scenario Outline:
       Given User navigates to Server and open FF browser
        And Opens MAGIC QA
       When "<aff>" "<abo>" "<period>" entered
       And navigates to Region Security Screen
       Then Validate Expand All and Collapse All
      And Close Region Security Screen
      
       Examples:
     | aff | abo | period |
     | 010 | 9995 | 062017 |