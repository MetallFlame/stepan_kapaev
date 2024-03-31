package testing.phone;

public class Main {
    public static void main(String[] args) {
        Phone iPhone1 = new Phone(87, 150, "i15pro");
        Phone iPhone2 = new Phone(4756, 124, "s20");
        Phone iPhone3 = new Phone(73669, 96, "t20");
        try {
            System.out.println(iPhone1.getNumber());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(iPhone2.getHeight());
        System.out.println(iPhone3.getModel());
        iPhone1.recieveCall("John", 93656376);
        iPhone1.sendMessage(87677, 3846, 9374666, 57789);
    }
}
