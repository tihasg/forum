package br.tihasg.com.foru.dto

import br.tihasg.com.foru.model.StatusTopicos
import java.time.LocalDateTime

data class TopicoView(
        val id: Long?,
        val title: String,
        val msg: String,
        val statusTopicos: StatusTopicos,
        val dataCriacao: LocalDateTime
)