package br.tihasg.com.foru.mapper

import br.tihasg.com.foru.dto.TopicoForm
import br.tihasg.com.foru.model.Topico
import br.tihasg.com.foru.service.CursoService
import br.tihasg.com.foru.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(private val cursoService: CursoService,
                       private val usuarioService: UsuarioService) : Mapper<TopicoForm, Topico> {

    override fun map(t: TopicoForm): Topico {
        return Topico(title = t.title, msg = t.msg, curso = cursoService.buscarPorId(t.curso), autor = usuarioService.buscarPorId(t.autor))
    }
}