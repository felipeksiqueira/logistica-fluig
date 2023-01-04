package com.fluig.utils;

import com.fluig.dto.VeiculoDTO;
import com.fluig.entity.VeiculoEntity;
import org.springframework.stereotype.Component;

@Component
public class ConverDTO {

    public VeiculoEntity toEntity(VeiculoDTO dto){
        return VeiculoEntity.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .marca(dto.getMarca())
                .modelo(dto.getModelo())
                .dataFabricacao(dto.getDataFabricacao())
                .consumoMedioCidade(dto.getConsumoMedioCidade())
                .consumoMedioRodovia(dto.getConsumoMedioRodovia())
                .build();
    };

       public  VeiculoDTO toDTO(VeiculoEntity entity){
        return VeiculoDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .marca(entity.getMarca())
                .modelo(entity.getModelo())
                .dataFabricacao(entity.getDataFabricacao())
                .consumoMedioCidade(entity.getConsumoMedioCidade())
                .consumoMedioRodovia(entity.getConsumoMedioRodovia())
                .build();
    };
}
