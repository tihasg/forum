package br.tihasg.com.foru.controller

import br.tihasg.com.foru.dto.NovoTopicoForm
import br.tihasg.com.foru.dto.TopicoView
import br.tihasg.com.foru.dto.UpdateTopicoForm
import br.tihasg.com.foru.service.TopicoService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {
    @GetMapping
    fun listar(): List<TopicoView> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView {
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody @Valid dto: NovoTopicoForm) {
        service.cadastrar(dto)
    }

    @PutMapping
    fun atualizar(@RequestBody @Valid dto: UpdateTopicoForm) {
        service.atualizar(dto)
    }

    @DeleteMapping("/{id}")
    fun deletar(@PathVariable id: Long) {
        service.delete(id)
    }
}