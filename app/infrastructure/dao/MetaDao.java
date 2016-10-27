package infrastructure.dao;

import infrastructure.entities.MetaEntity;
import infrastructure.entities.SubMetaEntity;
import infrastructure.repository.MetaEntityRepository;
import play.db.jpa.JPA;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;

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

    @Override
    public List<MetaEntity> listByUsuario(Integer idUsuario) {
        EntityManager em = JPA.em();
        List<MetaEntity> metaEntityList = em.createNamedQuery("Meta.listByUsuario", MetaEntity.class)
                .setParameter("idUsuario", idUsuario)
                .getResultList();
        return metaEntityList;
    }


}
