package apigestaousuarios.demo.service;

import apigestaousuarios.demo.dto.UsuarioDTO;
import apigestaousuarios.demo.entities.UsuarioEntity;
import apigestaousuarios.demo.exception.UserBusinessException;
import apigestaousuarios.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public static final String REQUEST = "document";



    public List<UsuarioEntity> getAllUsers(){
        List<UsuarioEntity> userList = new ArrayList<>();
        try{
            userList = usuarioRepository.findAll();

        }catch(Exception e){

        }
        return userList;

    }


    public String createUsuario(UsuarioDTO usuarioDTO) {

        try {
            UsuarioEntity user = UsuarioEntity.builder()
                    .name(usuarioDTO.getName())
                    .document(usuarioDTO.getDocument())
                    .email(usuarioDTO.getEmail())
                    .build();
            usuarioRepository.save(user);



        }catch(Exception e) {
            throw new UserBusinessException("Erro ao gravar dados de usuário", e);
        }
        return "Usuario salvo!!";


    }

    public String atualizaUsuario(UsuarioDTO user) {

        try {

            UsuarioEntity newUser = UsuarioEntity.builder()
                    .id(user.getId())
                    .name(user.getName())
                    .document(user.getDocument())
                    .email(user.getEmail())
                    .build();
            usuarioRepository.save(newUser);



        }catch(Exception e) {
            throw new UserBusinessException("Erro ao atualizar dados de usuário", e);
        }
        return "Usuario Atualizado!!";


    }

    public String DeleteUser(@RequestParam String id) {
        try {
            usuarioRepository.deleteById(id);


        }catch(Exception e) {
            throw new UserBusinessException("Erro ao deletar os dados de usuário", e);
        }
        return "Usuario deletado!!";


    }
}