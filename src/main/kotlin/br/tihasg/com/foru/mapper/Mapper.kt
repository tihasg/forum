package br.tihasg.com.foru.mapper

interface Mapper<T, U> {
     fun map(t: T): U
}
