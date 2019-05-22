package sonia.ac.za.repository;

public interface RepositoryInt<T, ID> {
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
