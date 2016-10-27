package domain.services;

import com.google.inject.Inject;
import domain.converters.MetaConverter;
import domain.models.objetivo.Meta;
import domain.models.objetivo.SubMeta;
import domain.repository.MetaRepository;
import infrastructure.entities.MetaEntity;
import infrastructure.entities.SubMetaEntity;
import infrastructure.repository.MetaEntityRepository;

import java.util.List;

import static domain.converters.MetaConverter.domainToEntity;
import static domain.converters.SubMetaConverter.domainToEntity;

public class MetaService implements MetaRepository {

    @Inject
    MetaEntityRepository metaEntityRepository;

    @Override
    public void insert(Meta meta) {
        MetaEntity entity = domainToEntity(meta);
        metaEntityRepository.insert(entity);
    }

    @Override
    public void insertSubMeta(SubMeta submeta) {

        SubMetaEntity entity = domainToEntity(submeta);
        metaEntityRepository.insertSubMeta(entity);

    }

    @Override
    public List<Meta> listByUsuario(Integer idUsuario) {
        List<MetaEntity> metaEntityList = metaEntityRepository.listByUsuario(idUsuario);
        return MetaConverter.listToDomain(metaEntityList);
    }
}
