package com.fluig.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "VEICULO")
public class VeiculoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "MARCA")
    private String marca;

    @Column(name = "MODELO")
    private String modelo;

    @Column(name = "DATA_FABRICACAO")
    private LocalDate dataFabricacao;

    @Column(name = "CONSUMO_MEDIO_CIDADE")
    private double consumoMedioCidade;

    @Column(name = "CONSUMO_MEDIO_RODOVIAS")
    private double consumoMedioRodovia;
}
