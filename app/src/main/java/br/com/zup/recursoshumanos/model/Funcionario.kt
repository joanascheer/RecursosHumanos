package br.com.zup.recursoshumanos.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Funcionario(
    private val nome: String,
    private val horasTrabalhadas: Int,
    private val valorHora: Double,
) : Parcelable {

    fun getNome() = this.nome
    fun getHorasTrabalhadas() = this.horasTrabalhadas
    fun getValorHora() = this.valorHora
}