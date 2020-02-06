package com.example.task3

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.muddzdev.styleabletoast.StyleableToast

open class PublicMethods : AppCompatActivity() {

    fun showToast(msg : String){
        StyleableToast.makeText(this,msg,Toast.LENGTH_LONG,R.style.mytoast).show()
    }

}