package com.tahakhairy.android.graduationproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tahakhairy.android.graduationproject.databinding.ItemCategoryBinding
import com.tahakhairy.android.graduationproject.model.Category

class HomePageAdapter(private var list: ArrayList<Category>) :
    RecyclerView.Adapter<HomePageAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(private val binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private lateinit var productsAdapter: ProductsAdapter

        companion object {
            fun from(parent: ViewGroup): CategoryViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemCategoryBinding.inflate(layoutInflater, parent, false)
                return CategoryViewHolder(binding)
            }
        }

        fun bind(category: Category) {
            binding.category = category
            val products = category.products
            productsAdapter = ProductsAdapter(products)
            binding.childRecyclerView.adapter = productsAdapter
            binding.childRecyclerView.layoutManager =
                LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val current = list[position]
        holder.bind(current)
    }

    override fun getItemCount() = list.size

}