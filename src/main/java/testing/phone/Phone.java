package testing.phone;

public class Phone {
    private int number;
    private int height;
    private String model;

    public Phone(int number, int height, String model){
        this(number, model);
        this.height = height;
    }

    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void recieveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void recieveCall(String name, int number){
        System.out.println("Звонит " + name + ".Номер:" + number);
    }

    public void sendMessage(int... nums){
        for (int i = 0; i < nums.length; i++){
            System.out.println("Отправлено сообщение на номер " + nums[i]);
        }
    }
}
