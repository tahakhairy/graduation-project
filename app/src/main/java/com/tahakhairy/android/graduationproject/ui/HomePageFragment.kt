package com.tahakhairy.android.graduationproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tahakhairy.android.graduationproject.adapters.HomePageAdapter
import com.tahakhairy.android.graduationproject.R
import com.tahakhairy.android.graduationproject.databinding.FragmentHomePageBinding
import com.tahakhairy.android.graduationproject.model.Category
import com.tahakhairy.android.graduationproject.model.Product

class HomePageFragment : Fragment(R.layout.fragment_home_page) {

    private lateinit var adapter: HomePageAdapter
    private lateinit var binding: FragmentHomePageBinding
    private val categories = arrayListOf<Category>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomePageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initData()

        adapter = HomePageAdapter(categories)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
    }


    private fun initData() {
        val phonesList = arrayListOf<Product>()
        for (i in 1..10) {
            phonesList.add(
                Product(
                    1, "iPhone 12 pro Max", R.drawable.iphone12,
                    "21499 EGP", "Phones"
                )
            )
        }
        val phonesCategory = Category(1, "Phones", phonesList)


        val clothesList = arrayListOf<Product>()
        for (i in 1..20) {
            clothesList.add(
                Product(
                    2, "Polo T-shirt",
                    R.drawable.polo2, "355 EGP", "Clothes"
                )
            )
        }
        val clothesCategory = Category(2, "Clothes", clothesList)

        val electronicsList = arrayListOf<Product>()
        for (i in 1..20) {
            electronicsList.add(
                Product(
                    3, "Smart TV 32'inch", R.drawable.smarttv, "6400 EGP",
                    "Electronics"
                )
            )
        }
        val electronicsCategory = Category(3, "Electronics", electronicsList)

        categories.add(phonesCategory)
        categories.add(clothesCategory)
        categories.add(electronicsCategory)
    }
}