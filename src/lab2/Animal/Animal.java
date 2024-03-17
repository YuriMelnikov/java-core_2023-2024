package lab2.Animal;

public class Animal {
    private String name;
    private int age;
    private String sound;

    public Animal (String name, int age, String sound){
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public String getSound() {
        return sound;
    }
}
