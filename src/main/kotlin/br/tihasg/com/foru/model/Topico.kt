package br.tihasg.com.foru.model

import java.time.LocalDateTime

data class Topico(
        var id: Long? =null,
        val title: String,
        val msg: String,
        val dataCriacao: LocalDateTime = LocalDateTime.now(),
        val curso: Curso,
        val autor: Usuario,
        val status: StatusTopicos = StatusTopicos.NAO_RESPONDIDO,
        val respsta: List<Resposta> = ArrayList()
)