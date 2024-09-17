package com.projeto.atacadinho.domain.dtos.request

import javax.validation.constraints.NotBlank

data class ProductNameRequest (
    @field:NotBlank
    val name: String
)
