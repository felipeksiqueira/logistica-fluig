package com.fluig.controller;

import com.fluig.dto.GastoVeiculoDTO;
import com.fluig.dto.VeiculoDTO;
import com.fluig.service.CadastrarVeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ficticius")
public class CadastroVeiculoController {

    @Autowired
    CadastrarVeiculoService service;

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("/cadastrarVeiculo")
    public VeiculoDTO cadastrarVeiculo(@RequestBody VeiculoDTO veiculoDTO) throws Exception {
        return service.cadastrarVeiculo(veiculoDTO);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/calculoGastos")
    public List<GastoVeiculoDTO> calculoGastos(@RequestParam("preco") float preco, @RequestParam("cidade") float totalCidade, @RequestParam("rodovia") float totalRodovias) throws Exception {
        List<GastoVeiculoDTO> listaVeiculo = service.listRankVeiculo(preco, totalCidade, totalRodovias) ;
        return listaVeiculo;
    }
}
