@RegressionTest

Feature: Test Login Functionality

  Background: User Navigate To Login Page
    Given  User Navigate To Login Page

  # TC01
  Scenario: Validate Login using valid credentials
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    Then   User Should Login Successfully

  #TC02
  Scenario: Validate Appearance Of Error Msg Using Invalid Email
    When   User Enters Invalid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    Then   User Should See Error Msg

  #TC03
  Scenario: Validate The Forget Password Button Functionality
    When   User Clicks On Forget Password Button
    Then   User Should See confirmation Msg of Forget Button Clicking

  #TC04
  Scenario: Validate The Forget Password Functionality with valid email
    When   User Clicks On Forget Password Button
    And    User Enters Valid Email in Forgotten Password Page
    And    User Clicks On Continue Button
    Then   User Should See confirmation Msg

  #TC05
  Scenario: Validate The Forget Password Functionality with invalid email
    When   User Clicks On Forget Password Button
    And    User Enters inValid Email in Forgotten Password Page
    And    User Clicks On Continue Button
    Then   User Should See Error Msg of Forget Button

  #TC06
  Scenario: Logged users could search for any product
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Navigate To Home Page
    And    User Clicks On Search TextBox
    And    User Enter The Desired Product
    And    User Clicks On Search Button
    Then   User Can Find The Desired Product

  #TC07
  Scenario: Logged Users could switch currencies to US
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Navigate To Home Page
    And    User Clicks On Drop Down List Of Currencies
    And    User Clicks On US Currency
    Then   User Can Find Prices In US Currency

  #TC08
  Scenario: Logged Users could switch currencies to Euro
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Navigate To Home Page
    And    User Clicks On Drop Down List Of Currencies
    And    User Clicks On Euro Currency
    Then   User Can Find Prices In Euro Currency

  #TC09
  Scenario: Hovering to main and sub categories randomly
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Can Hover Randomly to elements
    Then   User Can See subcategories

  #TC10
  Scenario: Logged Users could Add Item To Wishlist
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Clicks On Search TextBox
    And    User Enter The Desired Product
    And    User Clicks On Search Button
    And    User Can Add Item To Wishlist
    Then   User Can See A Wishlist Confirmation Msg

  #TC11
  Scenario: Logged Users could Add Item To Compare List
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Clicks On Search TextBox
    And    User Enter The Desired Product
    And    User Clicks On Search Button
    Then   User Can Find The Desired Product
    And    User Can Add Item To Compare List
    Then   User Can See A Compare List Confirmation Msg

  #TC12
  Scenario: Logged Users could Add Item To Shipping Cart
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Clicks On Search TextBox
    And    User Enter The Desired Product Mac
    And    User Clicks On Search Button
    And    User Can Add Item To Shipping Cart
    Then   User Can See A Shipping Cart Confirmation Msg

  #TC13
  Scenario: Users could sort searched elements
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Clicks On Search TextBox
    And    User Enter The Desired Product
    And    User Clicks On Search Button
    When   User Can Choose One Of List Elements
    Then   User Can See A Sorting Confirmation Msg

  #TC14
  Scenario: Users Can Use searching With subcategories
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Navigate To Search Page
    And    User Choose The subcategories
    And    User Clicks On Search in subcategories Check Button
    And    User Enter The Desired Product subcategories Mac
    And    User Clicks On Search subcategories Button
    Then   User Can See A subcategories searching Confirmation Msg

  #TC15
  Scenario: Users Can Show Prev And Next Swiper Buttons By Hovering at Image
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Navigate To Home Page
    And    User Hovers to Image
    Then   User Can See Prev And Next Swiper Buttons

  #TC16
  Scenario: Users Can See Items Add To Wish List Color Changed When Hovering On
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Navigate To Home Page
    And    User Hovers to Add To Wish List Icon
    Then   User Can See The Changed Color

  #TC17
  Scenario: Users Navigate To Home Page When They Click On The Logo
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Clicks On Logo Button
    Then   User Should Navigate To Home Page

  #TC18
  Scenario: Users Can Logout When They Click Logout From My Account
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Select Logout From My Account List
    Then   User Should Navigate To Logout Page
    #Select Logout From My Account List Problem

  #TC19
  Scenario: Users Can Change Password With Right Confirmation Password
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Clicks On Change Your Password
    And    User Enters New Password And Conformation Password
    And    User Clicks On Password Continue Button
    Then   User Gets An Assertion Changed Password Msg

  #TC20
  Scenario: Users Can Change Password With Wrong Confirmation Password
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Clicks On Change Your Password
    And    User Enters New Password And Wrong Conformation Password
    And    User Clicks On Password Continue Button
    Then   User Gets An Failed Changed Password Msg

  #TC21
  Scenario: Users Can Select Main Categories Randomly
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Navigate To Home Page
    And    User Select Main Categories Randomly

  #TC22
  #Scenario: Users Can Select Sub Categories Randomly
   #When   User Enters Valid Email
    #And    User Enters Valid Password
    #And    User Clicks On Login Button
    #And    User Navigate To Home Page
    #And    User Select Main and Sub Categories Randomly
    #problem

  #TC23
  Scenario: Logged Users Can Create an order with a successful payment
    When   User Enters Valid Email
    And    User Enters Valid Password
    And    User Clicks On Login Button
    And    User Clicks On Search TextBox
    And    User Enter The Desired Product
    And    User Clicks On Search Button
    And    User Can Add Item To Shipping Cart
    And    User Goes To Checkout
   #You need these steps only first time in your account
#############################################################
    #And    User Enters Valid First Name Checkout
    #And    User Enters Valid Last Name Checkout
    #And    User Enters Valid Address Checkout
    #And    User Enters Valid City Checkout
    #And    User Enters Valid Post Code Checkout
    #And    User Chooses Valid Country Checkout
    #And    User Chooses Valid Region Checkout
#############################################################
    And    User Clicks On Continue Button Billing Checkout
    And    User Clicks On Continue Button Delivery Checkout
    And    User Clicks On Continue Button Delivery Method Checkout
    And    User Clicks On Terms Check Button Checkout
    And    User Clicks On Continue Button Payment Method Checkout
    And    User Clicks On Continue Button Confirm Order Checkout
    Then   User Can Create an order with a successful payment