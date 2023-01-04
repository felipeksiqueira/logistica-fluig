package com.fluig.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.*;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class VeiculoDTO {

    private Long id;
    private String nome;
    private String marca;
    private String modelo;
    private LocalDate dataFabricacao;
    private double consumoMedioCidade;
    private double consumoMedioRodovia;

}
