package com.example.my_list_sakura.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.my_list_sakura.models.ItemModel


@Dao
interface RecordDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(itemModel: ItemModel)

    @Delete
    fun delete(itemModel: ItemModel)

    @Query("SELECT * FROM table_records")
    fun getAllItems(): List<ItemModel>

}