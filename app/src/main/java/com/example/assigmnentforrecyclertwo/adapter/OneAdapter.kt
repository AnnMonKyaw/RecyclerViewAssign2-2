package com.example.assigmnentforrecyclertwo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assigmnentforrecyclertwo.R
import com.example.assigmnentforrecyclertwo.model.One
import kotlinx.android.synthetic.main.item_one.view.*

class OneAdapter (var oneList:ArrayList<One>): RecyclerView.Adapter<OneAdapter.OneViewHolder>(){
    class OneViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindAssignOne(one: One)
        {
            this.itemView.imgItem.setImageResource(one.ImageItem)
            this.itemView.textName1.text=one.ItemName1
            this.itemView.textName2.text=one.ItemName2
            this.itemView.textBrandName.text=one.BrandName
            this.itemView.imgRating.setImageResource(one.ImageRating)
            this.itemView.textPrice.text=one.Price
            this.itemView.textPriceDis.text=one.PriceDiscount
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OneViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.item_one,parent,false)
        return OneViewHolder(view)
    }

    override fun getItemCount(): Int {
        return oneList.size
    }

    override fun onBindViewHolder(holder: OneViewHolder, position: Int) {
        holder.bindAssignOne(oneList[position])
    }
}