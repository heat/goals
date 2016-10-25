package domain.services;

import com.google.inject.Inject;
import domain.converters.CategoriaConverter;
import domain.models.Categoria;
import domain.repository.CategoriaRepository;
import infrastructure.entities.CategoriaEntity;
import infrastructure.repository.CategoriaEntityRepository;
import validations.GoalsException;

import java.util.ArrayList;
import java.util.List;

public class CategoriaService implements CategoriaRepository{

    @Inject
    CategoriaEntityRepository categoriaEntityRepository;

    public static List<Categoria> loadDefaultCategorias(){

        Categoria c1 = new Categoria(0, "Saúde");
        Categoria c2 = new Categoria(0, "Acadêmico");
        Categoria c3 = new Categoria(0, "Profissional");
        Categoria c4 = new Categoria(0, "Social");

        List<Categoria> categorias = new ArrayList<Categoria>();
        categorias.add(c1);
        categorias.add(c2);
        categorias.add(c3);
        categorias.add(c4);

        return categorias;
    }

    @Override
    public Categoria insert(Categoria categoria) {
        return null;
    }

    @Override
    public List<Categoria> listByUsuario(Integer idUsuario) throws GoalsException{

        List<CategoriaEntity> categoriaEntityList = categoriaEntityRepository.listByUsuario(idUsuario);

        return CategoriaConverter.listToDomain(categoriaEntityList);
    }
}
