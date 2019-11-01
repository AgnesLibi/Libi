Feature: Educational Details

Scenario: Verify the title of Educational Details
Given user is on Educational Details page
Then check Whether the title matches or not

Scenario: Verify the Graduation
Given user is on Educational Details page
When user enters invalid Graduation
Then displays 'Please Select Graduation'

Scenario: Verify the percentage
Given user is on Educational Details page
When user enters invalid Percentage
Then displays 'Please fill Percentage detail'

Scenario: Verify the Passing Year
Given user is on Educational Details page
When user enters invalid Passing Year
Then displays 'Please fill Passing Year'

Scenario: Verify the Project Name
Given user is on Educational Details page
When user enters invalid Project Name
Then displays 'Please fill Project Name'

Scenario: Verify the Techonologies used
Given user is on Educational Details page
When user enters Techonologies used
Then displays 'Please select Techonologies Used'

Scenario: Verify the other Techonologies used
Given user is on Educational Details page
When user enters other Techonologies used
Then displays 'Please fill other Techonologies Used'

Scenario: Click on Register Button
Given user is on Educational Details page
When user enters valid details
Then displays Your Registration Has successfully done 