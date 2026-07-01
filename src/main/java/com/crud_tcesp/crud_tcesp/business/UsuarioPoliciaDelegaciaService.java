package com.crud_tcesp.crud_tcesp.business;

import com.crud_tcesp.crud_tcesp.infrastructure.dtos.UsuarioPoliciaDelegaciaDTO;
import com.crud_tcesp.crud_tcesp.infrastructure.repository.UsuarioPoliciaDelegaciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioPoliciaDelegaciaService {

    @Autowired
    private final UsuarioPoliciaDelegaciaRepository repository;

    public UsuarioPoliciaDelegaciaService(UsuarioPoliciaDelegaciaRepository repository) {
        this.repository = repository;
    }

    // Método para carregar os dados iniciais da grid
    public List<UsuarioPoliciaDelegaciaDTO> listaCarregamentoGridInicial(Integer codDelegacia, String loginNome) {
        return repository.listaCarregamentoGridInicialOuListarPorNomeOuCodigoUnidadde(codDelegacia, loginNome);
    }

    // Método para listar por código de unidade, login ou nome
    public List<UsuarioPoliciaDelegaciaDTO> listarPorCodigoUnidadeOuLoginOuNome(Integer codDelegacia, String loginNome) {
        return repository.listaCarregamentoGridInicialOuListarPorNomeOuCodigoUnidadde(codDelegacia, loginNome);
    }


}
