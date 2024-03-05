package br.tihasg.com.foru.service

import br.tihasg.com.foru.model.Usuario
import br.tihasg.com.foru.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(private val repository: UserRepository) {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }

}
