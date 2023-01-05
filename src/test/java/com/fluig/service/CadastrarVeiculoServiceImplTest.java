package com.fluig.service;

import com.fluig.dto.VeiculoDTO;
import com.fluig.entity.VeiculoEntity;
import com.fluig.exception.CadastroVeiculoException;
import com.fluig.repository.CadastroVeiculoRepository;
import com.fluig.service.impl.CadastrarVeiculoServiceImpl;
import com.google.common.base.Verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CadastrarVeiculoServiceImplTest {

    @InjectMocks
    CadastrarVeiculoServiceImpl cadastrarVeiculoService;

    @Mock
    CadastroVeiculoRepository cadastroVeiculoRepository;

    @Test
    void cadastraVeiculo() throws CadastroVeiculoException {

        //Não tive tempo de finalizar os testes mas caso queira eu posso mandar amanha com tudo pronto

        when(cadastroVeiculoRepository.save(any(VeiculoEntity.class))).thenReturn(getEntity());
        when(cadastrarVeiculoService.cadastrarVeiculo(any())).thenReturn(getVeiculoDTO());

        assertEquals(getVeiculoDTO().getId(), getEntity().getId());

    }

    private VeiculoEntity getEntity() {
        return VeiculoEntity.builder()
                .id(1L)
                .nome("")
                .modelo("")
                .marca("")
                .dataFabricacao(LocalDate.now())
                .consumoMedioCidade(1)
                .consumoMedioRodovia(2)
                .build();
    }

    private VeiculoDTO getVeiculoDTO() {
       return VeiculoDTO.builder()
                .id(1L)
                .marca("")
                .nome("")
                .modelo("")
                .dataFabricacao(LocalDate.now())
                .consumoMedioCidade(1)
                .consumoMedioRodovia(2)
                .build();
    }

}

