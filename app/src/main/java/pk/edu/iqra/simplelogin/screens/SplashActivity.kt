package pk.edu.iqra.simplelogin.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import pk.edu.iqra.simplelogin.MainActivity
import pk.edu.iqra.simplelogin.R

class SplashActivity : AppCompatActivity() {

    private val handler = Handler()
    private lateinit var runnable: Runnable

    private var SampleObj : Sample? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        runnable = Runnable{
            Intent(this@SplashActivity,MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }
        System.out.println(SampleObj?.method1())
        handler.postDelayed(runnable,3000)
    }

    override fun onDestroy() {
        super.onDestroy()

        handler.removeCallbacks(runnable)
    }
    class Sample(val a:String,val b:String){
        fun method1() = "hello world"
    }
}