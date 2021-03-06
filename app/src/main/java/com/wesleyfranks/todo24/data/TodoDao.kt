package com.wesleyfranks.todo24.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*

@Dao
interface TodoDao {

    @Query("SELECT * FROM todo_database WHERE completed = 0")
    fun getAllTodos(): LiveData<List<Todo>>

    @Query("SELECT * FROM todo_database WHERE completed = 1")
    fun getAllCompletedTodos(): LiveData<List<Todo>>

    @Insert
    fun insert(todo: Todo)

    @Delete
    fun deleteTodo(todo: Todo)

    @Query("DELETE FROM todo_database")
    fun deleteAllTodos()

    @Update
    fun updateTodo(todo: Todo)

}