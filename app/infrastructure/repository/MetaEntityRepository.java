package infrastructure.repository;

import domain.models.objetivo.Meta;
import infrastructure.entities.MetaEntity;
import infrastructure.entities.SubMetaEntity;

public interface MetaEntityRepository {

    void insert(MetaEntity meta);

    void insertSubMeta(SubMetaEntity entity);
}
