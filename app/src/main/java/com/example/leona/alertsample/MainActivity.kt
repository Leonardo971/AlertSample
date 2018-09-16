package com.example.leona.alertsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val button1 =findViewById<Button>(R.id.button1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClickShowAlert(v:View)
    {
        val myAlertBuilder= AlertDialog.Builder(this@MainActivity)
        myAlertBuilder.setTitle(getString(R.string.alert_title))
        myAlertBuilder.setMessage(getString(R.string.alert_message))

        myAlertBuilder.setPositiveButton(R.string.ok){dialog, which ->
            Toast.makeText(applicationContext,R.string.pressed_ok,Toast.LENGTH_SHORT).show()
            
        }

        myAlertBuilder.setNegativeButton(R.string.cancel){dialog, which ->
            Toast.makeText(applicationContext,R.string.pressed_cancel,Toast.LENGTH_SHORT).show()
        }
        myAlertBuilder.show()
    }
}
