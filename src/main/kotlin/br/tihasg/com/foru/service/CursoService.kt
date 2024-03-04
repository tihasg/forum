package br.tihasg.com.foru.service

import br.tihasg.com.foru.model.Curso
import org.springframework.stereotype.Service

@Service
class CursoService(var cursos: List<Curso>) {
    init {
        val curso = Curso(
                id = 1,
                nome = "kotlin",
                categoria = "Desenvolvmento"
        )

        cursos = listOf(curso)
    }

    fun buscarPorId(id: Long): Curso {
        return cursos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
    }

}
