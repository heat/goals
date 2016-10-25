package domain.services;

import com.google.inject.Inject;
import domain.models.objetivo.Meta;
import domain.repository.MetaRepository;
import infrastructure.repository.MetaEntityRepository;

public class MetaService implements MetaRepository {

    @Inject
    MetaEntityRepository metaEntityRepository;

    @Override
    public void insert(Meta meta) {
        metaEntityRepository.insert(meta);
    }
}
