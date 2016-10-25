package infrastructure.adapters;


import domain.models.objetivo.Meta;
import infrastructure.entities.MetaEntity;

public abstract class MetaDbAdapter {

    public static MetaEntity domainToEntity(Meta domain){
        MetaEntity entity = new MetaEntity();

        entity.nome = domain.getNome();
        entity.id_usuario = domain.getId_usuario();

        return entity;
    }
}
