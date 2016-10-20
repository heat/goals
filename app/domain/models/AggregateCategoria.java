package domain.models;

import validations.GoalsException;

import java.util.ArrayList;
import java.util.List;

public class AggregateCategoria {

    private List<Categoria> categorias = new ArrayList<Categoria>();

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void addCategoria(Integer id, String nome) throws GoalsException{

        Categoria categoria = new Categoria(id, nome);

        if (hasCategoria(categoria)) {
            throw new GoalsException(400, "TESTE");
        }

        this.categorias.add(categoria);
    }

    public boolean hasCategoria(Categoria categoria){
        return this.categorias.contains(categoria);
    }
}


