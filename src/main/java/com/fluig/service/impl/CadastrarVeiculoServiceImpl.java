package com.fluig.service.impl;

import com.fluig.dto.GastoVeiculoDTO;
import com.fluig.dto.VeiculoDTO;
import com.fluig.entity.VeiculoEntity;
import com.fluig.exception.CadastroVeiculoException;
import com.fluig.repository.CadastroVeiculoRepository;
import com.fluig.service.CadastrarVeiculoService;
import com.fluig.utils.ConverDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CadastrarVeiculoServiceImpl implements CadastrarVeiculoService {

    @Autowired
    private CadastroVeiculoRepository cadastroVeiculoRepository;

    @Autowired
    private ConverDTO converDTO;


    @Override
    public VeiculoDTO cadastrarVeiculo(VeiculoDTO veiculoDTO) throws CadastroVeiculoException {

        VeiculoEntity veiculoEntity =  cadastroVeiculoRepository.save(converDTO.toEntity(veiculoDTO));

        return converDTO.toDTO(veiculoEntity);

    }

    @Override
    public List<GastoVeiculoDTO> listRankVeiculo(float preco, float totalCidade, float totalRodovias) {
        List<VeiculoEntity> buscaLista = cadastroVeiculoRepository.findAll();


        List<GastoVeiculoDTO> response = buscaLista.stream().map(veiculo -> {
            double rodovia = valorGasto(totalRodovias, veiculo.getConsumoMedioRodovia());
            double cidade = valorGasto(totalCidade, veiculo.getConsumoMedioCidade());
            double precoTotal = quantidadeGasto(preco, rodovia + cidade);

            GastoVeiculoDTO converteObjeto = GastoVeiculoDTO.builder()
                    .id(veiculo.getId())
                    .nome(veiculo.getNome())
                    .modelo(veiculo.getModelo())
                    .marca(veiculo.getMarca())
                    .quantidadeCombustivelGasto(rodovia + cidade)
                    .valorTotalGastoCombustivel(precoTotal)
                    .build();

            return converteObjeto;
        }).collect(Collectors.toList());

        Collections.sort(response);

        return response;
    }
    public double valorGasto(double preco, double consumo) {
        double calculo = preco * consumo;
        return calculo;
    }

    public double quantidadeGasto(double distancia, double consumoMedio) {
        double calculo =  distancia / consumoMedio;
        return calculo;
    }
}
