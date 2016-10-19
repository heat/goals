package infrastructure.entities;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
@NamedQueries(
        @NamedQuery(name = "Categoria.listByUsuario", query = "SELECT c FROM Categoria WHERE id_usuario = :id_usuario ")
)
public class CategoriaEntity {

    public Integer id_categoria;
    public Integer id_usuario;
    public String nome;

}
