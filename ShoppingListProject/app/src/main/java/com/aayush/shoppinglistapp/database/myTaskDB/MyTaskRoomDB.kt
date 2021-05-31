package com.aayush.shoppinglistapp.database.myTaskDB.MyTaskRoomDatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aayush.shoppinglistapp.database.myTaskDB.DBMyTaskModel
import com.aayush.shoppinglistapp.database.myTaskDB.MyTaskDao

@Database(entities = [DBMyTaskModel::class], version = 1)
abstract class MyTaskRoomDB: RoomDatabase() {

    abstract fun userDao(): MyTaskDao

}