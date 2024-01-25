package module5;

public class Task11 {
    public static void main(String[] args) {
        String name = "acbca";

        boolean isRight = mumbaUmba(name);
        System.out.println(isRight);
    }

    private static boolean mumbaUmba(String name) {
        char[] nameArr = name.toCharArray();
        int sum = 0;
        boolean isRight = false;

        for (int i = 0; i < nameArr.length; i++){
            if (nameArr[i] == ('a' | 'b' | 'c')){
                sum++;
            }
        }
        if (sum == nameArr.length){
            String name1 = "00" + name + "00";
            String[] nameName = name1.split("abab");
            if (nameName.length > 1){
                String[] name2 = name1.split("abcabc |\\ ababab |\\ bb |\\ aaa |\\ ccc |\\ acacac |\\  |\\ bababa |\\ cacaca |\\ acbacbacb |\\ bcabcabca | cbacbacba");
                isRight = name2.length > 1;
            }
        }
        return isRight;
    }
}
