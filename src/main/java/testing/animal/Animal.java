package testing.animal;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.age = age;
        this.name = name;
    }

    public abstract void saySomething();
}
