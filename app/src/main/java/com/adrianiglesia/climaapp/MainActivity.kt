package com.adrianiglesia.climaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    var tvCiudad: TextView? = null
    var tvGrados: TextView? = null
    var tvEstatus: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViews()

        val ciudad = intent.getStringExtra("com.adrianiglesia.climaapp.ciudades.CIUDAD")


        if(Network.hayRed(this)){
            //021796f029899c4729fa13b2907c19d5
            //bs as id 3435910
            solicitudHTTPVolley("https://api.openweathermap.org/data/2.5/weather?id=3435910&APPID=e58457751dd77f08aaa32f45e7f53c0d&units=metric&lang=es")
        }else{

            Toast.makeText(this, "No hay red :(", Toast.LENGTH_LONG).show()
        }


       /* Toast.makeText(this, ciudad, Toast.LENGTH_LONG).show()

        val ciudadBsAs = Ciudad("Ciudad Autonoma de Buenos aires", 26, "Mayormente soleado")

        tvCiudad?.text = ciudadBsAs.nombre
        tvGrados?.text = ciudadBsAs.grados.toString() + "º"
        tvEstatus?.text = ciudadBsAs.estatus*/

    }


    private fun setViews(){
        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvEstatus = findViewById(R.id.tvEstatus)
    }

    //METODO PARA VOLLEY
    private fun solicitudHTTPVolley(url:String){

        val cola = Volley.newRequestQueue(this)

        val solicitud = StringRequest(Request.Method.GET, url, Response.Listener<String>{
                response ->
            try {

                val gson = Gson()
                val ciudad = gson.fromJson(response,Ciudad::class.java)

                tvCiudad?.text = ciudad.name
                tvGrados?.text = ciudad.main?.temp.toString()+"º"
                tvEstatus?.text = ciudad.weather?.get(0)?.description

                Log.d("NAME", "Nombre: "+ciudad.name)
            }catch (e: Exception){

            }
        }, Response.ErrorListener {  })


        cola.add(solicitud)
    }
}
