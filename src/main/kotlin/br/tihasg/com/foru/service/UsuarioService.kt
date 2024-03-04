package br.tihasg.com.foru.service

import br.tihasg.com.foru.model.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService(var users: List<Usuario>) {
    init {
        val user = Usuario(
                id = 1,
                nome = "kotlin",
                email = "tiago.dev.lr@gmail.com"
        )

        users = listOf(user)
    }

    fun buscarPorId(id: Long): Usuario {
        return users.stream().filter { t ->
            t.id == id
        }.findFirst().get()
    }

}
