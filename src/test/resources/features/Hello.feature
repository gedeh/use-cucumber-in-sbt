Feature: Cucumber in SBT uisng JUnit framework
    As a Scala developer using SBT
    I want to run Cucumber test using SBT task
    So that I can run my CUucmber test via terminal

    Scenario: Example addition for a calculator
        Given a calculator
         When 1 + 1 is submitted
         Then it should show result 2

    Scenario: Example multiplication for a calculator
        Given a calculator
         When 5 x 4 is submitted
         Then it should show result 20

    Scenario: Example division for a calculator
        Given a calculator
         When 8 / 4 is submitted
         Then it should show result 2
