package com.projeto.atacadinho.controller

import com.projeto.atacadinho.domain.dtos.request.UserLoginRequestDto
import com.projeto.atacadinho.domain.dtos.request.UserRequestDto
import com.projeto.atacadinho.domain.dtos.request.UserUpdateRequestDto
import com.projeto.atacadinho.domain.dtos.response.UserResponseDto
import com.projeto.atacadinho.domain.dtos.response.UserResponseWithOutPassWordDto
import com.projeto.atacadinho.domain.services.UserServiceInterface
import com.projeto.atacadinho.infrastructure.repository.UsuarioRepository
import org.springframework.web.bind.annotation.*

@CrossOrigin("*")
@RestController
@RequestMapping("/usuario")
class UserController(
    val userService: UserServiceInterface,
    val usuarioRepository: UsuarioRepository
) {

    @PostMapping("/cadastrar")
    fun save(@RequestBody userRequestDto: UserRequestDto) : UserResponseDto {
        return userService.save(userRequestDto)
    }

    @PutMapping("/atualizar/usuario")
    fun updateUser(@RequestBody userUpdateRequestDto: UserUpdateRequestDto): UserResponseDto {
        return userService.update(userUpdateRequestDto)
    }

    @PostMapping("/login")
    fun login(@RequestBody userLoginRequestDto: UserLoginRequestDto) : String {
        return userService.login(userLoginRequestDto)
    }

    @PostMapping("/admin/login")
    fun loginAdmin(@RequestBody userLoginRequestDto: UserLoginRequestDto) : String {
        return userService.loginAdmin(userLoginRequestDto)
    }

    // Função abaixo de listar estoque
    @GetMapping("/admin/listarUsuarios")
    fun listarusuarios():List<UserResponseWithOutPassWordDto>{
        val items = usuarioRepository.findAll()
        return items.map {
            UserResponseWithOutPassWordDto(
                name = it.name,
                email = it.name
            )
        }
    }
}
