package infrastructure.repository;

import domain.models.objetivo.Meta;
import infrastructure.entities.MetaEntity;

public interface MetaEntityRepository {

    void insert(MetaEntity meta);
}
