Feature: Torus Login

Scenario Outline: Login using Mobile

Given User Launch Chrome Browser
When User opens URL as "<url>"
And User clicks on Signup using  Mobile number
And User enters mobile number"<MobileNumber>"
And User clicks on continue button also clicks on skip button
And User enters the received OTP "<otp>"
And useer clicks on continue button
Then user enters first name "<FirstName>"
Then User enters Middle name "<MiddleName>"
Then User enters Last name "<Lname>"
Then User enters Email Address "<Email>"
Then User clicks on Continue
Then User enters new Mpin "<MPIN>"
Then User re-enters Mpin "<mpin>"
Then User submits the MPIN
Then User enters the set Mpin "<EMpin>"
Then User verify the entered

Examples:
|url| MobileNumber | otp | FirstName | MiddleName | Lname | Email |MPIN | mpin | EMpin |
| https://proto.heytorus.com | 1234567890 | 123456 | Sameer | Premsingh | Butola | 111godson123@gmail.com| 1111 | 1111 | 1111 |