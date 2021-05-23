package com.aayush.shoppinglistapp.view.my_task_list

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.aayush.shoppinglistapp.R
import com.aayush.shoppinglistapp.models.MyTaskModel
import com.aayush.shoppinglistapp.databinding.MyTaskRowLayoutBinding

class MyTaskListAdapter(
    private val context: Context,
    private val list: ArrayList<MyTaskModel>
) : RecyclerView.Adapter<MyTaskListAdapter.MyTaskListViewHolder>() {

    class MyTaskListViewHolder(binding: MyTaskRowLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun getItemCount() = list.count()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyTaskListViewHolder {
        return MyTaskListViewHolder(
            MyTaskRowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyTaskListViewHolder, position: Int) {
        MyTaskRowLayoutBinding.bind(holder.itemView).apply {
            val data = list[position]

            val doneIcon =
                if (data.isCompleted) R.drawable.ic_task_done_24 else R.drawable.ic_task_not_done_24
            taskDoneIcon.setImageDrawable(ContextCompat.getDrawable(context, doneIcon))
            taskEditText.text = data.task

            val importantIcon =
                if (data.isImportant) R.drawable.ic_on_start_24 else R.drawable.ic_off_star_24
            taskPriorityIcon.setImageDrawable(ContextCompat.getDrawable(context, importantIcon))
        }
    }
}