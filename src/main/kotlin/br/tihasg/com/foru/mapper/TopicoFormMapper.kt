package br.tihasg.com.foru.mapper

import br.tihasg.com.foru.dto.NovoTopicoForm
import br.tihasg.com.foru.model.Topico
import br.tihasg.com.foru.service.CursoService
import br.tihasg.com.foru.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(private val cursoService: CursoService,
                       private val usuarioService: UsuarioService) : Mapper<NovoTopicoForm, Topico> {

    override fun map(t: NovoTopicoForm): Topico {
        return Topico(title = t.title, msg = t.msg, curso = cursoService.buscarPorId(t.curso), autor = usuarioService.buscarPorId(t.autor), id = t.id)
    }
}