Mathew Mosbach ST10435414


This application was desgined to check the weather weekly and give in depth information about the weather.
https://github.com/MMST104/Mathew_Mosbach_ST10435414_PE/tree/master

1. Start
2. Display welcome message and instructions to the user
3. Prompt the user to enter their location (city name, ZIP code, etc.)
4. Read user input for location
5. Check if the location input is valid:
   If valid, proceed to step 6
   If invalid, display an error message and return to step 3
6. Retrieve weather data for the specified location:
    Send a request to a weather API with the user's location
    Receive weather data response from the API
7. Check if the weather data response is valid:
   If valid, proceed to step 8
   If invalid or incomplete, display an error message and return to step 3
8. Parse the weather data response:
   Extract relevant information such as temperature, humidity, wind speed, etc.
9. Display the weather information to the user:
   Show the current weather conditions (temperature, humidity, etc.)
   Optionally, display additional information like forecast for upcoming days
10. Ask the user if they want to perform another action:
    If yes, return to step 3
    If no, display a farewell message and end the program
11. End
