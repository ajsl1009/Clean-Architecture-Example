package com.example.randomuser1223.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.randomuser1223.R
import com.example.randomuser1223.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initAdapter()
        viewModel.getUserList()
        observeUserList()
    }

    private fun initAdapter() {
        binding.mainRecyclerView.adapter = ItemAdapter()
    }

    private fun observeUserList() {
        viewModel.userList.observe(this, { userList ->
            (binding.mainRecyclerView.adapter as ItemAdapter).setItem(userList)
        })
    }
}