package com.tahakhairy.android.graduationproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tahakhairy.android.graduationproject.R
import com.tahakhairy.android.graduationproject.adapters.SubCategoryAdapter
import com.tahakhairy.android.graduationproject.databinding.FragmentSportsBinding
import com.tahakhairy.android.graduationproject.model.SubCategory

class SportsCategoryFragment : Fragment(R.layout.fragment_sports) {

    private lateinit var binding: FragmentSportsBinding
    private lateinit var adapter: SubCategoryAdapter
    private val subCategories = arrayListOf<SubCategory>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSportsBinding.inflate(inflater, container, false)
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
        subCategories.add(SubCategory("Exercise"))
        subCategories.add(SubCategory("Footwear"))
        subCategories.add(SubCategory("Fan Shop"))
        subCategories.add(SubCategory("Apparel"))
        subCategories.add(SubCategory("Team Sports"))
        subCategories.add(SubCategory("Golf"))
        subCategories.add(SubCategory("Outdoors"))
    }
}