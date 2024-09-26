// HomeController.kt
package com.projeto.atacadinho.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/test")
    fun testConnection(): String {
        return "Backend is connected!"
    }
}