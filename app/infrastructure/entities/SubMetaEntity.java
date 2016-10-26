package infrastructure.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "submetas")
public class SubMetaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_submeta;
    public Integer id_meta;
    public String descricao;
    public LocalDateTime dh_criacao;
    public LocalDateTime dh_atualizado_em;

}
