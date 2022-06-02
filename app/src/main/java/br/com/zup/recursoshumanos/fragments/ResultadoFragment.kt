package br.com.zup.recursoshumanos.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.recursoshumanos.R
import br.com.zup.recursoshumanos.databinding.FragmentResultadoBinding
import br.com.zup.recursoshumanos.model.Funcionario

class ResultadoFragment : Fragment() {
    private lateinit var binding: FragmentResultadoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultadoBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val funcionario = arguments?.getParcelable<Funcionario>("FUNCIONARIO")

        funcionario?.let {
            binding.texto.text = it.getNome()
//            binding.texto1.text = it.getValorHora().toString()
//            binding.texto2.text = it.getHorasTrabalhadas().toString()
        }

        /*
        * converter pra editable. */
    }
}