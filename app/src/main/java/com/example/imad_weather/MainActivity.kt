package com.example.myapp


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.imad_weather.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonToSecond: Button = findViewById(R.id.buttonToSecond)
        buttonToSecond.setOnClickListener {

        }
    }
    class WeeklyWeatherManager {

        // Define arrays to store weather data for each day
        private val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        private val temperatures = arrayOf(25, 26, 27, 28, 29, 30, 31) // Example temperature data
        private val conditions = arrayOf("Sunny", "Cloudy", "Rainy", "Stormy", "Partly Cloudy", "Windy", "Snowy") // Example condition data

        // Function to get weather data for a specific day
        private fun getWeatherForDay(dayIndex: Int): String {
            // Check if the dayIndex is within the valid range
            return if (dayIndex in 0 until daysOfWeek.size) {
                // Get the weather data for the specified day
                val day = daysOfWeek[dayIndex]
                val temperature = temperatures[dayIndex]
                val condition = conditions[dayIndex]
                "Weather for $day: Temperature: $temperature°C, Condition: $condition"
            } else {
                // Return an error message if the dayIndex is out of range
                "Invalid day index"
            }
        }

        // Function to print weather data for the entire week
        fun printWeeklyWeather() {
            for (i in daysOfWeek.indices) {
                println(getWeatherForDay(i))
            }
        }
    }

    fun main() {
        val weeklyWeatherManager = WeeklyWeatherManager()
        weeklyWeatherManager.printWeeklyWeather()
    }

}

