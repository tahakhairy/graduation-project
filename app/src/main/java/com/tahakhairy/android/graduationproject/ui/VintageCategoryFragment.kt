package com.tahakhairy.android.graduationproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tahakhairy.android.graduationproject.R
import com.tahakhairy.android.graduationproject.adapters.SubCategoryAdapter
import com.tahakhairy.android.graduationproject.databinding.FragmentMenBinding
import com.tahakhairy.android.graduationproject.databinding.FragmentVintageBinding
import com.tahakhairy.android.graduationproject.model.SubCategory

class VintageCategoryFragment : Fragment(R.layout.fragment_men) {

    private lateinit var binding: FragmentVintageBinding
    private lateinit var adapter: SubCategoryAdapter
    private val subCategories = arrayListOf<SubCategory>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVintageBinding.inflate(inflater, container, false)
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
        subCategories.add(SubCategory("Housewares"))
        subCategories.add(SubCategory("Electronics"))
        subCategories.add(SubCategory("Furniture"))
        subCategories.add(SubCategory("Supplies"))
        subCategories.add(SubCategory("Toy"))
        subCategories.add(SubCategory("Collectibles"))
        subCategories.add(SubCategory("Antique"))
        subCategories.add(SubCategory("Jewelry"))
        subCategories.add(SubCategory("Books"))
        subCategories.add(SubCategory("Serving"))
        subCategories.add(SubCategory("Home Decor"))
        subCategories.add(SubCategory("Bags and Purses"))
        subCategories.add(SubCategory("Trading Cards"))
    }
}