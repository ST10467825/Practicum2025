package vcmsa.ci.practicum2025

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

val songTitles = mutableListOf<String>()
val artistNames = mutableListOf<String>()
val ratings = mutableListOf<Float>()
val comments = mutableListOf<String>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var songTitleEditText: EditText
        var artistNameEditText: EditText
        var ratingEditText: EditText
        var commentsEditText: EditText

        //initialize the views and declarations
        songTitleEditText = findViewById(R.id.songTitleEditText)
        artistNameEditText = findViewById(R.id.artistNameEditText)
        ratingEditText = findViewById(R.id.ratingEditText)
        commentsEditText = findViewById(R.id.commentsEditText)

        val addButton = findViewById<Button>(R.id.addButton)
        val viewButton = findViewById<Button>(R.id.viewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        //add song to playlist
        addButton.setOnClickListener {
            try {
                val title = songTitleEditText.text.toString().trim()
                val artist = artistNameEditText.text.toString().trim()
                val ratingText = ratingEditText.text.toString().trim()
                val comment = commentsEditText.text.toString().trim()

                if (title.isEmpty() || artist.isEmpty() || ratingText.isEmpty() || comment.isEmpty()) {
                    Toast.makeText(this, "Please fill in all required fields (Title, Artist, Rating, Comment)", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val rating = ratingText.toFloat()
                if (rating < 0 || rating > 5) {
                    Toast.makeText(this, "Rating must be between 0 and 5", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                if (songTitles.size >= 4) {
                    Toast.makeText(this, "Playlist is full (max 4 songs)", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }

                //add to parallel arrays
                songTitles.add(title)
                artistNames.add(artist)
                ratings.add(rating)
                comments.add(comment)

                //clear fields
                songTitleEditText.text.clear()
                artistNameEditText.text.clear()
                ratingEditText.text.clear()
                commentsEditText.text.clear()

                Toast.makeText(this, "Song added to playlist!", Toast.LENGTH_LONG).show()
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Please enter a valid number for rating.", Toast.LENGTH_LONG).show()
            } catch (e: Exception) {
                Toast.makeText(this, "An error occured: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }
        //view playlist
        viewButton.setOnClickListener {
            if (songTitles.isEmpty()) {
                Toast.makeText(this, "This playlist is empty. Please add some songs first.", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, PlaylistView::class.java)
                startActivity(intent)
            }
        }
        //exit the app
        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}