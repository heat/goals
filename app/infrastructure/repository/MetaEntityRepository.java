package infrastructure.repository;

import infrastructure.entities.MetaEntity;
import infrastructure.entities.SubMetaEntity;

import java.util.List;

public interface MetaEntityRepository {

    void insert(MetaEntity meta);

    void insertSubMeta(SubMetaEntity entity);

    List<MetaEntity> listByUsuario(Integer idUsuario);
}
