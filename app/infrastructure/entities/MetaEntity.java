package infrastructure.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "metas")
@NamedQueries(
        @NamedQuery(name = "Meta.listByUsuario", query = "SELECT m FROM MetaEntity m WHERE id_usuario = :idUsuario ")
)
public class MetaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_meta;
    public Integer id_usuario;
    public Integer id_categoria;
    public String nome;
    public String descricao;
    public LocalDate dta_inicio;
    public LocalDate dta_fim;
    public LocalDateTime dh_criacao;
    public LocalDateTime dh_atualizado_em;
    @OneToOne
    @JoinColumn(name="id_categoria", referencedColumnName="id_categoria", insertable = false, updatable = false)
    public CategoriaEntity categoria;
    @OneToMany
    @JoinColumn(name="id_meta", referencedColumnName="id_meta", insertable = false, updatable = false)
    public List<SubMetaEntity> submetas;
}
