package com.projeto.atacadinho.domain.services.impl

import com.projeto.atacadinho.domain.dtos.request.UserLoginRequestDto
import com.projeto.atacadinho.domain.dtos.request.UserRequestDto
import com.projeto.atacadinho.domain.dtos.request.UserUpdateRequestDto
import com.projeto.atacadinho.domain.dtos.response.UserResponseDto
import com.projeto.atacadinho.infrastructure.repository.UsuarioRepository
import com.projeto.atacadinho.domain.model.Usuario
import com.projeto.atacadinho.domain.services.UserServiceInterface
import com.projeto.atacadinho.infrastructure.repository.AdminRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    val userService: UsuarioRepository,
    val adminRepository: AdminRepository
): UserServiceInterface {
    override fun save(userRequestDto: UserRequestDto): UserResponseDto {
        val user = userService.save(
            Usuario(
                name = userRequestDto.name,
                email = userRequestDto.email,
                senha = userRequestDto.senha
            )
        )
        return UserResponseDto(
            id = user.id,
            name = user.name,
            email = user.email,
            senha = user.senha
        )
    }

    override fun update(userRequestDto: UserUpdateRequestDto): UserResponseDto {
        // Busca o último usuário cadastrado no banco de dados
        val BuscarUsuario = userService.findAll().last()

        // Atualiza os campos do usuário existente com os novos dados
        BuscarUsuario.email = userRequestDto.email
        BuscarUsuario.senha = userRequestDto.senha

        // Salva o usuário atualizado no banco de dados
        val updatedUser = userService.save(BuscarUsuario)

        // Retorna o usuário atualizado como UserResponseDto
        return UserResponseDto(
            id = updatedUser.id,
            name = updatedUser.name,
            email = updatedUser.email,
            senha = updatedUser.senha
        )
    }

    override fun login(userLoginRequestDto: UserLoginRequestDto): String {
        val usuarioEmail = userService.findByEmail(userLoginRequestDto.email).orElseThrow()
        val result = if (usuarioEmail.senha == userLoginRequestDto.senha){
            "Login Efetuado"
        } else {
            "Senha incorreta"
        }
        if (result != "Login Efetuado"){
            throw Exception("Senha incorreta")
        }
        return result
    }

    override fun loginAdmin(userLoginRequestDto: UserLoginRequestDto): String {
        val usuarioEmail = adminRepository.findByEmail(userLoginRequestDto.email).orElseThrow()
        val result = if (usuarioEmail.senha == userLoginRequestDto.senha){
            "Login Efetuado"
        } else {
            "Senha incorreta"
        }
        if (result != "Login Efetuado"){
            throw Exception("Senha incorreta")
        }
        return result
    }
}
