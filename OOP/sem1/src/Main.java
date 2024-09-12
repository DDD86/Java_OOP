public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    // Создаем объекты различных животных
    Dog dog = new Dog("Бобик", 3);
    Cat cat = new Cat("Мурка", 5);

// Вызываем общие методы
dog.makeSound(); // Бобик производит звук: гав
cat.makeSound(); // Мурка производит звук: мяу

// Вызываем специфичные методы
dog.wagTail(); // Бобик виляет хвостом
cat.scratch(); // Мурка царапается

// Общие методы также доступны
dog.eat(); // Бобик ест
cat.eat(); // Мурка ест
        System.out.println(dog.getName());
    }
}