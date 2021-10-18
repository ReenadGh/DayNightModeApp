package com.example.daynightproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var main : ConstraintLayout
    lateinit var input :EditText
    lateinit var chnageButton  : Button
    lateinit var switchNightMode : Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main = findViewById(R.id.main)
        input = findViewById(R.id.mode)
        chnageButton = findViewById(R.id.button)
        switchNightMode = findViewById(R.id.switch1)









    }

    fun switchingMode(view: android.view.View) {



         if(input.text.toString().toLowerCase() == "night"|| switchNightMode.isChecked){

            ModeBackground.night(main)
            chnageButton.setTextColor(Color.parseColor("#FFFFFF"))
            input.setHintTextColor(Color.parseColor("#FFFFFF"))
            input.setTextColor(Color.parseColor("#FFFFFF"))
             switchNightMode.setTextColor(Color.parseColor("#FFFFFF"))

        }
        if(input.text.toString().toLowerCase() == "day" || !switchNightMode.isChecked){

             ModeBackground.day(main)

             chnageButton.setTextColor(Color.parseColor("#000000"))
             input.setHintTextColor(Color.parseColor("#000000"))
             switchNightMode.setTextColor(Color.parseColor("#000000"))


         }
        else{

            Toast.makeText(this, "wrong entring ! ", Toast.LENGTH_SHORT).show()
        }

    }
}


class ModeBackground{

companion object mode{

  fun day(layout : View){
      layout.setBackgroundResource(R.drawable.day)
  }
    fun night(layout : View){
        layout.setBackgroundResource(R.drawable.night)

    }

}


}