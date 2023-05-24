package com.geisonleite.minhasreceitas.data.repository

import com.geisonleite.minhasreceitas.data.dao.RecipeDao
import com.geisonleite.minhasreceitas.data.mapper.toDomain
import com.geisonleite.minhasreceitas.data.mapper.toEntity
import com.geisonleite.minhasreceitas.domain.model.RecipeDomain
import com.geisonleite.minhasreceitas.domain.repository.RecipeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class RecipeRepositoryImpl(private val dao: RecipeDao) : RecipeRepository {

    override suspend fun getAll(): List<RecipeDomain> = withContext(Dispatchers.IO) {
        dao.getAll().map {
            it.toDomain()
        }
    }

    override suspend fun insert(recipe: RecipeDomain) = withContext(Dispatchers.IO) {
        dao.insert(recipe.toEntity())
    }

    /*override suspend fun getRecipeWithIngredientsAndPrepareMode(idRecipe: Int): FullRecipeDomain =
        withContext(Dispatchers.IO) {
            dao.getRecipeWithIngredientsAndPrepareMode(idRecipe).toDomain()
        }

    override suspend fun insertIngredient(ingredient: IngredientDomain) =
        withContext(Dispatchers.IO) {
            dao.insert(
                Ingredient(
                    id = ingredient.id,
                    name = ingredient.name,
                    idRecipe = ingredient.idRecipe
                )
            )
        }

    override suspend fun insertPrepareMode(prepareMode: PrepareModeDomain) =
        withContext(Dispatchers.IO) {
            dao.insert(prepareMode.toEntity())
        }

    override suspend fun updateIngredient(ingredient: IngredientDomain) =
        withContext(Dispatchers.IO) {
            dao.updateIngredient(ingredient.toEntity())
        }

    override suspend fun updatePrepareMode(prepareMode: PrepareModeDomain) =
        withContext(Dispatchers.IO) {
            dao.updatePrepareMode(prepareMode.toEntity())
        }*/
}