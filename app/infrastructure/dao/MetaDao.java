package infrastructure.dao;

import infrastructure.entities.MetaEntity;
import infrastructure.entities.SubMetaEntity;
import infrastructure.repository.MetaEntityRepository;
import play.db.jpa.JPA;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;

public class MetaDao implements MetaEntityRepository{

    @Override
    public void insert(MetaEntity entity) {

        entity.dh_criacao = LocalDateTime.now();
        entity.dh_atualizado_em = LocalDateTime.now();
        EntityManager em = JPA.em();
        em.persist(entity);
    }

    @Override
    public void insertSubMeta(SubMetaEntity entity) {
        entity.dh_criacao = LocalDateTime.now();
        entity.dh_atualizado_em = LocalDateTime.now();
        EntityManager em = JPA.em();
        em.persist(entity);
    }
}
