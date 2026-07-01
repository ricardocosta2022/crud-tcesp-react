package com.crud_tcesp.crud_tcesp.business;

import com.crud_tcesp.crud_tcesp.exceptions.ResourceNotFoundException;
import com.crud_tcesp.crud_tcesp.infrastructure.entitys.Delegacia;
import com.crud_tcesp.crud_tcesp.infrastructure.repository.DelegaciaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class DelegaciaServiceTest {

    @Mock
    private DelegaciaRepository repository;

    @InjectMocks
    private DelegaciaService service;

    @Test
    void deveRetornarListaDeDelegacias() {

        Delegacia d1 = new Delegacia();
        d1.setCod_delegacia(1);
        d1.setDescricao("Protocolo - UR-18");

        Delegacia d2 = new Delegacia();
        d2.setCod_delegacia(2);
        d2.setDescricao("Protocolo - UR-19");

        when(repository.findAll()).thenReturn(List.of(d1, d2));

        var resultado = service.listarTodos();

        assertEquals(2, resultado.size());
        verify(repository).findAll();
    }


    @Test
    void deveRetornarListaQuandoDescricaoExistir() {

        Delegacia delegacia = new Delegacia();
        delegacia.setCod_delegacia(1);
        delegacia.setDescricao("Protocolo - UR-18");

        when(repository.findByDescricao("Protocolo - UR-18"))
                .thenReturn(List.of(delegacia));

        var resultado = service.listarDescricao("Protocolo - UR-18");

        assertEquals(1, resultado.size());
        assertEquals("Protocolo - UR-18", resultado.get(0).getDescricao()  );
    }

    @Test
    void deveLancarExceptionQuandoNaoEncontrar() {

        when(repository.findByDescricao("Protocolo - UR-18"))
                .thenReturn(Collections.emptyList());

        assertThrows(ResourceNotFoundException.class,
                () -> service.listarDescricao("Protocolo - UR-18"));
    }

    @Test
    void deveLancarIllegalArgumentQuandoDescricaoForNull() {

        assertThrows(IllegalArgumentException.class,
                () -> service.listarDescricao(null));
    }

    @Test
    void deveLancarIllegalArgumentQuandoDescricaoForVazia() {

        assertThrows(IllegalArgumentException.class,
                () -> service.listarDescricao(" "));
    }

}
