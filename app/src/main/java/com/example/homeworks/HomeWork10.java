package com.example.homeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class HomeWork10 {
    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.addProduct(new Product( 12345,"Bananas", 9));
        shop.addProduct(new Product(12345, "Pineapple", 2));
        shop.addProduct(new Product(12346, "Cherry", 3));
        shop.addProduct(new Product(12345, "Mango", 5));
        shop.addProduct(new Product(12348, "Apple", 4));
        shop.addProduct(new Product(12341, "Kiwi", 11));
        shop.addProduct(new Product(12343, "Strawberry", 6));


        System.out.println("Start list:");
        shop.showProductList();
        System.out.println();

        Collections.sort(shop.productList, new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return Integer.compare(product.getPrice(), t1.getPrice());
            }
        });

        System.out.println("Sorted list by price increment:");
        shop.showProductList();
        System.out.println();

        shop.removeProduct(12343);

        System.out.println("List after deleting an element:");
        shop.showProductList();
        System.out.println();

        shop.editProduct(12346, new Product("Lemon", 8));

        System.out.println("List after editing an element:");
        shop.showProductList();
    }
}

class Product {
    private  int id;
    private  String name;
    private  int price;

    public Product( String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class Shop{
    List<Product> productList = new ArrayList<>();
    HashSet<Product> productListUnique = new LinkedHashSet<>();

    public void addProduct(Product product){
        productList.add(product);//new Product (product.getId(), product.getName(), product.getPrice())
        productListUnique.addAll(productList);
        productList.clear();
        productList.addAll(productListUnique);
    }

    public void showProductList(){
        for(Product product : productList){
            System.out.println("Product id: " + product.getId() + " Product name: " + product.getName()
            + " Product price: " + product.getPrice());
        }
    }

    public void removeProduct(int id){
        productList.remove(new Product(id));
    }

    public void editProduct(int id, Product product){
        productList.remove(new Product(id));
        productList.add(new Product (id, product.getName(), product.getPrice()));
    }
}


