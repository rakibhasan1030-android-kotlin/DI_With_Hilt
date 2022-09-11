package rakib.hasan.di_with_hilt

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor() {

    companion object{
        val className: String = Car::class.java.simpleName
    }

    fun getCar(){
        Log.v(MainActivity.className, "Car is Running!")
    }

}