package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"coca","nước nắm",23));
        products.put(2,new Product(2,"number one","nước lọc",56));
        products.put(3,new Product(3,"Hảo hảo","nước ngọt",43));
        products.put(4,new Product(4,"Nước suối","nước tắm",33));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> list = new ArrayList<>();
        List<Product> list1 = new ArrayList<>(products.values());
        for(Product p : list1){
            if(p.getName().toLowerCase().contains(name)){
                list.add(p);
            }
        }
        return list;
    }
}
