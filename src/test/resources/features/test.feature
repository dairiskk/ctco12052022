Feature: Vacancies page

  Scenario: Contains valid amount of test automation vacancies1
    Given Log in to https://ctco.lv/en page
    Then Open Careers menu and click Vacancies from the list
    Then Open vacancy with title Test Automation Engineer
    Then Verify that paragraph under Professional skills and qualification: contains exactly 8 skills.