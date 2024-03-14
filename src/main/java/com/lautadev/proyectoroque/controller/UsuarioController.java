package com.lautadev.proyectoroque.controller;

import com.lautadev.proyectoroque.model.Usuario;
import com.lautadev.proyectoroque.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    private IUsuarioService usuServ;
    
    //Endpoints
    @PostMapping("/usuario/crear")
    public String crearUsuario(@RequestBody Usuario usuario){
        usuServ.crearUsuario(usuario);
        return "Usuario creado";
    }
    
    @GetMapping("/usuario")
    public List<Usuario> traerUsuarios(){
        return usuServ.traerUsuario();
    }
    
    @GetMapping("/usuario/{id}")
    public Usuario findUsuario(@PathVariable Long id){
        return usuServ.findUsuario(id);
    }
    
    @DeleteMapping("/usuario/eliminar/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuServ.eliminarUsuario(id);
    }
    
    @PutMapping("/usuario/editar")
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        usuServ.editarUsuario(usuario);
        return usuServ.findUsuario(usuario.getId());
    }
}
