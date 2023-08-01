package pk.edu.iqra.simplelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var Logout = findViewById<Button>(R.id.Logout_Button)

        Logout.setOnClickListener {
            Intent(this@HomeActivity, MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }

        }

    }

    override fun onBackPressed() {
//        super.onBackPressed()
    }
}