package ru.netology.repository;

import ru.netology.domain.Product;

import java.util.Arrays;

public class ProductRepository {
    private Product[] products = new Product[0];

    public void setProducts(Product[] products) {
        this.products = products;
    }
//    public Product[] getProducts() {
//        return products;
//    }

    public void save(Product item) {
        int length = products.length + 1;
        Product[] tmp = new Product[length];
        //Копируем из продуктов в тмп
        System.arraycopy(products, 0, tmp, 0, products.length);
        //Подставляем итем в последний элемент массива
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        products = tmp;
    }

    public Product[] getAll(){
        return products;
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "products=" + Arrays.toString(products) +
                '}';
    }

    public void removeById(int id){
            int length = products.length - 1;
            Product[] restProducts = new Product[length];
            int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                restProducts[index] = product;
                index++;
            }
        }
            products = restProducts;
    }
}
