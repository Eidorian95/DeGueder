package com.adrianiglesia.climaapp

import android.content.Context
import android.net.ConnectivityManager

class Network {

    companion object {


        fun hayRed(activity:MainActivity):Boolean{
            val conManager  = activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val netInfo = conManager.activeNetworkInfo
            return netInfo != null && netInfo.isConnected
        }



    }

}