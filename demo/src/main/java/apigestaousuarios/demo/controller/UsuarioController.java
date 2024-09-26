package apigestaousuarios.demo.controller;

import apigestaousuarios.demo.dto.UsuarioDTO;
import apigestaousuarios.demo.entities.UsuarioEntity;
import apigestaousuarios.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gestao")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createUsuario(@RequestBody UsuarioDTO user) {
        return usuarioService.createUsuario(user);

    }

    @GetMapping("/get/users")
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioEntity> getAllUsers() {
        return usuarioService.getAllUsers();
    }

    @PutMapping("/update")
    public String updateUsuario(@RequestBody UsuarioDTO user) {
        return usuarioService.atualizaUsuario(user);

    }

    @DeleteMapping("/delete/users")
    @ResponseStatus(HttpStatus.OK)
    public String DeleteUser(@RequestParam String id)
    {
        return usuarioService.DeleteUser(id);
    }
}

