package br.tihasg.com.foru.service

import br.tihasg.com.foru.model.Curso
import br.tihasg.com.foru.model.Topico
import br.tihasg.com.foru.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico>) {
    init {
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

        val topico2 = Topico(
                id = 2,
                title = "Duvidas kotlin",
                msg = "Erro ao iniciar",
                curso = Curso(
                        id = 1,
                        nome = "Kotlin",
                        categoria = "Programacao",
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Ana da desde2",
                        email = "ana@gmail.com"
                )
        )

        val topico3 = Topico(
                id = 3,
                title = "Duvidas kotlin3",
                msg = "Erro ao iniciar",
                curso = Curso(
                        id = 1,
                        nome = "Kotlin",
                        categoria = "Programacao",
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Ana da desde3",
                        email = "ana@gmail.com"
                )
        )

        topicos = listOf(topico, topico2, topico3)
    }

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
    }
}