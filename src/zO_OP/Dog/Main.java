package zO_OP.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Dog implements Comparable<Dog> {
    private int id;
    private String name;
    private String breed;
    private int bark_Count = 0;

    private static List<Dog> list = new ArrayList<>();
    private static int count = 1;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.id = count++;
        list.add(this);
    }

    public int getBark_Count() {
        return bark_Count;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void bark(){
        bark_Count++;
        System.out.println("Barked: " + bark_Count);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Dog Id: " + id + " Dog Name: " + name + ", Breed: " + breed);
    }

    @Override
    public int compareTo(Dog other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    public static Dog find_By_Id(int other_id) {
        for (Dog dog : list) {
            if (dog.getId() == other_id) {
                return dog;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Create Dog instances
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");
        Dog dog3 = new Dog("Bella", "Labrador");

        // Display initial dog details
        System.out.println("Initial Dog Details:");
        dog1.displayInfo();
        dog2.displayInfo();
        dog3.displayInfo();

        // Update some dog details
        dog1.setName("Charlie");
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        System.out.println("\nUpdated Dog Details:");
        dog1.displayInfo();
        dog2.displayInfo();
        dog3.displayInfo();

        // Sort dogs by name
        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        Collections.sort(dogs);

        System.out.println("\nAfter Sorting by Name:");
        for (Dog d : dogs) {
            d.displayInfo();
        }

        // Find a dog by ID
        int other_id = 3;
        Dog foundDog = Dog.find_By_Id(other_id);
        System.out.println("\nSearching for Dog with ID " + other_id + ":");
        if (foundDog != null) {
            foundDog.displayInfo();
        } else {
            System.out.println("Dog not found.");
        }

        dog1.bark();
        dog2.bark();
        dog1.bark();
        dog3.bark();
    }
}

