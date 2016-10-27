package domain.models;

import com.google.inject.Inject;
import domain.models.objetivo.Meta;
import domain.repository.CategoriaRepository;
import domain.services.CategoriaService;
import validations.GoalsException;

import java.util.List;

public class Usuario {

    private String nome;
    private List<Categoria> categorias;
    private List<Meta> metas;

    @Inject
    CategoriaRepository categoriaRepository;

    public Usuario(String nome) {
        this.nome = nome;
        this.categorias = CategoriaService.loadDefaultCategorias();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Meta> getMetas() {
        return metas;
    }

    public void setMetas(List<Meta> metas) {
        this.metas = metas;
    }

    public void novaCategoria(String nome) throws GoalsException{

        Categoria categoria = Categoria.of(nome);

        if (!hasCategoria(categoria)){
            Categoria c = categoriaRepository.insert(categoria);
            this.categorias.add(c);
        }

    }

    public boolean hasCategoria(Categoria categoria){
        return this.categorias.contains(categoria);
    }

    public boolean isValid(){

        if (this.nome == null || categorias.size() == 0){
            return false;
        }

        return true;
    }
}
