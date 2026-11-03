package com.example.my_list_sakura

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.my_list_sakura.models.ItemModel
import com.example.my_list_sakura.room.RecordDao
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val recordDao: RecordDao
) : ViewModel() {

    fun insert(itemModel: ItemModel) {
        viewModelScope.launch {
            recordDao.insert(itemModel)

        }
    }

    fun getAllItems(): List<ItemModel> {
        return recordDao.getAllItems()
    }
}
