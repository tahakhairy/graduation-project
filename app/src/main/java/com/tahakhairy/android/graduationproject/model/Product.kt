package com.tahakhairy.android.graduationproject.model

data class Product(
    val id: Int,
    val productName: String,
    val productImage: Int,
    val productPrice: String,
    val productCategory: String,
    val productDesc: String = ""
)
