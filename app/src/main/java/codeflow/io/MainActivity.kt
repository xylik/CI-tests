package codeflow.io

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var showHideTextBTN: Button
    private lateinit var textTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showHideTextBTN = findViewById(R.id.showHideTextBTN)
        textTV = findViewById(R.id.textTV)

        showHideTextBTN.setOnClickListener(showTextClickHandler)
    }

    private val showTextClickHandler = View.OnClickListener {
        textTV.visibility = if(textTV.visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
    }
}
