package com.example.assigmnentforrecyclertwo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assigmnentforrecyclertwo.R
import com.example.assigmnentforrecyclertwo.adapter.OneAdapter
import com.example.assigmnentforrecyclertwo.model.One
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_one.*

class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var oneList = ArrayList<One>()
        var oneAdapter = OneAdapter(oneList)

        oneList.add(One(R.drawable.bag1,"Hyde Park","N41015","LOUIS VUITTON",R.drawable.ic_rating1,"999,99999 Ks","2,11000 Ks"))
        oneList.add(One(R.drawable.shirt,"Hyde Park","SLEEVE T SHIRT","Lady Gaga",R.drawable.ic_rating2,"72000 Ks",""))
        oneList.add(One(R.drawable.iphone8plus,"IPHONE X","","APPLE",R.drawable.ic_rating1,"1400000 Ks",""))


//        oneList.add(One(R.drawable.bag,"Hyde Park","N41015","LOUIS VUITTON",R.drawable.ic_rating1,"999,99999 Ks 2,1100 Ks"))
//        oneList.add(One(R.drawable.shirt,"Hyde Park","SLEEVE T SHIRT","Lady Gaga",R.drawable.ic_rating2,"72000 Ks"))
//        oneList.add(One(R.drawable.iphonex,"IPHONE X","","APPLE",R.drawable.ic_rating1,"1400000 Ks"))

        recylerOne.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL, false
        )
        recylerOne.adapter = oneAdapter
    }
}