package com.projeto.atacadinho.infrastructure.repository

import com.projeto.atacadinho.domain.model.Produto
import com.projeto.atacadinho.domain.model.ProdutoHistorico
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface ProdutoHistoricoRepository: CrudRepository<ProdutoHistorico, Long> {
}