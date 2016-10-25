package infrastructure.entities;

import javax.persistence.*;

@Entity
@Table(name = "metas")
public class MetaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_meta;
    public String nome;
    public Integer id_usuario;
}
