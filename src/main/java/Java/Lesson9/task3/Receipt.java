package Java.Lesson9.task3;

public class Receipt {

    private static int RECEIPT_COUNTER = 1;

    private final int receiptId; // номер рецепта в книге
    private String ingredients; // набор ингридиентов
    private String authorName; // имя автора рецепта


    public Receipt(String ingredients, String authorName) {
        this.receiptId = RECEIPT_COUNTER++;
        this.ingredients = ingredients;
        this.authorName = authorName;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "ingredients='" + ingredients + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
