package ru.netology.repository

import ru.netology.model.PostModel

interface PostRepository {
    suspend fun getAll(): List<PostModel>
    suspend fun getById(id: Int): PostModel?
    suspend fun save(item: PostModel): PostModel
    suspend fun removeById(id: Int)
    suspend fun likeById(id: Int): PostModel?
    suspend fun dislikeById(id: Int): PostModel?
}
