package com.example.gallerywithpaging

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.paging.toLiveData

class GalleryViewModel(application: Application) : AndroidViewModel(application) {
    val pagedListLiveData = PixabayDataSourceFactory(application).toLiveData(1)
    fun resetQuery() {
        pagedListLiveData.value?.dataSource?.invalidate()
    }
}