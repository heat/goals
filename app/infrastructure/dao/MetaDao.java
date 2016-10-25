package infrastructure.dao;

import domain.models.objetivo.Meta;
import infrastructure.adapters.MetaDbAdapter;
import infrastructure.entities.MetaEntity;
import infrastructure.repository.MetaEntityRepository;
import play.db.jpa.JPA;

import javax.persistence.EntityManager;

public class MetaDao implements MetaEntityRepository{

    @Override
    public void insert(Meta meta) {
        MetaEntity entity = MetaDbAdapter.domainToEntity(meta);
        EntityManager em = JPA.em();
        em.persist(entity);
    }
}
