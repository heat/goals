package domain.repository;

import domain.models.Categoria;

import java.util.List;

public interface CategoriaRepository {

    Categoria insert(Categoria categoria);

    List<Categoria> listByUsuario(Integer idUsuario);
}
