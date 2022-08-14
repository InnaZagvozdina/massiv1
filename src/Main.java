public class Main {
    public static void main(String[] args) {

        // Задача 1

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        float[] box = {1.57f, 7.654f, 9.986f};

        int[] wood = {5, 5, 8};

        // Задание 2

        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int a = 0; a < box.length; a++) {
            System.out.print(box[a]);
            if (a != box.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int b = 0; b < wood.length; b++) {
            System.out.print(wood[b]);
            if (b != wood.length - 1) {
                System.out.print(", ");
            }
                   }
        System.out.println();
        System.out.println();

        //Задание 3

        System.out.println();

        for (int i = weight.length -1; i >= 0;  i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int a = box.length -1; a >= 0; a--) {
            System.out.print(box[a]);
            if (a != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int b = wood.length -1; b >=0; b--) {
            System.out.print(wood[b]);
            if (b != 0) {
                System.out.print(", ");
            }

        }
        // Задание 4
        System.out.println();
        System.out.println();

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] %2 == 1) {
                weight[i]++;
            }
            System.out.print(weight[i]);
            if (i != weight.length -1) {
                System.out.print(", ");
            }
        }


    }
}












