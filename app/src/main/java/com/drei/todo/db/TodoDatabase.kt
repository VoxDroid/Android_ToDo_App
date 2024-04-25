package com.drei.todo.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.drei.todo.Todo

@Database(entities = [Todo::class], version = 1)
@TypeConverters(Converters::class)
abstract class TodoDatabase : RoomDatabase()
{
    companion object {
        const val NAME = "Todo_DB"
    }

    abstract fun getTodoDao(): TodoDao
}