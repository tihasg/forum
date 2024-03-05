package br.tihasg.com.foru.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class NovoTopicoForm(
        @field:NotNull val id: Long,
        @field:NotEmpty @field:Size(min = 5, max = 10, message = "Titulo deve ter entre 5 a 100 caracteres") val title: String,
        @field:NotEmpty(message = "nao pode ser vazio") val msg: String,
        @field:NotNull val autor: Long,
        @field:NotNull val curso: Long
)
