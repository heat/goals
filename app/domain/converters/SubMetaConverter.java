package domain.converters;


import domain.models.objetivo.Meta;
import domain.models.objetivo.SubMeta;
import infrastructure.entities.MetaEntity;
import infrastructure.entities.SubMetaEntity;

public abstract class SubMetaConverter {

    public static SubMetaEntity domainToEntity(SubMeta domain){
        SubMetaEntity entity = new SubMetaEntity();

        entity.descricao = domain.getDescricao();
        entity.id_meta = domain.getId();

        return entity;
    }
}
