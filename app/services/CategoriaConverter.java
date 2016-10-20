package services;

import com.google.inject.Singleton;
import domain.models.AggregateCategoria;
import domain.models.Categoria;
import infrastructure.entities.CategoriaEntity;
import validations.GoalsException;

import java.util.ArrayList;
import java.util.List;

public class CategoriaConverter {

    public static List<Categoria> listToDomain(List<CategoriaEntity> categoriaEntityList){

        List<Categoria> categorias = new ArrayList<Categoria>();
        AggregateCategoria aggregateCategoria = new AggregateCategoria();

        categoriaEntityList.forEach(categoria -> {

            aggregateCategoria.addCategoria(categoria.nome);

        });

        System.out.println("TAMANHO: " + aggregateCategoria.getCategorias().size());

        return aggregateCategoria.getCategorias();

    }
}
