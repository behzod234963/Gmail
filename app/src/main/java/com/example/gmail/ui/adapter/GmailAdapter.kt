package com.example.gmail.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.R
import com.example.gmail.ui.model.GmailModel

class GmailAdapter(val list:ArrayList<GmailModel>):RecyclerView.Adapter<GmailAdapter.GmailViewHolder>(){

    class GmailViewHolder(view: View):RecyclerView.ViewHolder(view){

        val ivLogo:ImageView=view.findViewById(R.id.iv_Logo)
        val tvName:TextView=view.findViewById(R.id.tv_postName)
        val tvSourcu:TextView=view.findViewById(R.id.tv_Source)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GmailViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_put,parent,false)
        return GmailViewHolder(view)

    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: GmailViewHolder, position: Int) {

        val gmail=list[position]
        holder.ivLogo.setImageResource(list[position].logo)
        holder.tvName.text=list[position].name
        holder.tvSourcu.text=list[position].source

    }

}