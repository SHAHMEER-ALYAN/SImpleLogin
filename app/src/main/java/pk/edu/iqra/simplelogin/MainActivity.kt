package pk.edu.iqra.simplelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var Username:EditText
    lateinit var Password:EditText
    lateinit var SignIN:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SignIN = findViewById<Button>(R.id.SignIn)

        Username = findViewById(R.id.UsernameID)

        Password = findViewById(R.id.PasswordID)

        SignIN.setOnClickListener {

            val username_details = Username.text.trim().toString()
            val password_details = Password.text.trim()

            if (username_details.isNotEmpty() && password_details.isNotEmpty()){

                if(username_details.contentEquals("USER") && password_details.contentEquals("123456")){
                    Toast.makeText(this@MainActivity,"LOGIN Successful",Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@MainActivity,HomeActivity::class.java).apply {

                        putExtra("Name", username_details)
                        startActivity(this)

                        finish()
                    }

                }
                else{
                    Toast.makeText(this@MainActivity,"Invalid Credentials",Toast.LENGTH_LONG).show()
                }

            }
            else{
                Toast.makeText(this@MainActivity,"Please Enter your Credentials",Toast.LENGTH_SHORT).show()
            }

        }


    }
}