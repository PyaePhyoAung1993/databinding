package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

          var person = Person("Mg Mg","Developer")
 //       lateinit var person : Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)




        binding.btn.setOnClickListener {
        var person = Person(
               binding.edit1.text.toString(),
           binding.edit2.text.toString())

            binding.person = person
        }




//        txtname.text = person.name
//        txtOccupation.text = person.occupation




    }
}