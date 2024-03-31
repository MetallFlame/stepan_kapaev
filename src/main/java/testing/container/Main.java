package testing.container;

public class Main {
    public static void main(String[] args) {
        Cat kotik = new Cat("Vasya", 5);
        Phone nokia1 = new Phone(6486766, "t254");
        Container<Cat> container1 = new Container<>(kotik);
        Container<Phone> container2 = new Container<>(nokia1);
        container2.getSmth();
    }
}
