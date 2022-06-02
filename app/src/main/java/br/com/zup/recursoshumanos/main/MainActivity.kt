package br.com.zup.recursoshumanos.main

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.recursoshumanos.FramentClick
import br.com.zup.recursoshumanos.R
import br.com.zup.recursoshumanos.databinding.ActivityMainBinding
import br.com.zup.recursoshumanos.fragments.CadastroFragment
import br.com.zup.recursoshumanos.fragments.ResultadoFragment
import br.com.zup.recursoshumanos.model.Funcionario

class MainActivity : AppCompatActivity(), FramentClick {
    private lateinit var binding: ActivityMainBinding

    private lateinit var nomeFuncionario: String
    private lateinit var horasTrabalhadasFuncionario: String
    private lateinit var valorHoraFuncionario: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .add(binding.container.id, CadastroFragment())
            .commit()

    }

    override fun clickFragment(funcionario: Funcionario) {


        val fragmentResultado = ResultadoFragment().apply {
            arguments = Bundle().apply {
                putParcelable("FUNCIONARIO", funcionario)
            }
        }

        supportFragmentManager
            .beginTransaction()
            .add(binding.container.id, ResultadoFragment())
            .commit()

    }


}