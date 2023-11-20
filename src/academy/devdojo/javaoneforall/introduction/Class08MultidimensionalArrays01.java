package academy.devdojo.javaoneforall.introduction;

public class Class08MultidimensionalArrays01 {

    public static void main(String[] args) {

//        int[][] numbers = new int[3][3];
//        numbers[0][0] = 0;
//        numbers[0][1] = 1;
//        numbers[0][2] = 2;
//        numbers[1][0] = 10;
//        numbers[1][1] = 11;
//        numbers[1][2] = 12;
//        numbers[2][0] = 20;
//        numbers[2][1] = 21;
//        numbers[2][2] = 22;

        int[][] numbers = {{0, 1, 2},{10, 11, 12},{20, 21, 22}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }

//        for (int[] baseArray : numbers) {
//            for (int number : baseArray) {
//                System.out.println(number);
//            }
//        }


    }

}
