package com.example.telegramappui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var context: Context, var items: ArrayList<Chat>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = items[position]

        if (holder is ViewHolder) {
            holder.apply {
                iv_profile.setImageResource(chat.profile)
                tv_fullName.text = chat.fullName
                tv_message.text = chat.message

            }
        }
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val iv_profile = view.findViewById<ShapeableImageView>(R.id.iv_profile)
        val tv_fullName = view.findViewById<TextView>(R.id.tv_fullname)
        val tv_message = view.findViewById<TextView>(R.id.tv_massage)
    }
}