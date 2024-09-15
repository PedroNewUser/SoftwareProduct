package com.projeto.atacadinho.request

import javax.validation.constraints.NotBlank

data class ProductNameRequest (
    @field:NotBlank
    val name: String
)
