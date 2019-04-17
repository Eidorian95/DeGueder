package com.adrianiglesia.climaapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    var btClimaBsAs:Button? = null
    var btClimaUru:Button? = null
    var btClimaBr:Button? = null
    var btClimaMx:Button? = null
    var btClimaUs:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)
        setViews()

        val TAG = "com.adrianiglesia.climaapp.ciudades.CIUDAD"

        btClimaBsAs?.setOnClickListener(View.OnClickListener {

            Toast.makeText(this, "Obteniendo clima...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG,"3435910")
            startActivity(intent)
        })

        btClimaUru?.setOnClickListener(View.OnClickListener {

            Toast.makeText(this, "Obteniendo clima...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG,"3440777")
            startActivity(intent)
        })

        btClimaBr?.setOnClickListener(View.OnClickListener {

            Toast.makeText(this, "Obteniendo clima...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG,"3448439")
            startActivity(intent)
        })

        btClimaMx?.setOnClickListener(View.OnClickListener {

            Toast.makeText(this, "Obteniendo clima...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG,"3530597")
            startActivity(intent)
        })

        btClimaUs?.setOnClickListener(View.OnClickListener {

            Toast.makeText(this, "Obteniendo clima...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG,"5128581")
            startActivity(intent)
        })

    }


    private fun setViews(){

        btClimaBsAs = findViewById(R.id.btClimaBsAs)
        btClimaUru = findViewById(R.id.btClimaUru)
        btClimaBr = findViewById(R.id.btClimaBr)
        btClimaMx = findViewById(R.id.btClimaMx)
        btClimaUs = findViewById(R.id.btClimaUs)




    }
}
