package br.tihasg.com.foru.service

import br.tihasg.com.foru.dto.NovoTopicoForm
import br.tihasg.com.foru.dto.TopicoView
import br.tihasg.com.foru.dto.UpdateTopicoForm
import br.tihasg.com.foru.exception.NotFoundException
import br.tihasg.com.foru.mapper.TopicoFormMapper
import br.tihasg.com.foru.mapper.TopicoViewMapper
import br.tihasg.com.foru.model.Topico
import br.tihasg.com.foru.repository.TopicoRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicoService(
        private val repository: TopicoRepository,
        private val topicoViewMapper: TopicoViewMapper,
        private val topicoFormMapper: TopicoFormMapper
) {

    fun listar(): List<TopicoView> {
        return repository.findAll().stream().map { t ->
            topicoViewMapper.map(t)
        }.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = repository.findById(id).orElseThrow { NotFoundException("Topico nao encontrado") }
        return topicoViewMapper.map(topico)
    }

    fun cadastrar(dto: NovoTopicoForm): TopicoView {
        val topico = topicoFormMapper.map(dto)
        repository.save(topico)
        return topicoViewMapper.map(topico)
    }

    fun atualizar(dto: UpdateTopicoForm): TopicoView {
        val topico = repository.findById(dto.id).orElseThrow { NotFoundException("Topico nao encontrado") }
        topico.title = dto.title
        topico.msg = dto.msg
        return topicoViewMapper.map(topico)
    }

    fun delete(id: Long) {
        repository.deleteById(id)
    }
}