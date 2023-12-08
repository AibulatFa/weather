package com.example.api.screens

import android.content.Context

class PreferenceManager(context: Context) {
    private val sharedPref = context.getSharedPreferences("my_preferences", Context.MODE_PRIVATE)


    fun saveCity(city: String) {
        with(sharedPref.edit()) {
            putString("city", city)
            apply()
        }
    }

    fun getCity(): String? {
        return sharedPref.getString("city", null)
    }

    fun removeCity() {
        with(sharedPref.edit()) {
            remove("city")
            apply()
        }
    }
}
