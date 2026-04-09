class Person {
    String name;
    int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to print person details
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to check if person is adult
    boolean isAdult() {
        return age >= 18;
    }

    // Method to have birthday
    void haveBirthday() {
        age = age + 1;
        System.out.println("Happy Birthday! " + name + " is now " + age);
    }
}
Person person1 = new Person("Alice", 25);
person1.isAdult()
person1.printDetails()
person1.haveBirthday()