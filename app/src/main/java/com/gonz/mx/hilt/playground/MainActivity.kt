package com.gonz.mx.hilt.playground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< Updated upstream
import android.widget.Toast
=======
import android.util.Log
>>>>>>> Stashed changes
import androidx.activity.viewModels
import com.gonz.mx.hilt.playground.app.MyClass
import com.gonz.mx.hilt.playground.app.SecondActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var myClass: MyClass
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< Updated upstream
        Toast.makeText(this, myClass.toString(), Toast.LENGTH_LONG).show()
        text.setOnClickListener {
            Intent(this, SecondActivity::class.java).let {
                startActivity(it)
            }
        }
=======
        Log.v("TEST",mainViewModel.getStrings())
        Log.v("TEST",mainViewModel.getAnotherString())
>>>>>>> Stashed changes
    }
}
