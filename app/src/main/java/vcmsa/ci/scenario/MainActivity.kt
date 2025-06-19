package vcmsa.ci.scenario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference views from XML
        val playlistTextView: TextView = findViewById(R.id.playlistTextView)
        val playlistButton: Button = findViewById(R.id.playlistButton)
        val exitButton: Button = findViewById(R.id.exitButton)

        // Handle playlist button click
        playlistButton.setOnClickListener {
            // Example: Navigate to a new activity (PlaylistActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Handle exit button click
        exitButton.setOnClickListener {
            finish() // Closes the activity
        }
    }
}







