package com.tahakhairy.android.graduationproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tahakhairy.android.graduationproject.R
import com.tahakhairy.android.graduationproject.adapters.SubCategoryAdapter
import com.tahakhairy.android.graduationproject.databinding.FragmentHomeCategoryBinding
import com.tahakhairy.android.graduationproject.model.SubCategory

class HomeCategoryFragment : Fragment(R.layout.fragment_home_category) {

    private lateinit var binding: FragmentHomeCategoryBinding
    private lateinit var adapter: SubCategoryAdapter
    private val subCategories = arrayListOf<SubCategory>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initData()

        adapter = SubCategoryAdapter(subCategories)
        binding.subCategoriesRv.adapter = adapter
        binding.subCategoriesRv.setHasFixedSize(true)
        binding.subCategoriesRv.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun initData() {
        subCategories.add(SubCategory("Storage & Organization"))
        subCategories.add(SubCategory("Home Decor"))
        subCategories.add(SubCategory("Bedding"))
        subCategories.add(SubCategory("Seasonal Decor"))
        subCategories.add(SubCategory("Home Appliances"))
        subCategories.add(SubCategory("Cleaning Supplies"))
        subCategories.add(SubCategory("Bath"))
        subCategories.add(SubCategory("Artwork"))
        subCategories.add(SubCategory("Furniture"))
        subCategories.add(SubCategory("Kitchen & Dining"))
    }
}