package module5;

public class Task4 {
    public static void main(String[] args) {
        String name = "hpeu aapg";

        words(name);
    }

    private static void words(String name) {
        char[] arr1 = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
        String[] arrName = name.split(" ");
        for (int i = 0; i < arrName.length; i++) {
            boolean peremennaya = false;
            String name1 = arrName[i];
            char[] name2 = name1.toCharArray();
            for (int j = 0; j < arr1.length; j++) {
                if (name2[0] == arr1[j]) {
                    for (int n = 0; n < arr1.length; n++) {
                        peremennaya = (name2[name2.length - 1] != arr1[n]);
                    }
                }
            }
            if (peremennaya){
                System.out.println(arrName[i]);
            }
        }
    }
}
