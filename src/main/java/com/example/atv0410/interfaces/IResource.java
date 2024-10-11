package com.example.atv0410.interfaces;
import java.util.List;

public interface IResource<T, N> {
    public T create(T entity);
    public T get(N id);
    public List<T> get ();
    public T update(N id, T entity);
    public void delete(N id);
}
