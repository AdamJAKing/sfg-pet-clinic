package dev.adamking.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    public Set<T> findAll();

    public T findById(ID id);

    public T save(T t);

    public void delete(T object);

    public void deleteById(ID id);
}
