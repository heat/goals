package domain.converters;


import domain.models.objetivo.Meta;
import infrastructure.entities.MetaEntity;

public abstract class MetaConverter {

    public static MetaEntity domainToEntity(Meta domain){
        MetaEntity entity = new MetaEntity();

        entity.id_usuario = domain.getId_usuario();
        //entity.id_categoria = domain.getCategoria().getId();
        entity.nome = domain.getNome();
        entity.descricao = domain.getDescricao();
        entity.dta_fim = domain.getDataFim();
        entity.dta_inicio = domain.getDataInicio();

        return entity;
    }
}
