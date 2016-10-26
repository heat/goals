package domain.services;

import com.google.inject.Inject;
import domain.converters.MetaConverter;
import domain.models.objetivo.Meta;
import domain.repository.MetaRepository;
import infrastructure.entities.MetaEntity;
import infrastructure.repository.MetaEntityRepository;

public class MetaService implements MetaRepository {

    @Inject
    MetaEntityRepository metaEntityRepository;

    @Override
    public void insert(Meta meta) {
        MetaEntity entity = MetaConverter.domainToEntity(meta);
        metaEntityRepository.insert(entity);
    }
}
