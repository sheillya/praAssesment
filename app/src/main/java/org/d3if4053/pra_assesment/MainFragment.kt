package org.d3if4053.pra_assesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.d3if4053.pra_assesment.databinding.FragmentMainBinding
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding:FragmentMainBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        // Inflate the layout for this fragment
        binding.btPersegipanjang.setOnClickListener{
            it.findNavController().navigate(R.id.action_mainFragment_to_persegiPanjang)
        }
        binding.btSegitiga.setOnClickListener{
            it.findNavController().navigate(R.id.action_mainFragment_to_segitiga2)
        }
        return binding.root
    }



}
