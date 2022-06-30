package Java.Lesson9.task6;

import Java.Lesson9.task4.Product;
import Java.Lesson9.task4.ShopProduct;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<ShopProduct> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        ShopProduct currentProduct = null;
        for (ShopProduct shopProduct : products) {
            if (shopProduct.getProduct().equals(product)) {
                currentProduct = shopProduct;
            }
        }
        if (currentProduct == null) {
            ShopProduct newProduct = new ShopProduct(product);
            products.add(newProduct);
        } else {
            currentProduct.incrementCount();
        }
    }

    public void removeProductByName(String productName) {
        // removeIf - удаляет объект из коллекции если выполняется условие в предикате
        // в данном случае условие предиката - совпадение имен продуктов
        products.removeIf(shopProduct -> shopProduct.getProduct().getName().equalsIgnoreCase(productName));
    }

    public double buyProducts() {
        double totalPrice = 0;
        for (ShopProduct product : products) {
            totalPrice += product.getProduct().getPrice() * product.getCount();
        }
        products.clear();
        return totalPrice;
    }
}