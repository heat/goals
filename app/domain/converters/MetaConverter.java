package domain.converters;


import domain.models.Categoria;
import domain.models.objetivo.Meta;
import infrastructure.entities.MetaEntity;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Meta> listToDomain(List<MetaEntity> metaEntityList) {
        List<Meta> metas = new ArrayList<Meta>();

        for(MetaEntity metaEntity : metaEntityList) {
            Meta meta = new Meta();
            meta.setIdMeta(metaEntity.id_meta);
            meta.setId_usuario(metaEntity.id_usuario);
            meta.setNome(metaEntity.nome);
            meta.setDescricao(metaEntity.descricao);
            meta.setDataInicio(metaEntity.dta_inicio);
            meta.setDataFim(metaEntity.dta_fim);
            meta.setCategoria(new Categoria(metaEntity.categoria.id_categoria, metaEntity.categoria.nome));
            meta.setSubmetas(SubMetaConverter.listToDomain(metaEntity.submetas));

            metas.add(meta);
        }
        return metas;
    }
}
