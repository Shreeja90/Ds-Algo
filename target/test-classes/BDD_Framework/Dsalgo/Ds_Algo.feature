Feature: Ds_Algo

  Scenario: Open DsAlgo portal
    Given The user opens DS Algo portal link
    Then The user should land in DS Algo portal page
    
  Scenario: Checking Get Started link
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage