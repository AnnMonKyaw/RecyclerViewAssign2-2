package com.example.assigmnentforrecyclertwo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assigmnentforrecyclertwo.R
import com.example.assigmnentforrecyclertwo.model.Three
import kotlinx.android.synthetic.main.item_three.view.*

class ThreeAdapter(var threeList:ArrayList<Three>): RecyclerView.Adapter<ThreeAdapter.ThreeViewHolder>() {
    class ThreeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        fun bindThree(three: Three)
        {
            this.itemView.textNew.text=three.New
            this.itemView.textDiscount.text=three.Discount
            this.itemView.textItemName.text=three.ItmeName
            this.itemView.textBrandName1.text=three.BrandName1
            this.itemView.imgRate.setImageResource(three.Rate)
            this.itemView.textPrice1.text=three.Price1
            this.itemView.textPrice2.text=three.Price2
            this.itemView.imgItemImage.setImageResource(three.ImgItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThreeViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.item_three,parent,false)
        return ThreeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return threeList.size
    }

    override fun onBindViewHolder(holder: ThreeViewHolder, position: Int) {
        holder.bindThree(threeList[position])
    }
}