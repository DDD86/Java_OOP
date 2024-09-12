public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age, "мяу");
    }

    public void scratch() {
        System.out.println(getName() + " царапается.");
    }

// Другие методы и свойства, специфичные для кошек
}
