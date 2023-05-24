package com.geisonleite.minhasreceitas.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.geisonleite.minhasreceitas.data.dao.RecipeDao
import com.geisonleite.minhasreceitas.data.entity.RecipeEntity

@Database(
    entities = [
        RecipeEntity::class,
        //Ingredient::class,
        //PrepareMode::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
}