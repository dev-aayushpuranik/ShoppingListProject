package com.aayush.shoppinglistapp.view.my_task_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aayush.shoppinglistapp.common.extensions.setRV
import com.aayush.shoppinglistapp.common.extensions.setViewVisibility
import com.aayush.shoppinglistapp.models.MyTaskModel
import com.aayush.shoppinglistapp.databinding.FragmentMyTaskListBinding

class MyTaskListFragment : Fragment() {

    private var _viewBinding: FragmentMyTaskListBinding? = null
    private val viewBinding get() = _viewBinding!!
    private var myTaskListAdapter: MyTaskListAdapter? = null
    private val taskList = arrayListOf<MyTaskModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _viewBinding = FragmentMyTaskListBinding.inflate(inflater, container, false)

        setData()
        setViews()

        return viewBinding.root
    }

    private fun setData() {
        fetchTaskList()
    }

    private fun setViews() {
//        setPriorityIcon()

        myTaskListAdapter = MyTaskListAdapter(requireContext(), taskList)
        viewBinding.myTaskListView.recyclerView.setRV(requireContext(), myTaskListAdapter!!)

        viewBinding.myTaskListView.recyclerView.setViewVisibility(taskList.isNotEmpty())
        viewBinding.myTaskListView.emptyDataView.setViewVisibility(taskList.isNullOrEmpty())

//        setAddNewTaskView()
    }

//    private fun setAddNewTaskView() {
//        viewBinding.newTaskView.priorityIcon.setOnClickListener {
//            setPriorityIcon()
//        }
//
//        viewBinding.newTaskView.addTaskButton.setOnClickListener {
//            if (viewBinding.newTaskView.newTaskEditText.text.toString().trim().count() > 0) {
//                taskList.add(
//                    0, MyTaskModel(
//                        viewBinding.newTaskView.newTaskEditText.text.toString().trim(),
//                        isImportant, isCompleted = false
//                    )
//                )
//                myTaskListAdapter?.notifyDataSetChanged()
//
//                resetData()
//            } else {
//                if (viewBinding.newTaskView.newTaskEditText.text.toString().trim().count() <= 0) {
//                    ToastUtil.showToast(requireContext(), "Enter Task")
//                }
//            }
//        }
//    }
//
//    private fun resetData() {
//        isImportant = false
//        viewBinding.newTaskView.newTaskEditText.text?.clear()
//    }

    private fun fetchTaskList() {
        for (i in 0..10) {
            taskList.add(MyTaskModel(task = "task $i", isImportant = false, isCompleted = false))
        }
    }

//    private fun setPriorityIcon() {
//        val icon = if (isImportant) R.drawable.ic_on_start_24 else R.drawable.ic_off_star_24
//        viewBinding.newTaskView.priorityIcon.setImageDrawable(ContextCompat.getDrawable(requireContext(), icon))
//        isImportant = !isImportant
//    }

    override fun onDestroyView() {
        _viewBinding = null

        super.onDestroyView()
    }
}