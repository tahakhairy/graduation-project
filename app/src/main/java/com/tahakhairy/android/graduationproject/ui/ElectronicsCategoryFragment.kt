package com.tahakhairy.android.graduationproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tahakhairy.android.graduationproject.R
import com.tahakhairy.android.graduationproject.adapters.SubCategoryAdapter
import com.tahakhairy.android.graduationproject.databinding.FragmentElectronicsBinding
import com.tahakhairy.android.graduationproject.model.SubCategory

class ElectronicsCategoryFragment : Fragment(R.layout.fragment_men) {

    private lateinit var binding: FragmentElectronicsBinding
    private lateinit var adapter: SubCategoryAdapter
    private val subCategories = arrayListOf<SubCategory>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentElectronicsBinding.inflate(inflater, container, false)
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
        subCategories.add(SubCategory("Computers & Tablets"))
        subCategories.add(SubCategory("TV, Audio & Surveillance"))
        subCategories.add(SubCategory("Media"))
        subCategories.add(SubCategory("Cell Phones & Accessories"))
        subCategories.add(SubCategory("Car Audio, Video & GPS"))
        subCategories.add(SubCategory("Cameras & Photography"))
        subCategories.add(SubCategory("Video Games & Consoles"))
    }
}