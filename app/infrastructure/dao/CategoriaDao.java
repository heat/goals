package infrastructure.dao;

import domain.models.Categoria;
import domain.repository.CategoriaRepository;
import infrastructure.entities.CategoriaEntity;
import infrastructure.repository.CategoriaEntityRepository;
import play.db.jpa.JPA;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoriaDao implements CategoriaEntityRepository{

    @Override
    public CategoriaEntity insert(CategoriaEntity categoria) {
        return null;
    }

    @Override
    public List<CategoriaEntity> listByUsuario(Integer idUsuario) {
        EntityManager em = JPA.em();
        List<CategoriaEntity> categoriaEntityList = em.createNamedQuery("Categoria.listByUsuario", CategoriaEntity.class).getResultList();

        return categoriaEntityList;

    }
}
