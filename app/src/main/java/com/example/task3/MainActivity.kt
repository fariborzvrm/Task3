package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.muddzdev.styleabletoast.StyleableToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : PublicMethods()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf("Contacts","Calls","Saved Messages","Settings")
        val adapter = Adapter(items){
            showToast(it)
        }
        recyclerView.adapter = adapter

    }

}
