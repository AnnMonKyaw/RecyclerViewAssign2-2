package com.example.assigmnentforrecyclertwo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assigmnentforrecyclertwo.R
import com.example.assigmnentforrecyclertwo.adapter.ThreeAdapter
import com.example.assigmnentforrecyclertwo.model.Three
import kotlinx.android.synthetic.main.fragment_three.*

class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var threeList = ArrayList<Three>()
        var threeAdapter= ThreeAdapter(threeList)

        threeList.add(Three("  NEW  ","  30% off  ","Iphone 8 Plus","Apple",R.drawable.ic_rating1,"980000 Ks","1100000 Ks",R.drawable.iphone8plus))
        threeList.add(Three("  NEW  ","  34% off  ","GhostBed 11 Inch Cooling Gel Momery Foam...","GhostBed",R.drawable.ic_rating1,"325000 Ks","495000 Ks",R.drawable.ghostbed1))
        threeList.add(Three("","","Nintendo Switch - Neon Blue and Red Joy-Con","Nintendo",R.drawable.ic_rating1,"359000 Ks","",R.drawable.nintendo))
        threeList.add(Three("","","BRLAROI Women Comfy Swing Tunic Short","Balaroi",R.drawable.ic_rating1,"18990 Ks","",R.drawable.dress))

        recylerThree.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL, false
        )
        recylerThree.adapter=threeAdapter
    }
}