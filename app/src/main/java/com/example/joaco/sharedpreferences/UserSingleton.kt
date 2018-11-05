package com.example.joaco.sharedpreferences

import android.app.Application
import android.content.Context.MODE_PRIVATE

class UserSingleton(application: Application) {
    companion object {


        var INSTANCE: UserSingleton? = null

        fun getInstance(application: Application): UserSingleton =
                INSTANCE ?: synchronized(this) {
                    INSTANCE ?: UserSingleton(application).also {
                        INSTANCE = it
                    }
                }
    }
        var mPreferences = application.getSharedPreferences("Preferences", MODE_PRIVATE)

        fun saveData(data: String) {
            mPreferences.edit().apply()
            {
                this.putString("u-tad",data)

            }.apply()

        }
    fun loadData() = mPreferences.getString("u-tad",null)
}