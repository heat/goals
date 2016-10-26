package domain.repository;

import domain.models.objetivo.Meta;
import domain.models.objetivo.SubMeta;

public interface MetaRepository {

    void insert(Meta meta);

    void insertSubMeta(SubMeta submeta);
}
