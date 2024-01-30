package module5;

public class Task11 {
    public static void main(String[] args) {
        String name = "ababab";

        boolean isRight = mumbaUmba(name);
        System.out.println(isRight);
    }

    private static boolean mumbaUmba(String name) {
        char[] nameArr = name.toCharArray();
        int sum = 0;
        boolean isRight = false;

        for (int i = 0; i < nameArr.length; i++){
            if ((nameArr[i] == 'a')|(nameArr[i] == 'b')|(nameArr[i] == 'c')){
                sum++;
            }
        }
        if (sum == nameArr.length){
            String name1 = "00" + name + "00";
            String[] nameName1 = name1.split("abcabcabc");
            if (nameName1.length == 1){
                String[] nameName2 = name1.split("bb");
                if (nameName2.length == 1){}
                String[] nameName3 = name1.split("aaa");
                String[] nameName4 = name1.split("ccc");
                if (nameName3.length + nameName4.length == 2){
                    String[] nameName5 = name1.split("acbacbacb");
                    String[] nameName6 = name1.split("cbacbacba");
                    String[] nameName7 = name1.split("bcabcabca");
                    String[] nameName8 = name1.split("bacbacbac");
                    String[] nameName9 = name1.split("cabcabcab");
                    if (nameName5.length + nameName6.length + nameName7.length + nameName8.length + nameName9.length == 5){
                        String[] nameName10 = name1.split("ababab");
                        String[] nameName11 = name1.split("bababa");
                        String[] nameName12 = name1.split("acacac");
                        String[] nameName13 = name1.split("cacaca");
                        String[] nameName14 = name1.split("bcbcbc");
                        String[] nameName15 = name1.split("cbcbcb");
                        isRight = nameName10.length + nameName11.length + nameName12.length + nameName13.length + nameName14.length + nameName15.length == 6;
                    }
                }
            }
        }
        return isRight;
    }
}
