package com.example.assigmnentforrecyclertwo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.assigmnentforrecyclertwo.R
import com.example.assigmnentforrecyclertwo.adapter.TwoAdapter
import com.example.assigmnentforrecyclertwo.model.Two
import kotlinx.android.synthetic.main.fragment_two.*

class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var twoList = ArrayList<Two>()
        var twoAdapter = TwoAdapter(twoList)


        twoList.add(Two(R.drawable.japan1,"Japan"))
        twoList.add(Two(R.drawable.korea1,"Korea"))
        twoList.add(Two(R.drawable.china,"China"))
        twoList.add(Two(R.drawable.international,"International"))

//        twoList.add(Two(R.drawable.japan1,"Japan"))
//        twoList.add(Two(R.drawable.korea1,"Korea"))
//        twoList.add(Two(R.drawable.china1,"China"))
//        twoList.add(Two(R.drawable.international1,"International"))

        recylerTwo.layoutManager = GridLayoutManager(context,2)
        recylerTwo.adapter = twoAdapter
    }
}