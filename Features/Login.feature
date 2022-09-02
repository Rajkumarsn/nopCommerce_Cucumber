Feature: Login

Scenario: Successful Login with valid credentials
   Given User Launch Chrome browser
   When User open URL "https://admin-demo.nopcommerce.com/"
   And User enter Email as "admin@yourstore.com" and Password as "admin"
   And Click on Login
   Then Page Title should be "Dashboard / nopCommerce administration"
   When User click on Log out link
   Then page Title should be "Your store. Login"
   And Close the browser