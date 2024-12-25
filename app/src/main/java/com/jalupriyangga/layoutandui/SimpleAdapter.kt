package com.jalupriyangga.layoutandui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val data = ArrayList<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SimpleViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as SimpleViewHolder).onBind(data[position], position)
    }

    fun setData(data: List<String>) {
        this.data.clear()
        this.data.addAll(data)
    }

    inner class SimpleViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.view_holder_textview, parent, false)
    ) {

        val textView: TextView = itemView.findViewById(R.id.textViewRV)

        fun onBind(textToDisplay: String, position: Int) {
            val color = if (position % 2 == 0) {
                itemView.context.getColor(R.color.gray)
            } else {
                itemView.context.getColor(R.color.white)
            }
            textView.text = textToDisplay
            textView.setBackgroundColor(color)
        }
    }
}