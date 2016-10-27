package domain.models.objetivo;

import com.fasterxml.jackson.annotation.JsonFormat;
import domain.models.Categoria;

import java.time.LocalDate;
import java.util.List;


public class Meta {

    private Integer idMeta;
    private Integer idUsuario;
    private String nome;
    private String descricao;
    private Categoria categoria;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataInicio;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFim;
    private List<SubMeta> submetas;

    public Meta() {}

    public Meta(String nome) {
        this.nome = nome;
    }

    public Integer getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(Integer idMeta) {
        this.idMeta = idMeta;
    }

    public Integer getId_usuario() {
        return idUsuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.idUsuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public List<SubMeta> getSubmetas() {
        return submetas;
    }

    public void setSubmetas(List<SubMeta> submetas) {
        this.submetas = submetas;
    }

    public void novaSubMeta(){

    }
}
