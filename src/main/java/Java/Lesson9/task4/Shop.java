package Java.Lesson9.task4;

import java.util.*;

public class Shop {

    private final Map<Integer, Product> products;

    public Shop() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (products.containsKey(product.getId())) {
            System.out.println("Product with such id already exists in shop. Updating product with id=" + product.getId());
        }
        products.put(product.getId(), product);
    }

    public void removeProduct(int id) {
        Product removedProduct = products.remove(id);
        if (removedProduct == null) {
            throw new ProductNotExistsException("Product with id=" + id + " not presented in shop!");
        }
    }

    public boolean productExists(String name) {
        for (Product product : products.values()) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println("Found product with name " + name + " in shop products");
                return true;
            }
        }
        return false;
    }

    public void showProducts() {
        Collection<Product> productList = products.values();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void removeAll() {
        products.clear();
    }

    public void showAllOrderByPrice() {
        List<Product> productList = new ArrayList<>(products.values());

        // comparator - компаратор, который позволяет сравнивать продукты по стоимости
        Comparator<Product> comparator = new ProductComparatorByPrice();
        productList.sort(comparator);
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
