package com.example.little_lemon.ui.theme

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Database(entities = [MenuItem::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun menuDao(): MenuDao
}

@Entity(tableName = "menu")
data class MenuItem(
    @PrimaryKey val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val image: String
)

@Dao
interface MenuDao {
    @Insert
    suspend fun insertAll(menuItems: List<MenuItem>)

    @Query("SELECT * FROM menu")
    suspend fun getAll(): List<MenuItem>
}