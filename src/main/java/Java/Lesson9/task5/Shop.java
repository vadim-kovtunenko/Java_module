package Java.Lesson9.task5;

import Java.Lesson9.task4.Product;
import Java.Lesson9.task4.ProductComparatorByPrice;
import Java.Lesson9.task4.ProductNotExistsException;
import Java.Lesson9.task4.ShopProduct;

import java.util.*;

public class Shop {

    private final Map<Integer, ShopProduct> products;

    public Shop() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        ShopProduct currentProduct = products.get(product.getId());
        if (currentProduct == null) {
            ShopProduct newProduct = new ShopProduct(product);
            products.put(product.getId(), newProduct);
        } else {
            currentProduct.incrementCount();
        }
    }

    public void removeProduct(int id) {
        ShopProduct removedProduct = products.remove(id);
        if (removedProduct == null) {
            throw new ProductNotExistsException("Product with id=" + id + " not presented in shop!");
        }
    }

    public boolean productExists(String name) {
        for (ShopProduct shopProduct : products.values()) {
            if (shopProduct.getProduct().getName().equalsIgnoreCase(name)) {
                System.out.println("Found product with name " + name + " in shop products");
                return true;
            }
        }
        return false;
    }

    public void showProducts() {
        Collection<ShopProduct> productList = products.values();
        for (ShopProduct shopProduct : productList) {
            System.out.println(shopProduct.getProduct());
        }
    }

    public void removeAll() {
        products.clear();
    }

    public void showAllOrderByPrice() {
        List<ShopProduct> shopProducts = new ArrayList<>(products.values());

        // comparator - сравнивает продукты по цене
        Comparator<Product> comparator = new ProductComparatorByPrice();
        // используемый TreeSet чтобы продукты автоматически сортировались при добавлении в sortedProducts,
        // для этого используемый comparator
        Set<Product> sortedProducts = new TreeSet<>(comparator);

        for (ShopProduct shopProduct : shopProducts) {
            sortedProducts.add(shopProduct.getProduct());
        }

        for (Product product : sortedProducts) {
            System.out.println(product);
        }
    }

    public void buyProduct(String name) {
        for (ShopProduct shopProduct : products.values()) {
            if (shopProduct.getProduct().getName().equalsIgnoreCase(name)) {
                int currentProductCount = shopProduct.decrementCount();
                if (currentProductCount <= 0) {
                    products.remove(shopProduct.getProduct().getId());
                }
                break;
            }
        }
    }
}
