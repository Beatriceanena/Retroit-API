package com.beatrice.myposts

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beatrice.myposts.databinding.CommentListItemBinding


    class CommentsAdapter(var commentList: List<Comment>): RecyclerView.Adapter<CommentViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
            var binding = CommentListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return CommentViewHolder(binding)
        }

        override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
            var currentComment = commentList.get(position)
            holder.binding.tvpostId1.text = currentComment.postId.toString()
            holder.binding.tvId2.text = currentComment.id.toString()
            holder.binding.tvName2.text = currentComment.name
            holder.binding.tvEmail2.text = currentComment.email
            holder.binding.tvBody1.text = currentComment.body
            val context = holder.itemView.context
            holder.binding.cvComments2.setOnClickListener {
                val intent = Intent(context, CommentActivity2::class.java)
                intent.putExtra("POST_ID", currentComment.id)
                context.startActivity(intent)
            }

        }

        override fun getItemCount(): Int {
            return commentList.size
        }

    }

//    class CommentViewHolder(var binding: CommentListItemBinding): RecyclerView.ViewHolder(binding.root)


class CommentViewHolder(var binding:CommentListItemBinding):RecyclerView.ViewHolder(binding.root)