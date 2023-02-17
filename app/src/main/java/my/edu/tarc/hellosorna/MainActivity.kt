package my.edu.tarc.hellosorna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Instant Name: Data Type / Class name
class MainActivity : AppCompatActivity() {
    //onCreate = main function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Load UI to memory
        //R = resources
        setContentView(R.layout.activity_main)

        //Declare variable to link UI and program
        //Method of declaring; val = value (value no change 'FIXED') & var = variable (the value might change throughout the program)
        val imageViewQR : ImageView = findViewById(R.id.imageViewQR)
        val textViewName : TextView = findViewById(R.id.textViewName)
        val buttonShow : Button = findViewById(R.id.buttonShow)
        val buttonHide : Button = findViewById(R.id.buttonHide)

        buttonShow.setOnClickListener{
            imageViewQR.visibility = View.VISIBLE
            textViewName.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener{
            imageViewQR.visibility = View.INVISIBLE
            textViewName.visibility = View.INVISIBLE
        }
    }
}