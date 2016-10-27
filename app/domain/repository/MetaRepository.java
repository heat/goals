package domain.repository;

import domain.models.objetivo.Meta;
import domain.models.objetivo.SubMeta;

import java.util.List;

public interface MetaRepository {

    void insert(Meta meta);

    void insertSubMeta(SubMeta submeta);

    List<Meta> listByUsuario(Integer idUsuario);
}
