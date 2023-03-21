package com.example.gamestudio
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.gamestudio.databinding.ActivityWelcomeScreenBinding
import com.google.firebase.auth.FirebaseAuth
import com.example.gamestudio.Register
class WelcomeScreen : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeScreenBinding
    private lateinit var welcomeTitle: TextView
    private lateinit var btnSnake: ImageButton
    private lateinit var btnQuizz: ImageButton
    private lateinit var btnLogout: Button
    private lateinit var user : FirebaseAuth
    private var currentUser : String =""
    // Creating firebaseAuth object

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWelcomeScreenBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)
        user = FirebaseAuth.getInstance()
        // View Binding
        btnLogout = findViewById(R.id.btnLogout)
        btnLogout.setOnClickListener {
            logout()
        }
        welcomeTitle = findViewById(R.id.textView)
        currentUser= user.currentUser.toString()
        welcomeTitle.text ="Welcome "+ currentUser.subSequence(35 ,45)
        btnSnake = findViewById(R.id.snake)
        btnQuizz = findViewById(R.id.quizz)
        btnQuizz.setOnClickListener(){
            startActivity(Intent(this, com.example.gamestudio.quizz.MainActivity::class.java))
        }
    }

    private fun logout() {
        user.signOut()
        startActivity(Intent(this, Login::class.java))
    }

}