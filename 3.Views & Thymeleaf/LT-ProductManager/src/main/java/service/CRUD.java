package service;


import model.Category;
import model.Product;

import java.util.List;

public interface CRUD<E> {
    List<E> findAll();

    void save(E e);

    E findById(int id);

    void update(int id, E e);

    void remove(int id);
}
