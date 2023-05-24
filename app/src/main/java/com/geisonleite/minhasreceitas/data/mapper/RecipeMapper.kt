package com.geisonleite.minhasreceitas.data.mapper

import com.geisonleite.minhasreceitas.data.entity.RecipeEntity
import com.geisonleite.minhasreceitas.domain.model.RecipeDomain

fun RecipeDomain.toEntity() = RecipeEntity(
    id = id,
    name = name
    //prepareTime = prepareTime
)

fun RecipeEntity.toDomain() = RecipeDomain(
    id = id,
    name = name
    //prepareTime = prepareTime
)