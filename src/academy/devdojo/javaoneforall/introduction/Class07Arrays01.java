package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays01 {

    public static void main(String[] args) {
//    byte, short, double, float, long, int = 0
//    char '\u0000' ' '
//    boolean false
//    String null

//        int[] ages = new int[3];
//        ages[0] = 15;
//        ages[1] = 20;
//        ages[2] = 25;

        int [] ages = {15, 20, 25};

//        int [] ages = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        for(int num : ages){
            System.out.println(num);
        }
    }
}
