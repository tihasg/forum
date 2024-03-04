package br.tihasg.com.foru.service

import br.tihasg.com.foru.dto.TopicoForm
import br.tihasg.com.foru.dto.TopicoView
import br.tihasg.com.foru.model.Topico
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicoService(
        private var topicos: List<Topico> = ArrayList(),
        private val cursoService: CursoService,
        private val usuarioService: UsuarioService
) {

    fun listar(): List<TopicoView> {
        return topicos.stream().map { t ->
            TopicoView(
                    id = t.id,
                    title = t.title,
                    msg = t.msg,
                    dataCriacao = t.dataCriacao,
                    statusTopicos = t.status
            )
        }.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
        return TopicoView(
                id = topico.id,
                title = topico.title,
                msg = topico.msg,
                dataCriacao = topico.dataCriacao,
                statusTopicos = topico.status
        )
    }

    fun cadastrar(dto: TopicoForm) {
        topicos = topicos.plus(Topico(id = topicos.size.toLong() + 1, title = dto.title, msg = dto.msg, curso = cursoService.buscarPorId(dto.curso), autor = usuarioService.buscarPorId(dto.autor)))
    }
}