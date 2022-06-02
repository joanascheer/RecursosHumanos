package br.com.zup.recursoshumanos.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.zup.recursoshumanos.FramentClick
import br.com.zup.recursoshumanos.databinding.FragmentCadastroBinding
import br.com.zup.recursoshumanos.main.MainActivity
import br.com.zup.recursoshumanos.model.Funcionario


class CadastroFragment : Fragment() {

    private lateinit var binding: FragmentCadastroBinding
    private lateinit var interfaceClick: FramentClick

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            interfaceClick = context as MainActivity
        } catch (e: Exception) {
            Log.i("Error", "Erro ao inicializar interfaceClick ${e.message}")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCadastroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCalcular?.setOnClickListener {
            val funcionario = Funcionario(
                binding.etNome.text.toString(),
                binding.etHorasTrabalhadas.text.toString().toInt(),
                binding.etValorHora.text.toString().toDouble()
            )
            interfaceClick.clickFragment(funcionario)
        }
    }
}