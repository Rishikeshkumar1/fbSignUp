Feature: To create new account with invalid details and capture error
#  Scenario Outline: New Account with invalid details
#    Given Open Facebook Signup URL "https://www.facebook.com"
#    When Click on Create New Account
#    And Enter firstName "<fname>"
#    And Enter lastName "<lname>"
#    And Enter Mobile "<mobile>"
#    And Enter Password "<password>"
#    And Select Date for DOB "<day>" and Mon for "<mon>" and Year for "<year>"
#    And Select Gender "<gender>"
#    And Click on SignUp
#    Then Error should be "Please enter a valid mobile number or email address."
#    And Browser quit post completion



#    Examples:
#      | fname | lname | mobile    | password  | day | mon | year | gender |
#      | Mohan | Kumar | 911313562 | Mohan@123 | 17  | Jan | 2003 | Male   |

  Scenario Outline: New Account with invalid details
    Given Open Facebook Signup URL "https://www.facebook.com"
    When Click on Create New Account
    And Enter details from <index>
    And Click on SignUp
    Then Error should be "Please enter a valid mobile number or email address."
    Then Browser quit post completion

    Examples:
      | index |
      | 0     |
      | 1     |