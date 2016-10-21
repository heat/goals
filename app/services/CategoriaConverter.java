package services;

import domain.models.AggregateCategoria;
import domain.models.Categoria;
import infrastructure.entities.CategoriaEntity;
import validations.GoalsException;

import java.util.List;

public class CategoriaConverter {

    public static List<Categoria> listToDomain(List<CategoriaEntity> categoriaEntityList) throws GoalsException{

        AggregateCategoria aggregateCategoria = new AggregateCategoria();

        for (CategoriaEntity entity : categoriaEntityList) {
            Categoria categoria = new Categoria(entity.id_categoria, entity.nome);
            aggregateCategoria.addCategoria(categoria.getId(), categoria.getNome());
        }

        return aggregateCategoria.getCategorias();
    }
}
