package vcmsa.ci.scenario

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainScreen : AppCompatActivity() {

    private lateinit var songNameTextView: TextView
    private lateinit var artistNameTextView: TextView
    private lateinit var commentsTextView: TextView
    private lateinit var nextButton: Button
    private lateinit var sendAllButton: Button // New Button to trigger Intent

    private var currentIndex = 0

    // Arrays of data
    private val songs = arrayOf("Song One", "Song Two", "Song Three")
    private val artists = arrayOf("Artist A", "Artist B", "Artist C")
    private val comments = arrayOf("Awesome!", "Nice beat", "Loved the lyrics")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        // Connect views
       val songNameTextView = findViewById<TextView>(R.id.songnameTextView)
        val artistNameTextView = findViewById<TextView>(R.id.artistnameTextView)
        val commentsTextView = findViewById<TextView>(R.id.commentsTextView)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val playlistButton = findViewById<Button>(R.id.playlistButton)
        // New button to send data


        // Set initial content
        updateTextViews()

        nextButton.setOnClickListener {
            currentIndex = (currentIndex + 1) % songs.size
            updateTextViews()
        }


        playlistButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            // Using loop to combine data (for demonstration)
            val combinedList = ArrayList<String>()
            for (i in songs.indices) {
                combinedList.add("Song: ${songs[i]}, Artist: ${artists[i]}, Comment: ${comments[i]}")
            }

            // Send combined list to next activity
            intent.putStringArrayListExtra("combinedList", combinedList)
            startActivity(intent)
        }
    }

    private fun updateTextViews() {
        songNameTextView.text = songs[currentIndex]
        artistNameTextView.text = artists[currentIndex]
        commentsTextView.text = comments[currentIndex]
    }
}








