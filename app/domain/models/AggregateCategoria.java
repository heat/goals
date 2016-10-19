package domain.models;

import validations.GoalsException;

import java.util.List;

public class AggregateCategoria {

    private List<Categoria> categorias;

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void addCategoria(String nome) {

        Categoria categoria = new Categoria(nome);

        if (hasCategoria(categoria)) {

        }

        this.categorias.add(categoria);
    }

    public boolean hasCategoria(Categoria categoria){
        return this.categorias.contains(categoria);
    }
}


