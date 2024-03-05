package br.tihasg.com.foru.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Topico(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var title: String,
        var msg: String,
        val dataCriacao: LocalDateTime = LocalDateTime.now(),
        @ManyToOne
        val curso: Curso, @ManyToOne
        val autor: Usuario,
        @Enumerated(value = EnumType.STRING)
        val status: StatusTopicos = StatusTopicos.NAO_RESPONDIDO,
        @OneToMany (mappedBy = "topico")
        val respostas: List<Resposta> = ArrayList())
