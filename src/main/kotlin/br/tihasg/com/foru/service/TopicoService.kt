package br.tihasg.com.foru.service

import br.tihasg.com.foru.dto.TopicoDto
import br.tihasg.com.foru.model.Topico
import org.springframework.stereotype.Service

@Service
class TopicoService(
        private var topicos: List<Topico> = ArrayList(),
        private val cursoService: CursoService,
        private val usuarioService: UsuarioService
        ) {

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
    }

    fun cadastrar(dto: TopicoDto) {
        topicos = topicos.plus(Topico(id = topicos.size.toLong() + 1, title = dto.title, msg = dto.msg, curso = cursoService.buscarPorId(dto.curso), autor = usuarioService.buscarPorId(dto.autor)))
    }
}