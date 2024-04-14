@All
Feature: Test Amazon Application

  Background: 
    Given Open Amazon Application

  @HomePage
  Scenario: Test for Home Page Title
    When user captures actual title of HomePage
    Then Title should be matched with expected Homepage title

  #@BestSellers
  @ignore
  Scenario: Test for BestSellers Title
    When User opens best Seller page
    When User captures Best sellers page actual title
    Then Title should be matched with best sellers expected  title

  #@Mobiles
  @ignore
  Scenario: Test for Mobiles page Title
    When User opens Mobiles page
    When User captures  Mobiles page actual title
    Then Title should be matched with Mobiles  expected  title

  @TodaysDeals
  Scenario: Test for TodayDeals page Title
    When User opens TodayDeals page
    When User captures  TodayDeals page actual title
    Then Title should be matched with TodayDeals  expected  title
