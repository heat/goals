package domain.models.objetivo;

public class SubMeta {

    private final Integer id;
    private final String descricao;

    public SubMeta(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
