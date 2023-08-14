package com.example.gmail.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.R
import com.example.gmail.ui.adapter.GmailAdapter
import com.example.gmail.ui.model.GmailModel

class MainActivity : AppCompatActivity() {
    private lateinit var gmailList:ArrayList<GmailModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        loadItems()
        val rvGmail=findViewById<RecyclerView>(R.id.rv_MailField_main)

        rvGmail.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvGmail.adapter=GmailAdapter(gmailList)

    }

    private fun loadItems() {

        gmailList=ArrayList()
        gmailList.add(GmailModel(R.drawable.pic_putitem,"Promotions","HeadHunter,Medium"))
        gmailList.add(GmailModel(R.drawable.pic_linkedin,"LinkedIn","LinkedIn"))
        gmailList.add(GmailModel(R.drawable.pic_social,"Social","Social medias"))
        gmailList.add(GmailModel(R.drawable.pic_contact,"GDG Event Platform","GDG platform"))
        gmailList.add(GmailModel(R.drawable.pic_medium,"Medium","Medium"))

        gmailList.add(GmailModel(R.drawable.pic_putitem,"Promotions","HeadHunter,Medium"))
        gmailList.add(GmailModel(R.drawable.pic_linkedin,"LinkedIn","LinkedIn"))
        gmailList.add(GmailModel(R.drawable.pic_social,"Social","Social medias"))
        gmailList.add(GmailModel(R.drawable.pic_contact,"GDG Event Platform","GDG platform"))
        gmailList.add(GmailModel(R.drawable.pic_medium,"Medium","Medium"))

        gmailList.add(GmailModel(R.drawable.pic_putitem,"Promotions","HeadHunter,Medium"))
        gmailList.add(GmailModel(R.drawable.pic_linkedin,"LinkedIn","LinkedIn"))
        gmailList.add(GmailModel(R.drawable.pic_social,"Social","Social medias"))
        gmailList.add(GmailModel(R.drawable.pic_contact,"GDG Event Platform","GDG platform"))
        gmailList.add(GmailModel(R.drawable.pic_medium,"Medium","Medium"))

    }
}