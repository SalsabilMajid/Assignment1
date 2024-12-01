//Write a Java class, Flower, that has three instance variables of type String, int, and float,
// which respectively represent the name of the flower, its number of petals, and price.
// Your class must include a constructor method that initializes each variable to an appropriate value,
// and your class should include methods for setting the value of each type, and getting the value of each type.

public class Q17 {public static void main(String[] args) {

    Flower rose = new Flower("Tulip", 10, 1.5f);

    System.out.println("Name: " + rose.getName());
    System.out.println("Number of Petals: " + rose.getPetals());
    System.out.println("Price: $" + rose.getPrice());

    rose.setName("Rose");
    rose.setPetals(6);
    rose.setPrice(2.0f);


    System.out.println("\nUpdated Name: " + rose.getName());
    System.out.println("Updated Number of Petals: " + rose.getPetals());
    System.out.println("Updated Price: $" + rose.getPrice());
}
}
