package fr.sparkit.socle.java.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.sparkit.socle.java.service.IGenericService;

public class GenericService<T, ID extends Serializable> implements IGenericService<T, ID> {

    @Autowired
    private JpaRepository<T, ID> jpaRepository;

    public GenericService() {
	super();
    }

    @Override
    public List<T> findAll() {
	return jpaRepository.findAll();
    }

    @Override
    public List<T> findAll(Sort sort) {
	return jpaRepository.findAll(sort);
    }

    @Override
    public List<T> findAll(Iterable<ID> ids) {
	return jpaRepository.findAll(ids);
    }

    @Override
    public <S extends T> List<S> save(Iterable<S> entities) {
	return jpaRepository.save(entities);
    }

    @Override
    public void flush() {
	jpaRepository.flush();

    }

    @Override
    public <S extends T> S saveAndFlush(S entity) {
	return jpaRepository.saveAndFlush(entity);
    }

    @Override
    public void deleteInBatch(Iterable<T> entities) {
	jpaRepository.deleteInBatch(entities);

    }

    @Override
    public void deleteAllInBatch() {
	jpaRepository.deleteAllInBatch();

    }

    @Override
    public T getOne(ID id) {
	return jpaRepository.getOne(id);
    }

}
