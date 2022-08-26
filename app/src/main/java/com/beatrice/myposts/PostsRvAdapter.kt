package com.beatrice.myposts


import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beatrice.myposts.databinding.PostsListItemBinding



class PostsRvAdapter(var PostList:List<Post>):
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
        val context=holder.itemView.context
        holder.binding.cvPost.setOnClickListener{
        val intent=Intent(context,CommentActivity2::class.java)
        intent.putExtra("POST_ID",currentPost.id)
        context.startActivity(intent)
      }

      }

    override fun getItemCount(): Int {
      return PostList.size
    }
    class PostViewHolder(val binding: PostsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}