package pk.edu.iqra.simplelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        val message = intent.extras?.getString("Name")
        val message = intent?.extras?.getString("Name") ?: "Guest"

        var Welcometext = findViewById<TextView>(R.id.WelcomeText)
        var text = "Welcome $message"
        Welcometext.text = text

        var Logout = findViewById<Button>(R.id.Logout_Button)
        val Menu_Button = findViewById<Button>(R.id.btn_Menu)

        Menu_Button.setOnClickListener {
            Intent(this@HomeActivity,MenuActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }

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