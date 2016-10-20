package infrastructure.repository;

import infrastructure.entities.CategoriaEntity;
import validations.GoalsException;

import java.util.List;

public interface CategoriaEntityRepository {

    CategoriaEntity insert(CategoriaEntity categoria);

    List<CategoriaEntity> listByUsuario(Integer idUsuario) throws GoalsException;
}
