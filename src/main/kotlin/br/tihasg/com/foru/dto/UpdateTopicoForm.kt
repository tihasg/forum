package br.tihasg.com.foru.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.yaml.snakeyaml.events.Event.ID

data class UpdateTopicoForm(
        @field:NotNull val id: Long,
        @field:NotEmpty @field:Size(min = 5, max = 10) val title: String,
        @field:NotEmpty val msg: String,
)
