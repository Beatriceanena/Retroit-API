package com.beatrice.myposts

import android.provider.ContactsContract

data class Post(
    var UserId:Int,
    var id:Int,
    var title:String,
    var body:String
)

data class Comment(
    var postId:Int,
    var id:Int,
    var name: String,
    var email: String,
    var body: String
)
