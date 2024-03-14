package com.lautadev.proyectoroque.service;

import com.lautadev.proyectoroque.model.Usuario;
import com.lautadev.proyectoroque.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private IUsuarioRepository usuRepo;
    
    @Override
    public void crearUsuario(Usuario usuario) {
        usuRepo.save(usuario);
    }

    @Override
    public List<Usuario> traerUsuario() {
        List<Usuario> listaUsuarios = usuRepo.findAll();
        return listaUsuarios;
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario usuario = usuRepo.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuRepo.deleteById(id);
    }

    @Override
    public void editarUsuario(Usuario usuario) {
        this.crearUsuario(usuario);
    }
    
}
