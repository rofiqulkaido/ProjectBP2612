package com.example.rofiqul2612

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.rofiqul2612.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    lateinit var binding:ActivityBookKidBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //event saat button fairy di klik
        binding.buttonFairy.setOnClickListener {
            replaceFragment(FairyFragment())
        }
        //event saat button Fable di klik
        binding.buttonFable.setOnClickListener {
            replaceFragment(FableFragment())
        }
        //event saat button Science di klik
        binding.buttonScience.setOnClickListener {
            replaceFragment(ScienceFragment())
        }
    }

    //ganti fragment
    fun replaceFragment(frg: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }

}