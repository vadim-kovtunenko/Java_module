package Java.Lesson5.Task2;

public class Human {

    private String name;
    private String hairColor;
    private Pet[] pets;

    public Human(String name, String hairColor) {
        this.name = name;
        this.hairColor = hairColor;
        this.pets = new Pet[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void displayPets() {
        for (Pet pet : this.pets) {
            if (pet != null) {
                System.out.println(pet.getName());
            }
        }
    }

    public void addPet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = pet;
                return;
            }
        }
    }

    public void deletePets() {
        pets = new Pet[10];
    }

    public static void main(String[] args) {
        Human human = new Human("Hue", "Red");
        Pet cat = new Pet("Jackson", 3);
        Pet dog = new Pet("Betty", 5);
        human.addPet(cat);
        human.addPet(dog);
        human.displayPets();
        human.deletePets();
        human.displayPets();
    }
}