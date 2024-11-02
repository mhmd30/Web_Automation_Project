@RegressionTest

Feature: Test Register Functionality

  Background:
    Given  User Navigate To Register Page Register

  # TC01
  Scenario: Validate Register using valid credentials
    When   User Enters Valid First Name Register
    And    User Enters Valid Last Name Register
    And    User Enters Valid Email Register
    And    User Enters Valid Telephone Register
    And    User Enters Valid Password Register
    And    User Enters Valid Password Confirm Register
    And    User Chooses Subscription for Newsletter Register
    And    User Clicks on Check Privacy Register
    And    User Clicks on Continue Button Register
    Then   User Should Register Successfully Register

  # TC02
  Scenario: Validate Register using invalid credentials
    When   User Enters InValid First Name Register
    And    User Enters InValid Last Name Register
    And    User Enters InValid Email Register
    And    User Enters InValid Telephone Register
    And    User Enters InValid Password Register
    And    User Enters InValid Password Confirm Register
    And    User Clicks on Continue Button Register
    Then   User Should See Error Message for First Name Register
    Then   User Should See Error Message for Last Name Register
    Then   User Should See Error Message for Telephone Register
    Then   User Should See Error Message for Password Register
    Then   User Should See Error Message for Password Confirm Register

  # TC03
  Scenario: Validate Register using invalid First Name
    When   User Enters InValid First Name Register
    And    User Enters Valid Last Name Register
    And    User Enters Valid Email Register
    And    User Enters Valid Telephone Register
    And    User Enters Valid Password Register
    And    User Enters Valid Password Confirm Register
    And    User Chooses Subscription for Newsletter Register
    And    User Clicks on Check Privacy Register
    And    User Clicks on Continue Button Register
    Then   User Should See Error Message for First Name Register

  # TC04
  Scenario: Validate Register using invalid Last Name
    When   User Enters Valid First Name Register
    And    User Enters InValid Last Name Register
    And    User Enters Valid Email Register
    And    User Enters Valid Telephone Register
    And    User Enters Valid Password Register
    And    User Enters Valid Password Confirm Register
    And    User Chooses Subscription for Newsletter Register
    And    User Clicks on Check Privacy Register
    And    User Clicks on Continue Button Register
    Then   User Should See Error Message for Last Name Register

  # TC05
  Scenario: Validate Register using Invalid Email
    When   User Enters Valid First Name Register
    And    User Enters Valid Last Name Register
    And    User Enters InValid Email Register
    And    User Enters Valid Telephone Register
    And    User Enters Valid Password Register
    And    User Enters Valid Password Confirm Register
    And    User Chooses Subscription for Newsletter Register
    And    User Clicks on Check Privacy Register
    And    User Clicks on Continue Button Register
    Then   User Should See Error Message for Email Register

  # TC06
  Scenario: Validate Register using Invalid Telephone
    When   User Enters Valid First Name Register
    And    User Enters Valid Last Name Register
    And    User Enters Valid Email Register
    And    User Enters InValid Telephone Register
    And    User Enters Valid Password Register
    And    User Enters Valid Password Confirm Register
    And    User Chooses Subscription for Newsletter Register
    And    User Clicks on Check Privacy Register
    And    User Clicks on Continue Button Register
    Then   User Should See Error Message for Telephone Register

  # TC07
  Scenario: Validate Register using Invalid Password
    When   User Enters Valid First Name Register
    And    User Enters Valid Last Name Register
    And    User Enters Valid Email Register
    And    User Enters Valid Telephone Register
    And    User Enters InValid Password Register
    And    User Enters Valid Password Confirm Register
    And    User Chooses Subscription for Newsletter Register
    And    User Clicks on Check Privacy Register
    And    User Clicks on Continue Button Register
    Then   User Should See Error Message for Password Register

  # TC08
  Scenario: Validate Register using Invalid Password Confirm
    When   User Enters Valid First Name Register
    And    User Enters Valid Last Name Register
    And    User Enters Valid Email Register
    And    User Enters Valid Telephone Register
    And    User Enters Valid Password Register
    And    User Enters InValid Password Confirm Register
    And    User Chooses Subscription for Newsletter Register
    And    User Clicks on Check Privacy Register
    And    User Clicks on Continue Button Register
    Then   User Should See Error Message for Password Confirm Register

  # TC09
  Scenario: Validate Register using Invalid Check Privacy
    When   User Enters Valid First Name Register
    And    User Enters Valid Last Name Register
    And    User Enters Valid Email Register
    And    User Enters Valid Telephone Register
    And    User Enters Valid Password Register
    And    User Enters Valid Password Confirm Register
    And    User Chooses Subscription for Newsletter Register
    And    User Clicks on Continue Button Register
    Then   User Should See Error Message for Check Privacy Register

  # TC10
  Scenario: Validate Register using valid credentials but email already registered
    When   User Enters Valid First Name Register
    And    User Enters Valid Last Name Register
    And    User Enters Valid Registered Email Register
    And    User Enters Valid Telephone Register
    And    User Enters Valid Password Register
    And    User Enters Valid Password Confirm Register
    And    User Chooses Subscription for Newsletter Register
    And    User Clicks on Check Privacy Register
    And    User Clicks on Continue Button Register
    Then   User Should See Error Message for Already Registered Register