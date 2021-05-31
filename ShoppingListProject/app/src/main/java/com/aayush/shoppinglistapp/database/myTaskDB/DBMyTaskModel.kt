package com.aayush.shoppinglistapp.database.myTaskDB

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.aayush.shoppinglistapp.database.constants.DBConstants

@Entity(tableName = DBConstants.myTaskTableName)

data class DBMyTaskModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val task: String,
    val isImportant: Boolean,
    val isCompleted: Boolean,
)
