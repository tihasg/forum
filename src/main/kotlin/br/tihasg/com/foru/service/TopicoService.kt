package br.tihasg.com.foru.service

import br.tihasg.com.foru.model.Curso
import br.tihasg.com.foru.model.Topico
import br.tihasg.com.foru.model.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService {
    fun listar(): List<Topico> {
        val topico = Topico(
                id = 1,
                title = "Duvidas kotlin",
                msg = "Erro ao iniciar",
                curso = Curso(
                        id = 1,
                        nome = "Kotlin",
                        categoria = "Programacao",
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Ana da desde",
                        email = "ana@gmail.com"
                )
        )

        return listOf(topico, topico)
    }
}