package com.aayush.shoppinglistapp.database.myTaskDB

import androidx.room.*
import com.aayush.shoppinglistapp.database.constants.DBConstants

@Dao
interface MyTaskDao {
    @Query("SELECT * FROM ${DBConstants.myTaskTableName}")
    suspend fun getAllMyTasks(): List<DBMyTaskModel>?

    @Update
    fun updateTask(vararg task: DBMyTaskModel)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUsers(vararg task: DBMyTaskModel)

    @Insert
    suspend fun insertAll(tasks: DBMyTaskModel)

    @Delete
    suspend fun delete(vararg task: DBMyTaskModel)

//    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
//    fun loadAllByIds(userIds: IntArray): List<User>

//    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
//            "last_name LIKE :last LIMIT 1")
//    fun findByName(first: String, last: String): User
}