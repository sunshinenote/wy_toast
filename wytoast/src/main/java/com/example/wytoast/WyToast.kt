package com.example.wytoast

import android.content.Context
import android.widget.Toast

object WyToast {
    fun showToast(context:Context){
        Toast.makeText(context,"测试测试拉啦啦啦啦",Toast.LENGTH_LONG).show()
    }
}