package infrastructure.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "metas")
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

}
