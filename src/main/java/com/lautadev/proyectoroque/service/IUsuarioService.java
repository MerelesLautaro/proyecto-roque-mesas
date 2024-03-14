package com.lautadev.proyectoroque.service;

import com.lautadev.proyectoroque.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    public void crearUsuario(Usuario usuario);
    public List<Usuario> traerUsuario();
    public Usuario findUsuario(Long id);
    public void eliminarUsuario(Long id);
    public void editarUsuario(Usuario usuario);
}
