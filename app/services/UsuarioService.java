package services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import domain.models.Categoria;
import domain.repository.CategoriaRepository;
import infrastructure.entities.CategoriaEntity;

import java.util.List;

public class UsuarioService {

    @Inject
    static CategoriaRepository categoriaRepository;

    public static List<Categoria> getCategorias(Integer idUsuario){

        List<Categoria> categoriaEntityList = categoriaRepository.listByUsuario(idUsuario);

        return categoriaEntityList;

    }

}
