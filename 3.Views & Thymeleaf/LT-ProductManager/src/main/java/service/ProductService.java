package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements CRUD<Product> {
    private static ArrayList<Product> products = new ArrayList<>();
    private static CategoryService categoryService = new CategoryService();


    static {

        products.add(new Product(1, "BMV", 100, "https://i.xeoto.com.vn/auto/toyota/camry/toyota-camry-41766.png", categoryService.findById(1), true));
        products.add(new Product(2, "Suzuki", 200, "https://i.xeoto.com.vn/auto/toyota/camry/toyota-camry-41766.png", categoryService.findById(2), true));
        products.add(new Product(3, "Toyota", 300, "https://i.xeoto.com.vn/auto/toyota/camry/toyota-camry-41766.png", categoryService.findById(1), false));
        products.add(new Product(4, "VinFast", 400, "https://i.xeoto.com.vn/auto/toyota/camry/toyota-camry-41766.png", categoryService.findById(2), true));
        products.add(new Product(5, "HuynDai", 500, "https://i.xeoto.com.vn/auto/toyota/camry/toyota-camry-41766.png", categoryService.findById(1), false));
        products.add(new Product(6, "Honda", 600, "https://i.xeoto.com.vn/auto/toyota/camry/toyota-camry-41766.png", categoryService.findById(1), true));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }


    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product p : products) {
            if (p.getIdP() == id) {
                return p;
            }

        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getIdP() == id) {
                products.set(i,product);
            }

        }

    }


    @Override
    public void remove(int id) {
        products.remove(findById(id));

    }
    public  List<Product> SearchName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product p: products) {
            if (p.getName().contains(name)) {
                productList.add(p);
            }
        }
        return productList;
    }


}
