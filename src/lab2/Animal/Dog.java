package lab2.Animal;

public class Dog extends Animal {
    private String breed;
    private String typeFeed;
    private boolean abilityFly;
    public Dog(String name, int age, String sound, String breed, String typeFeed, boolean abilityFly) {
        super(name, age, sound);
        this.breed = breed;
        this.typeFeed = typeFeed;
        this.abilityFly = abilityFly;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setTypeFeed(String typeFeed) {
        this.typeFeed = typeFeed;
    }

    public String getTypeFeed() {
        return typeFeed;
    }

    public void setAbilityFly(boolean abilityFly) {
        this.abilityFly = abilityFly;
    }

    public boolean isAbilityFly() {
        return abilityFly;
    }
}
