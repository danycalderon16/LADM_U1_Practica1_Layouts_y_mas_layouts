package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    private var i : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = getString(R.string.text_card_1)

        supportActionBar?.apply {
            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }


        binding.fab.setOnClickListener { view ->
            i++
            if (i<5){
                Toast.makeText(this,"Está a ${5-i} clics de ser programador",Toast.LENGTH_SHORT).show()
            }
            if (i==5){
                Toast.makeText(this,"¡¡¡Felicidades, ya eres programador!!!",Toast.LENGTH_SHORT).show()
            }
            if (i>5){
                Toast.makeText(this,"¡¡¡Ya eres programador!!!",Toast.LENGTH_SHORT).show()
            }

        }

    }
}