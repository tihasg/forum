package br.tihasg.com.foru.repository

import br.tihasg.com.foru.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<Usuario, Long> {

}