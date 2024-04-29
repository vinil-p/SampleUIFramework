@tag
Feature: validate hyperlinks Feed

  @bulls
  Scenario: Find all the hyperlinks of the Footer links into a CSV file and report if any duplicate hyperlinks are present
    Given launch NBA bulls "https://www.nba.com/bulls/" in "edge" browser
    When validate user is on homepage "Bulls - The official site of the NBA for the latest NBA Scores, Stats & News. | NBA.com".
    Then Get All footer hyperlinks
    Then close browser
