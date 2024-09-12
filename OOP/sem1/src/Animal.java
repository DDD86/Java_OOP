public class Animal {
    private String name;
    private int age;
    private String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " производит звук: " + sound);
    }

    public void eat() {
        System.out.println(name + " ест.");
    }

// Другие методы и свойства, общие для всех животных
public String getName() {
    return name;
}

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


}
