package com.geisonleite.minhasreceitas.domain.repository

import com.geisonleite.minhasreceitas.domain.model.RecipeDomain
import kotlinx.coroutines.flow.Flow

interface RecipeRepository {
    suspend fun getAll(): List<RecipeDomain>
    suspend fun insert(recipe: RecipeDomain)
    /*suspend fun getRecipeWithIngredientsAndPrepareMode(idRecipe: Int): FullRecipeDomain
    suspend fun insertIngredient(ingredient: IngredientDomain)
    suspend fun insertPrepareMode(prepareMode: PrepareModeDomain)
    suspend fun updateIngredient(ingredient: IngredientDomain)
    suspend fun updatePrepareMode(prepareMode: PrepareModeDomain)*/
}