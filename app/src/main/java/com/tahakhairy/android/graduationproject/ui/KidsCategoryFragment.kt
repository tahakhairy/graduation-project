package com.tahakhairy.android.graduationproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tahakhairy.android.graduationproject.R
import com.tahakhairy.android.graduationproject.adapters.SubCategoryAdapter
import com.tahakhairy.android.graduationproject.databinding.FragmentKidsBinding
import com.tahakhairy.android.graduationproject.model.SubCategory

class KidsCategoryFragment : Fragment(R.layout.fragment_kids) {

    private lateinit var binding: FragmentKidsBinding
    private lateinit var adapter: SubCategoryAdapter
    private val subCategories = arrayListOf<SubCategory>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKidsBinding.inflate(inflater, container, false)
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
        subCategories.add(SubCategory("Feeding"))
        subCategories.add(SubCategory("Diapering"))
        subCategories.add(SubCategory("Strollers"))
        subCategories.add(SubCategory("Health & Baby Care"))
        subCategories.add(SubCategory("Bathing & Skin Care"))
        subCategories.add(SubCategory("Safety"))
        subCategories.add(SubCategory("Toys"))
        subCategories.add(SubCategory("Gear"))
        subCategories.add(SubCategory("Nursery"))
        subCategories.add(SubCategory("Car Seats & Accessories"))
    }
}