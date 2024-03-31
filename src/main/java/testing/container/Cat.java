package testing.container;

import testing.animal.Animal;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void saySomething() {
        System.out.println("I am cat " + name + ".I am " + age);
    }
}
