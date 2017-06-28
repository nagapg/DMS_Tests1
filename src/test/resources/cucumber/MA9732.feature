Feature: Validate Baseline Rerun Screen

Scenario:
       Given Open Baseline Rerun
       When Enter eff PY and Click Rerun 
       Then Capture success message
       And Close Baseline Rerun
  