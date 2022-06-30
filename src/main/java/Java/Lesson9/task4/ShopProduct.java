package Java.Lesson9.task4;

public class ShopProduct {

    private final Product product;
    private int count;

    public ShopProduct(Product product) {
        this.product = product;
        this.count = 1;
    }

    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }

    public int incrementCount() {
        return ++count;
    }

    public int decrementCount() {
        return --count;
    }
}
