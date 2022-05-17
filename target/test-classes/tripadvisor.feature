Feature: Validating Hotel Booking in TripAdvisor Application

Scenario: Validating Hotel Booking with correct details

		Given user is on TripAdvisor page on chrome browser
		When user should enter location and search
		When user should enter trip details
		And user should click booknow button
		Then user should verify hotel is booked or not