package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class RestauranteRepositoryImpl implements RestauranteRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Restaurante> listar() {
        return manager.createQuery("from Restaurante", Restaurante.class).getResultList();
    }

    @Override
    public Restaurante buscar(Long id) {
        return manager.find(Restaurante.class, id);
    }

    @Override
    public Restaurante salvar(Restaurante restaurante) {
        return manager.merge(restaurante);
    }

    @Override
    public void remover(Restaurante restaurante) {
        restaurante = buscar(restaurante.getId());
        manager.remove(restaurante);
    }
}
