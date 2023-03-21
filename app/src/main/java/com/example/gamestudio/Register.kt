package com.example.gamestudio
import com.google.firebase.auth.FirebaseAuth
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gamestudio.databinding.ActivityRegisterBinding
import com.google.firebase.FirebaseApp
class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    lateinit var etEmail: EditText
    lateinit var etConfPass: EditText
    private lateinit var etPass: EditText
    private lateinit var btnSignUp: Button
    lateinit var inputUsername : EditText
    lateinit var tvRedirectLogin: TextView

    // create Firebase authentication object
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        // Firebase configuration

        FirebaseApp.initializeApp(this)


        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)
        binding.alreadyHaveAccount.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    Login::class.java
                )
            )
        }

        // View Bindings
        inputUsername= findViewById(R.id.inputUsername)
        etEmail = findViewById(R.id.inputEmail)
        etConfPass = findViewById(R.id.inputConformPassword)
        etPass = findViewById(R.id.inputPassword)
        btnSignUp = findViewById(R.id.btnRegister)
        // Initialising auth object
        FirebaseApp.initializeApp(this)
        auth = FirebaseAuth.getInstance()
        btnSignUp.setOnClickListener {
            signUpUser()
        }
    }

    private fun signUpUser() {
        val email = etEmail.text.toString()
        val pass = etPass.text.toString()
        val confirmPassword = etConfPass.text.toString()

        // check pass
        if (email.isBlank() || pass.isBlank() || confirmPassword.isBlank()) {
            Toast.makeText(this, "Email and Password can't be blank", Toast.LENGTH_SHORT)
                .show()
            return
        }

        if (pass != confirmPassword) {
            Toast.makeText(this, "Password and Confirm Password do not match", Toast.LENGTH_SHORT)
                .show()
            return
        }
        // If all credential are correct
        // We call createUserWithEmailAndPassword
        // using auth object and pass the
        // email and pass in it.
        auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Successfully Singed Up", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Singed Up Failed!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}