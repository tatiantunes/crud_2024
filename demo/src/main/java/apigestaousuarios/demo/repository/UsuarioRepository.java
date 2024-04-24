package apigestaousuarios.demo.repository;

import apigestaousuarios.demo.entities.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends MongoRepository<UsuarioEntity, String> {

}