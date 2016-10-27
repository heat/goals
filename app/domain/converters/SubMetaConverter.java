package domain.converters;

import domain.models.objetivo.SubMeta;
import infrastructure.entities.SubMetaEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class SubMetaConverter {

    public static SubMetaEntity domainToEntity(SubMeta domain){
        SubMetaEntity entity = new SubMetaEntity();

        entity.descricao = domain.getDescricao();
        entity.id_meta = domain.getId();

        return entity;
    }

    public static List<SubMeta> listToDomain(List<SubMetaEntity> subMetaEntityList) {
        List<SubMeta> subMetas = new ArrayList<>();

        for(SubMetaEntity subMetaEntity : subMetaEntityList) {
            SubMeta subMeta = new SubMeta(subMetaEntity.id_submeta,subMetaEntity.descricao);
            subMetas.add(subMeta);
        }
        return subMetas;
    }
}
