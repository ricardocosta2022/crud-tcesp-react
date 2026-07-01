package com.crud_tcesp.crud_tcesp.business;

import com.crud_tcesp.crud_tcesp.exceptions.ResourceNotFoundException;
import com.crud_tcesp.crud_tcesp.infrastructure.dtos.DelegaciaDTO;
import com.crud_tcesp.crud_tcesp.infrastructure.entitys.Delegacia;
import com.crud_tcesp.crud_tcesp.infrastructure.repository.DelegaciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DelegaciaService {

    private final DelegaciaRepository repository;

    //CONSTRUTOR
    public DelegaciaService(DelegaciaRepository repository) {
        this.repository = repository;
    }

    public List<Delegacia> listarTodos(){
        return repository.findAll();
    }

    public List<DelegaciaDTO> listarCodEDescricao(){
        return repository.listarCodEDescricao();
    }

    public List<DelegaciaDTO> listarDescricao(String descricao){

        var delegacias = repository.findByDescricaoContainingIgnoreCase(descricao);

        if(delegacias.isEmpty()){
            throw new ResourceNotFoundException(
                    "Nenhuma delegacia encontrada com essa descrição"
            );
        }

        return delegacias;
    }


}
