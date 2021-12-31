package com.example.randomuser1223.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.example.randomuser1223.databinding.ListItemBinding
import com.example.randomuser1223.domain.entity.UserEntity

class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    private var items = emptyList<UserEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun setItem(items: List<UserEntity>) {
        this.items = items
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(userEntity: UserEntity) {
            //using coil
            binding.ivProfile.load(userEntity.profile) {
                transformations(CircleCropTransformation())
            }
            binding.item = userEntity
        }
    }
}