package domain.models.objetivo;

import domain.models.Categoria;

import java.time.LocalDate;
import java.util.List;

public class Meta {

    private String nome;
    private Integer id_usuario;
    private String descricao;
    private Categoria categoria;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<SubMeta> submetas;

    /*public Meta(String nome) {
        this.nome = nome;
    }*/

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

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void novaSubMeta(){

    }
}
