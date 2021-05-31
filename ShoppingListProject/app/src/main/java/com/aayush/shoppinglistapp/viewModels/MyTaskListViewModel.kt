package com.aayush.shoppinglistapp.viewModels

import androidx.lifecycle.ViewModel
import com.aayush.shoppinglistapp.repository.MyTaskListRepository

class MyTaskListViewModel : ViewModel() {

    val myTaskRepo = MyTaskListRepository.getInstance()


}