package com.tahakhairy.android.graduationproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tahakhairy.android.graduationproject.databinding.ItemSubCategoriesBinding
import com.tahakhairy.android.graduationproject.model.SubCategory

class SubCategoryAdapter(private var list: ArrayList<SubCategory>) :
    RecyclerView.Adapter<SubCategoryAdapter.SubCategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubCategoryViewHolder {
        return SubCategoryViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: SubCategoryViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    class SubCategoryViewHolder(private val binding: ItemSubCategoriesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun from(parent: ViewGroup): SubCategoryViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemSubCategoriesBinding.inflate(layoutInflater, parent, false)
                return SubCategoryViewHolder(binding)
            }
        }

        fun bind(item: SubCategory) {
            binding.subCategory = item
        }
    }
}