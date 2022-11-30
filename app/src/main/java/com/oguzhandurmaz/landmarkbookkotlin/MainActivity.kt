package com.oguzhandurmaz.landmarkbookkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.oguzhandurmaz.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList()
        addData()

        //useListView()
        useRecyclerView()
    }

    private fun useRecyclerView() {
        println(landmarkList.size)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter
    }

    private fun addData() {
        //Data
        val pisa = Landmark("Pisa Tower", "Italy", R.drawable.pisa)
        val colosseum = Landmark("Colosseum", "Italy", R.drawable.colosseum)
        val eiffel = Landmark("Eiffel Tower", "France", R.drawable.eiffel)
        val londonBridge = Landmark("London Bridge", "England", R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)
    }

    private fun useListView() {
        //Adapter: Layout & Data
        //Mapping
        /*
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
            landmarkList.map { landmark -> landmark.name })

        binding.listView.adapter = adapter

        binding.listView.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                val intent = Intent(this, DetailsActivity::class.java)
                intent.putExtra("landmark", landmarkList[i])
                startActivity(intent)
            }
        */
    }
}