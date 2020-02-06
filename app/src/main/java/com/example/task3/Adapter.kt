package com.example.task3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler.view.*

class Adapter(val items : List<String>,val clickListener: (String) -> Unit ) : RecyclerView.Adapter<Adapter.AdapterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {

       val v= LayoutInflater.from(parent.context).inflate(R.layout.recycler,parent,false)
        return AdapterViewHolder(v , clickListener)
    }

    override fun getItemCount()=items.size


    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {

        holder.onBind(items[position])
    }

    class AdapterViewHolder(val item: View , val clickListener:  (String) -> Unit ) : RecyclerView.ViewHolder(item){

        fun onBind(list : String){
           item.txtItems.text=list

            item.setOnClickListener {
                clickListener(list)
            }
        }

    }
}