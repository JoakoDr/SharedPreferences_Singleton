package com.example.joaco.sharedpreferences

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        var prefs:SharedPreferences = getSharedPreferences("Preferencias",MODE_PRIVATE).also {
            savePreferences(it)
            var email = loadPreferences(it)
            Log.d(this.localClassName, email.toString())
        }
    }
    private fun savePreferences(prefs: SharedPreferences)
    {
        prefs.edit().also {
            it.putString("Nombre", "Joaquin Diaz")
            it.putString("email" , "joaoco@hotmail.com")

        }.apply()
    }
   /* private fun loadPreferences(prefs: SharedPreferences)
    {

     return prefs.getString("email","lol@hotmail.com") //?: "default@email.com"
    }
    */
    fun loadPreferences(prefs: SharedPreferences) = prefs.getString("email","lol@hotmail.com") //?: "default@email.com"
    */
        UserSingleton.getInstance(application).saveData("u-tad")
        UserSingleton.getInstance(application).loadData()

    }
}
