package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.ui.main.SectionsPagerAdapter
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.databinding.ActivityTabbedBinding

class TabbedActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTabbedBinding
    private var i : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTabbedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.apply {
            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }


        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = binding.fab

        fab.setOnClickListener { view ->
            i++
            if (i<5){
                Toast.makeText(this,"Está a ${5-i} clics de ser programador", Toast.LENGTH_SHORT).show()
            }
            if (i==5){
                 Snackbar.make(view, "¡¡¡Felicidades, ya eres programador!!!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            }
            if (i>5){
                 Snackbar.make(view, "¡¡¡Ya eres programador!!!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            }

        }
    }
}