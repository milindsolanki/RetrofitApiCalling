package com.example.myfirstretrofitapplication.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent

object CommanUtils {
    fun inflateLayout(parent: ViewGroup,id: Int)=LayoutInflater.from(parent.context).inflate(id,parent,false)
}
