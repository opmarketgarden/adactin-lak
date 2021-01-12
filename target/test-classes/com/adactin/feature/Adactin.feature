Feature: Bassic funcanality in adactin application
@smoke
Scenario: Verify if user is able to login the application 
Given user launches the application
When   userenters the the username in user feild
And  user enters the in the password feild
And  clicks the login button
Then  the user verifies the homepage and navigates to the search hotel page


Scenario: Verify if user is able to enter all details in all fields in page
Given  user is in the searchhotel page
When  user selects datafrom dropdownlist
And user enters data in text feild
And clicks search button
Then verify user is in the next feild

Scenario: Verify if suggestion for hotel appear abd user is able to selct and move to payment
Given  user is the the bookingpage
When user is able to select the hotel using radio btn
And user is able to selevt subbmit_btn
Then verify user is able to move to next page

