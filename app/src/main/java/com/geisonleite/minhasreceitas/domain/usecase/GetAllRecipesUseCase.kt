package com.geisonleite.minhasreceitas.domain.usecase

import com.geisonleite.minhasreceitas.domain.repository.RecipeRepository

class GetAllRecipesUseCase constructor(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke() = repository.getAll()
}