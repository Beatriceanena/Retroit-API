package com.beatrice.myposts

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beatrice.myposts.databinding.ActivityMainBinding
import com.beatrice.myposts.databinding.PostsListItemBinding
import retrofit2.Retrofit
import kotlin.coroutines.coroutineContext


class PostsRvAdapter(var context : Context, var PostList:List<Post>):
  RecyclerView.Adapter<PostsRvAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
    var bindingView= PostsListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostViewHolder(bindingView)

    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
      var currentPost=PostList.get(position)
        holder.binding.tvUserId.text=currentPost.UserId.toString()
        holder.binding.tvId.text=currentPost.id.toString()
        holder.binding.tvTitle.text=currentPost.title
        holder.binding.tvBody.text=currentPost.body

      }

    override fun getItemCount(): Int {
      return PostList.size
    }

    class PostViewHolder(val binding: PostsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}