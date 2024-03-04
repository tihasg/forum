package br.tihasg.com.foru.controller

import br.tihasg.com.foru.model.Topico
import br.tihasg.com.foru.service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {
    @GetMapping
    fun listar(): List<Topico> {
        return service.listar()
    }
}