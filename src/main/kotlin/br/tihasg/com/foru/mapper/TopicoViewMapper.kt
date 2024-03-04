package br.tihasg.com.foru.mapper

import br.tihasg.com.foru.dto.TopicoView
import br.tihasg.com.foru.model.Topico
import org.springframework.stereotype.Component

@Component
class TopicoViewMapper: Mapper<Topico, TopicoView> {
    override fun map(t: Topico): TopicoView {
       return TopicoView(
               id = t.id,
               title = t.title,
               msg = t.msg,
               dataCriacao = t.dataCriacao,
               statusTopicos = t.status
       )
    }
}