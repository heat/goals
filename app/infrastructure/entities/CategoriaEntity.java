package infrastructure.entities;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
@NamedQueries(
        @NamedQuery(name = "Categoria.listByUsuario", query = "SELECT c FROM CategoriaEntity c WHERE id_usuario = :idUsuario ")
)
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_categoria;
    public Integer id_usuario;
    public String nome;

}
