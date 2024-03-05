package br.tihasg.com.foru.repository

import br.tihasg.com.foru.model.Curso
import br.tihasg.com.foru.model.Topico
import org.springframework.data.jpa.repository.JpaRepository

interface CursoRepository: JpaRepository<Curso, Long> {

}