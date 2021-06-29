package com.tahakhairy.android.graduationproject.model

data class Category(
    val id: Int,
    val categoryName: String,
    val products: List<Product>
)
