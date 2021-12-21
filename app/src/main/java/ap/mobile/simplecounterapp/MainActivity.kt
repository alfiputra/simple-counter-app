package ap.mobile.simplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val textCounter = findViewById<TextView>(R.id.textView)
        var timesClicked = 0

        btnClickMe.setOnClickListener{
            timesClicked += 1
            textCounter.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "You Click Me..", Toast.LENGTH_SHORT).show()
        }

        val reset = findViewById<Button>(R.id.btnResetCounter)

        reset.setOnClickListener {
            timesClicked = 0
            textCounter.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Successfully Reset", Toast.LENGTH_SHORT).show()
        }
    }
}