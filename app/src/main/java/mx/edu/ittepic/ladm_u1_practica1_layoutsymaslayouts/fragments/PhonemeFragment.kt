package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.R

class PhonemeFragment: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phoneme, container, false)
    }
}