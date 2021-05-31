package com.aayush.shoppinglistapp.repository

import com.aayush.shoppinglistapp.models.MyTaskModel

class MyTaskListRepository {

    companion object {
        private var instance: MyTaskListRepository? = null

        fun getInstance() : MyTaskListRepository {
            return instance ?: MyTaskListRepository()
        }
    }

    fun fetchMyTasks(): List<MyTaskModel> {
        return arrayListOf()
    }

    fun addMyTaskToList() {

    }
}