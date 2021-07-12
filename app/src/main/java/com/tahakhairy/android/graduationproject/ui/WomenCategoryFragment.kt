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
import com.tahakhairy.android.graduationproject.databinding.FragmentWomenBinding
import com.tahakhairy.android.graduationproject.model.SubCategory

class WomenCategoryFragment : Fragment(R.layout.fragment_men) {

    private lateinit var binding: FragmentWomenBinding
    private lateinit var adapter: SubCategoryAdapter
    private val subCategories = arrayListOf<SubCategory>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWomenBinding.inflate(inflater, container, false)
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
        subCategories.add(SubCategory("Maternity"))
        subCategories.add(SubCategory("Suits & Blazers"))
        subCategories.add(SubCategory("Women's Accessories"))
        subCategories.add(SubCategory("Swimwear"))
        subCategories.add(SubCategory("Suits"))
        subCategories.add(SubCategory("Jeans"))
        subCategories.add(SubCategory("Jewelry"))
        subCategories.add(SubCategory("Skirts"))
        subCategories.add(SubCategory("Dresses"))
        subCategories.add(SubCategory("Sweaters"))
        subCategories.add(SubCategory("Shoes"))
        subCategories.add(SubCategory("Coats & Jackets"))
        subCategories.add(SubCategory("Tops & Blouses"))
        subCategories.add(SubCategory("Underwear"))
        subCategories.add(SubCategory("Women's Handbags"))
    }
}