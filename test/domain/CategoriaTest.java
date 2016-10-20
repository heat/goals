package domain;

import domain.models.AggregateCategoria;
import domain.models.Categoria;
import org.junit.Assert;
import org.junit.Test;

public class CategoriaTest {

    @Test
    public void hasCategoriaTest(){

        AggregateCategoria aggregateCategoria = new AggregateCategoria();

        Categoria c1 = new Categoria(0, "Saude");
        Categoria c2 = new Categoria(1, "SAUDE");

        aggregateCategoria.addCategoria(c1.getId(), c1.getNome());

        Assert.assertFalse("O resultado tem que ser falso", aggregateCategoria.hasCategoria(c2));
    }
}
