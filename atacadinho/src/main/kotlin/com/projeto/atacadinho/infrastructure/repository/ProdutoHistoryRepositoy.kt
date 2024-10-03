package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.model.ProdutoHistory
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProdutoHistoryRepositoy: CrudRepository<ProdutoHistory, Long> {
}