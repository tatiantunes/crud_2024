package apigestaousuarios.demo.dto;

import apigestaousuarios.demo.entities.UsuarioEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDTO {

    @Id
    private String id;
    private String name;
    @JsonProperty(required = true)
    private String email;
    private String document;

}
