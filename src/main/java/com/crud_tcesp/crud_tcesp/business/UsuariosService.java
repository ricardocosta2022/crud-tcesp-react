package com.crud_tcesp.crud_tcesp.business;

import com.crud_tcesp.crud_tcesp.infrastructure.entitys.Usuario;
import com.crud_tcesp.crud_tcesp.infrastructure.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    private final UsuariosRepository repository;

    public UsuariosService(UsuariosRepository repository) {
        this.repository = repository;
    }

    public Usuario salvar(Usuario usuarios){
        return repository.save(usuarios);
    }

    public List<Usuario> listarTodos(){
        return repository.findAll();
    }


    public List<Usuario> listarPorNomeESenha(String nome, String password) {
        return repository.listarPorNomeESenha(nome, password);
    }

}
