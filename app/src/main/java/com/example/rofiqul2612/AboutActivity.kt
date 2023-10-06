package com.example.rofiqul2612
import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //val dial
        val imgCall : ImageView = findViewById(R.id.ImageViewCall)
        //perintah dial
        imgCall.setOnClickListener {
            val callIntent:Intent = Uri.parse("tel:083823308777").let {
                    number->Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }

        //val website
        val web : ImageView = findViewById(R.id.ImageViewWeb)
        //perintah website
        web.setOnClickListener {
            val webIntent:Intent = Uri.parse("https://home.amikom.ac.id/").let{
                    webpage->Intent(Intent.ACTION_VIEW,webpage)
            }
            startActivity(webIntent)
        }

        //val lokasi
        val location : ImageView = findViewById(R.id.ImageViewLocation)
        //perintah lokasi
        location.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:47.6, -122,3?z=11")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) !=null){
                startActivity(mapIntent)
            }
        }
    }


}