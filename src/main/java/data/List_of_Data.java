package data;

import java.util.List;

public class List_of_Data {
    /*Keep in mind that List.of() creates an immutable list,
    so you won't be able to add or remove items from these specific instances later
    --perfect for fixed datasets!
    */
    public static List<Integer> immutableNumberList() {
         return List.of(
                12, 45, 7, 89, 23, 56, 3, 91, 34, 67,
                15, 82, 4, 39, 50, 28, 73, 11, 99, 6,
                21, 54, 8, 42, 63, 17, 33, 76, 5, 100
        );
    }

    public static List<String> immutableNamesList() {
        return List.of(
                "James", "Mary", "Robert", "Patricia", "John",
                "Jennifer", "Michael", "Linda", "William", "Elizabeth",
                "David", "Barbara", "Richard", "Susan", "Joseph",
                "Jessica", "Thomas", "Sarah", "Charles", "Karen",
                "Christopher", "Lisa", "Daniel", "Nancy", "Matthew",
                "Betty", "Anthony", "Sandra", "Mark", "Ashley"
        );
    }

    public static List<String> immutableStringList() {
        return List.of(
                "Apple", "Laptop", "Mountain", "Coffee", "Guitar",
                "Bicycle", "Ocean", "Passport", "Notebook", "Camera",
                "Skyscraper", "Forest", "Headphones", "Telescope", "Compass",
                "Backpack", "River", "Keyboard", "Diamond", "Umbrella",
                "Bridge", "Satellite", "Cactus", "Violin", "Submarine",
                "Volcano", "Lantern", "Microscope", "Hammer", "Spaceship"
        );
    }

}
