package domain.models;

public class Categoria {
    private final String nome;

    private Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categoria categoria = (Categoria) o;

        return nome.equals(categoria.nome);

    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }


    public static Categoria of(String nome) {
        return new Categoria(nome);
    }

}
