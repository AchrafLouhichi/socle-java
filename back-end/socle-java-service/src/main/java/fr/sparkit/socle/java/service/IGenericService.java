package fr.sparkit.socle.java.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Sort;

public interface IGenericService<T, ID extends Serializable> {

    List<T> findAll();

    List<T> findAll(Sort sort);

    List<T> findAll(Iterable<ID> ids);

    <S extends T> List<S> save(Iterable<S> entities);

    void flush();

    <S extends T> S saveAndFlush(S entity);

    void deleteInBatch(Iterable<T> entities);

    void deleteAllInBatch();

    T getOne(ID id);

}
