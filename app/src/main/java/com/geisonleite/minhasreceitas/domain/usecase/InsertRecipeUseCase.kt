package com.geisonleite.minhasreceitas.domain.usecase

import com.geisonleite.minhasreceitas.domain.model.RecipeDomain
import com.geisonleite.minhasreceitas.domain.repository.RecipeRepository

class InsertRecipeUseCase  constructor(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke(recipe: RecipeDomain) = repository.insert(recipe)
}