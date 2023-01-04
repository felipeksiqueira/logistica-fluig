package com.fluig.service;

import com.fluig.dto.GastoVeiculoDTO;
import com.fluig.dto.VeiculoDTO;
import com.fluig.exception.CadastroVeiculoException;

import java.util.List;

public interface CadastrarVeiculoService {

    VeiculoDTO cadastrarVeiculo(VeiculoDTO veiculoDTO) throws CadastroVeiculoException;

    List<GastoVeiculoDTO> listRankVeiculo(float preco, float totalCidade, float totalRodovias);
}
