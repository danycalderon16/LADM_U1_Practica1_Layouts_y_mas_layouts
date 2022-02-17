package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.R
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.fragments.GrammarFragment
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.fragments.PhonemeFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        lateinit var fragment: Fragment
        when (position){
            0-> {
                fragment = GrammarFragment()
            }
            1-> {
                fragment = PhonemeFragment()
            }
        }
        return fragment
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}