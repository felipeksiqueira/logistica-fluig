package com.fluig.dto;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GastoVeiculoDTO implements Comparable {

    private Long id;
    private String nome;
    private String marca;
    private String modelo;
    private String ano;
    private double quantidadeCombustivelGasto;
    private double valorTotalGastoCombustivel;

    @Override public int compareTo(Object o){
        GastoVeiculoDTO i = (GastoVeiculoDTO) o;
        if(this.valorTotalGastoCombustivel < i.valorTotalGastoCombustivel)
            return -1;
        if(this.valorTotalGastoCombustivel > i.valorTotalGastoCombustivel)
            return 1;
        return 0;
    }
}
