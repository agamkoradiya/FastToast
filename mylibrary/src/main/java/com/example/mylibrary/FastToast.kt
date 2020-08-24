package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class FastToast {
    companion object {
        fun create(context: Context, message: String, duration: Int) {
            Toast.makeText(context, message, duration).show()
        }
    }
}