package com.example.cryptocurrencykotlinapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.cryptocurrencykotlinapplication.R
import com.example.cryptocurrencykotlinapplication.databinding.SliderImageItemBinding

class SliderImageAdapter(private var data: ArrayList<Int>) :
    RecyclerView.Adapter<SliderImageAdapter.SliderViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SliderViewHolder {

        val sliderImageItemBinding: SliderImageItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.slider_image_item, parent, false
        )
        return SliderViewHolder(sliderImageItemBinding)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class SliderViewHolder(private var binding: SliderImageItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(photo: Any) {
            binding.viewfading.visibility = View.VISIBLE
            Glide.with(binding.root.context)
                .load(photo)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(binding.imageSlide)
            binding.executePendingBindings()
        }
    }
}
