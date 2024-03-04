package br.tihasg.com.foru.controller

import br.tihasg.com.foru.model.Curso
import br.tihasg.com.foru.model.Topico
import br.tihasg.com.foru.model.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController {
    @GetMapping
    fun listar(): List<Topico> {
      val topico = Topico(
              id = 1,
              title = "Duvidas kotlin",
              msg = "Erro ao iniciar",
              curso = Curso(
                      id = 1,
                      nome = "Kotlin",
                      categoria = "Programacao",
              ),
              autor = Usuario(
                      id = 1,
                      nome = "Ana da silva",
                      email = "ana@gmail.com"
              )
      )

      return listOf(topico, topico)
    }
}