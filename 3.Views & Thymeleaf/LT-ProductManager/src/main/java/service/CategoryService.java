package service;

import model.Category;



import java.util.ArrayList;
import java.util.List;


public class CategoryService implements CRUD<Category> {
    private static ArrayList<Category> categories = new ArrayList<>();
    static {
        categories.add(new Category(1,"Loai 1"));
        categories.add(new Category(2,"Loai 2"));
    }


    @Override
    public List<Category> findAll() {
        return categories;
    }


    @Override
    public void save(Category category) {
        categories.add(category);

    }

    @Override
    public Category findById(int id) {
        for (Category c: categories) {
            if (c.getId() == id) {
                return c;
            }

        }
        return null;
    }

    @Override
    public void update(int id, Category category) {
       categories.add(id,category);

    }


    @Override
    public void remove(int id) {
        categories.remove(id);

    }
}
