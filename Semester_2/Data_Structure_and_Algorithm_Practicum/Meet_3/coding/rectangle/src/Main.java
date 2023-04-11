public class Main {
    public static void main(String[] args) {
        Person[][] people = new Person[2][2];
        people[0][0] = new Person("John", 30);
        people[0][1] = new Person("Jane", 25);
        people[1][0] = new Person("Bob", 40);
        people[1][1] = new Person("Alice", 35);
        
        // Accessing an element
        System.out.println(people[0][1].name); // Output: Jane
    }
}