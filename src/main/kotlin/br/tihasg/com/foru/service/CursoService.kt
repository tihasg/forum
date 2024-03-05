package br.tihasg.com.foru.service

import br.tihasg.com.foru.model.Curso
import br.tihasg.com.foru.repository.CursoRepository
import br.tihasg.com.foru.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class CursoService(private val repository: CursoRepository) {

    fun buscarPorId(id: Long): Curso {
        return repository.getOne(id)
    }

}
