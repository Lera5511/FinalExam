package com.lera.finalexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Content : Fragment() {

    lateinit var contentRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_content, container, false)

        val contentList:List<String> = listOf("Pushkin A S", "Tolstoy L N", "Chechov A P")


        contentRecyclerView = view.findViewById(R.id.content_recycler_view)
        contentRecyclerView.layoutManager=LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        contentRecyclerView.adapter=ContentAdapter(contentList)

        return view
    }


}