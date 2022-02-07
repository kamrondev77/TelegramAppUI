package com.example.telegramappui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = ContextCompat.getColor(this@MainActivity, R.color.status)
        initViews()
    }

    fun initViews() {

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList()

        chats.add(Chat(R.drawable.im_sample1, "Qobilov Kamron", "Ertaga gaplashamiz"))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", "Qalaysan yozmiysan korinmay ketding"))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", "Oqishlaring yaxshimi"))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", "Kecha darsga bordingmi"))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", "Xozir avtobusda tushyapman ozim keyin tel qivoraman"))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", "Ozing yaxshi bosang boldi qogani boladi sekin sekin"))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", "Qalaysan yozmiysan korinmay ketding"))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", "Oqishlaring yaxshimi"))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", "Kecha darsga bordingmi"))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", "Xozir avtobusda tushyapman ozim keyin tel qivoraman"))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", "Ozing yaxshi bosang boldi qogani boladi sekin sekin"))
        chats.add(Chat(R.drawable.im_sample1, "Qobilov Kamron", "Ertaga gaplashamiz"))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", "Qalaysan yozmiysan korinmay ketding"))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", "Oqishlaring yaxshimi"))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", "Kecha darsga bordingmi"))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", "Xozir avtobusda tushyapman ozim keyin tel qivoraman"))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", "Ozing yaxshi bosang boldi qogani boladi sekin sekin"))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", "Qalaysan yozmiysan korinmay ketding"))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", "Oqishlaring yaxshimi"))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", "Kecha darsga bordingmi"))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", "Xozir avtobusda tushyapman ozim keyin tel qivoraman"))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", "Ozing yaxshi bosang boldi qogani boladi sekin sekin"))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", "Kecha darsga bordingmi"))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", "Xozir avtobusda tushyapman ozim keyin tel qivoraman"))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", "Ozing yaxshi bosang boldi qogani boladi sekin sekin"))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", "Qalaysan yozmiysan korinmay ketding"))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", "Oqishlaring yaxshimi"))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", "Kecha darsga bordingmi"))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", "Xozir avtobusda tushyapman ozim keyin tel qivoraman"))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", "Ozing yaxshi bosang boldi qogani boladi sekin sekin"))
        chats.add(Chat(R.drawable.im_sample1, "Qobilov Kamron", "Ertaga gaplashamiz"))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", "Qalaysan yozmiysan korinmay ketding"))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", "Oqishlaring yaxshimi"))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", "Kecha darsga bordingmi"))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", "Xozir avtobusda tushyapman ozim keyin tel qivoraman"))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", "Ozing yaxshi bosang boldi qogani boladi sekin sekin"))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", "Qalaysan yozmiysan korinmay ketding"))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", "Oqishlaring yaxshimi"))


        return chats
    }
}