package com.lera.finalexam

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ContentViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val contentListTextView:TextView=itemView.findViewById(R.id.content_list_text_view)

    fun bind(list:String) {

        contentListTextView.text=list

    }

}