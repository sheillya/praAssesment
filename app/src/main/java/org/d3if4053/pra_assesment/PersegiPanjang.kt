package org.d3if4053.pra_assesment


import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if4053.pra_assesment.databinding.FragmentPersegiPanjangBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class PersegiPanjang : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentPersegiPanjangBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_persegi_panjang, container, false)
         var panjang = 0
         var lebar = 0
         var keliling = (2*(panjang + lebar))
         var luas = panjang * keliling

        binding.hasilKelilingPP.text = "$keliling"
        binding.hasilLuasPP.text = "$luas"

        return binding.root


    }


}
