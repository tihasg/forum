package br.tihasg.com.foru.dto

data class TopicoForm(
        val title: String,
        val msg: String,
        val autor: Long,
        val curso: Long
)