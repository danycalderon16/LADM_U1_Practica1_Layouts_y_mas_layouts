package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = getString(R.string.title_app)

        binding.cardWhy.setOnClickListener {
            var intent = Intent(this,ScrollingActivity::class.java)
            startActivity(intent)
        }
        binding.cardGrammar.setOnClickListener {
            var intent = Intent(this,TabbedActivity::class.java)
            startActivity(intent)
        }

    }
}