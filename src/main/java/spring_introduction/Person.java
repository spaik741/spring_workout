package spring_introduction;

public class Person {
    private Pet pet;

    public Person() {
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void sayHello(){
        System.out.println("Hello,my pet!");
        pet.say();
    }
}
