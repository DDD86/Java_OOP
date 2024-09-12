public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age, "гав");
    }

    public void wagTail() {
        System.out.println(getName() + " виляет хвостом.");
    }

// Другие методы и свойства, специфичные для собак
}
