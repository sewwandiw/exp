package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/29/13
 * 11:10 PM
 */

public class TestString {
    public static String s = "0";

    public static void main(String[] args) {

        for (int i = 0; i <10; i++) {
            s = s +""+ i;
        }
        System.out.print(s+"\n");

        StringBuilder sb = new StringBuilder("Spring");

        sb = sb.delete(3,6).insert(2,"umme").deleteCharAt(1);
        String string = String.valueOf(sb);
        String string2 = string.toUpperCase();
        String string3 = string.toLowerCase();

        System.out.println(string2);

        int [][] array = {{1,2,3},{1,2,3}};

        for (int i = 0; i < 2; i++) {
            System.out.println("\n");
            for (int j = 0; j < 3; j++) {
                if (i  == 1){
                System.out.print(array[i][j]);
                }
                else {
                    System.out.print(array[i][j]);

                }

            }


        }

    }





}
