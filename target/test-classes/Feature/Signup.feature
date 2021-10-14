Feature: Uniform feature

  Background: login page
    Given User is on Uniform Application
    When User enter "Username" and "Password"
    And click on Login button
    Then User navigate to the Dashboard

  Scenario: User go to Gift Voucher
    Given User click on shopping icon
    Then User click on Gift Voucher option
    And User select gift voucher
    Then User will navigate to Gift Voucher option

  Scenario Outline: Add Gift voucher
    Given User click on shopping icon
    Then User click on Gift Voucher option
    And User select gift voucher
    Then User click on Add symbol
    When User enter "<code>","<From name>","<From E-Mail>","<To name>","<To E-Mail>","<Theme>","<Message>","<Amount>"
    And User will save the details
    Then User will go to Gift voucher dashboard

    Examples: 
      | code    | From name | From E-Mail    | To name | To E-Mail     | Theme    | Message | Amount |
      | i9l78x3 | Rohan     | rhnn@gmail.com | ria     | r@gmail.com   | Diwali   | hey     |    300 |
      | rftp8r  | Sam       | sam@gmail.com  | swarup  | swa@gmail.com | Birthday | MESSS   |    400 |

  Scenario Outline: Send voucher
    Given User click on shopping icon
    Then User click on Gift Voucher option
    And User select gift voucher
    Then User click on Add symbol
    When User enter "<code>","<From name>","<From E-Mail>","<To name>","<To E-Mail>","<Theme>","<Message>","<Amount>"
    And User will save the details
    Then User will go to Gift voucher dashboard
    And User will select the check box coupn
    Then User will send Gift Voucher

    Examples: 
      | code     | From name | From E-Mail    | To name | To E-Mail   | Theme  | Message | Amount |
      | klr678t6 | Rohan     | rhnn@gmail.com | ria     | r@gmail.com | Diwali | hey     |    300 |

  Scenario Outline: Voucher Edit
    Given User click on shopping icon
    Then User click on Gift Voucher option
    And User select gift voucher
    Then User click on Edit button
    When User enter "<code>","<From name>","<From E-Mail>","<To name>","<To E-Mail>","<Theme>","<Message>","<Amount>"
    And User will save the details

    Examples: 
      | code        | From name | From E-Mail | To name | To E-Mail | Theme | Message | Amount |
      | k7thg87 hju |           |             |         |           |       |         |        |

  Scenario: Marketing Reports Mails
    When user click on Uniform Admin button
    And click on Reports
    Then click on Marketing option
    And select Marketing
    Then User will navigate to marketing report dashboard

  Scenario: Marketing To get all Marketing Reports Details
    When user click on Uniform Admin button
    And click on Reports
    Then click on Marketing option
    And select Marketing
    Then User will navigate to marketing report dashboard
    And User will select start date
    And select order status
    And User Select End date
    Then click on Filter

  Scenario: Vouchere theme
    Given User click on shopping icon
    Then User click on Gift Voucher option
    And click on Voucher Theme
    Then user will navigate to voucher theme dashboard

  Scenario Outline: Create Voucher Themes
    Given User click on shopping icon
    Then User click on Gift Voucher option
    And click on Voucher Theme
    Then user will navigate to voucher theme dashboard
    And Select on add button
    And create voucher themes "<Voucher Theme Name>"
    And select on image icon
    And select on image
    Then click on save button

    Examples: 
      | Voucher Theme Name |
      | The cat Theme      |

  Scenario: Edit Voucher Themes
    Given User click on shopping icon
    Then User click on Gift Voucher option
    And click on Voucher Theme
    Then user will navigate to voucher theme dashboard
    And Select on edit button
    And select on image Icon
    And change image
    Then click on save button

  Scenario: Pagination Gift Voucher
    Given User click on shopping icon
    Then User click on Gift Voucher option
    And User select gift voucher
    Then select different pages

  Scenario Outline: Bug sending Mail
    When user click on Uniform Admin button
    And select on Marketing option
    And select Mail option
    Then user navigate to select option
    And Enter "<From>","<To>","<Subject>","<Message>"
    Then click on Send button
    Then user navigate success message

    Examples: 
      | From    | To            | Subject | Message                 |
      | Default | All Customers | uniform | This is uniform message |
