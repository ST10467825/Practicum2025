package vcmsa.ci.practicum2025

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PlaylistView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_playlist_view)

        val songsTextView = findViewById<TextView>(R.id.songsTextView)
        val averageRatingButton = findViewById<Button>(R.id.averageRatingButton)
        val backButton = findViewById<Button>(R.id.backButton)

        if (songTitles == null || artistNames == null || ratings == null || comments == null ||
            songTitles.isEmpty()) {
            Toast.makeText(this, "No songs in playlist", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        //display all songs using parallel arrays
        val songsText = StringBuilder()
        for (i in songTitles.indices) {
            songsText.append("""
                Title: ${songTitles[i]}
                Artist: ${artistNames[i]}
                Rating: ${ratings[i]}/5
                Comments: ${comments[i]}
            
                ----------------------
            
            """.trimIndent())
        }
        songsTextView.text = songsText.toString()

        //Calculate average rating
        averageRatingButton.setOnClickListener {
            val average = ratings.average().toFloat()
            Toast.makeText(this, "Average Rating: ${"%.2f".format(average)}/5", Toast.LENGTH_LONG).show()
        }
        //return to main screen
        backButton.setOnClickListener {
            finish()
        }
    }
}