package br.tihasg.com.foru.service

import br.tihasg.com.foru.dto.NovoTopicoForm
import br.tihasg.com.foru.dto.TopicoView
import br.tihasg.com.foru.dto.UpdateTopicoForm
import br.tihasg.com.foru.mapper.TopicoFormMapper
import br.tihasg.com.foru.mapper.TopicoViewMapper
import br.tihasg.com.foru.model.Topico
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicoService(
        private var topicos: List<Topico> = ArrayList(),
        private val topicoViewMapper: TopicoViewMapper,
        private val topicoFormMapper: TopicoFormMapper
) {

    fun listar(): List<TopicoView> {
        return topicos.stream().map { t ->
            topicoViewMapper.map(t)
        }.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
        return topicoViewMapper.map(topico)
    }

    fun cadastrar(dto: NovoTopicoForm) {
        val topico = topicoFormMapper.map(dto)
        topico.id = topicos.size.toLong() + 1
        topicos = topicos.plus(topicoFormMapper.map(dto))
    }

    fun atualizar(dto: UpdateTopicoForm) {
        val topico = topicos.stream().filter { t ->
            t.id == dto.id
        }.findFirst().get()

        topicos = topicos.minus(topico).plus(Topico(
                id = dto.id,
                title = dto.title,
                msg = dto.msg,
                curso = topico.curso,
                dataCriacao = topico.dataCriacao,
                autor = topico.autor,
                status = topico.status,
                respsta = topico.respsta
        ))
    }

    fun delete(id: Long) {
        val topico = topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()

        topicos = topicos.minus(topico)
    }
}