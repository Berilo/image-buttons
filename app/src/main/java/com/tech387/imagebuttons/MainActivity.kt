package com.tech387.imagebuttons

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tech387.imagebuttons.databinding.MainActBinding

class MainActivity : AppCompatActivity(), MainListener {

    private lateinit var binding: MainActBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.main_act)
        binding.apply {
            listener = this@MainActivity
        }
    }

    override fun onCarClick(type: String) {
        Log.d("onCarClick", "$type clicked")

        Toast.makeText(this, type, Toast.LENGTH_SHORT).show()

    }


}