package com.example.gallerywithpaging

import android.content.Context
import androidx.paging.DataSource

class PixabayDataSourceFactory(private val context: Context):DataSource.Factory<Int,PhotoItem>() {
    override fun create(): DataSource<Int, PhotoItem> {
        return PixabayDataSource(context)
    }
}