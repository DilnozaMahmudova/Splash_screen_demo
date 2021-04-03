package uz.dilnoza.mobiuz.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.dialog.*
import kotlinx.android.synthetic.main.list_item.*
import uz.dilnoza.mobiuz.R

import uz.dilnoza.mobiuz.adapters.AdapterRecycler
import uz.dilnoza.mobiuz.data.Info
import uz.dilnoza.mobiuz.ui.Dialog

open class Fragment_A(val ls:ArrayList<Info>):Fragment(R.layout.example_page) {
    lateinit var list:RecyclerView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        list=view.findViewById(R.id.list)
       val adapter=AdapterRecycler(ls)
        val cont=view.context
        list.adapter=adapter
        adapter.setOnClickListener {
            val dialog=Dialog(cont,"hhh")
            dialog.setData(it)
            dialog.setOnClickListener { }
            dialog.show()

        }

val ln=LinearLayoutManager(activity)
        list.layoutManager=ln
    }
}