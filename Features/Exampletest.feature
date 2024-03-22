Feature: Hotel App Login
Scenario Outline: Login Successful
Given I am on Hotel App Login Page
When I enter username as <Username>
And I enter password as <Password>
And I click Login
Then I am Logged in Successfully
Examples: 
		|Username|Password|
		|"vasuvespag"|"vasu1234"|
		|"Sriyaseth"|"Sriya@86"|
		|"Varsharaj"|"Varsharaj"|
		|"jastisrija"|"OY38RV"|
		|"chaithuuu"|"12309876"|
		
		