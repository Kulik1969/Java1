package lesson2;

public class Task4 {
    public static void main(String[] args) {

        int[][] task4 = new int[5][5];
        for (int i = 0; i < task4.length; i++) {
            for (int j = 0, j2 = task4[i].length; j < task4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) task4[i][j] = 1;
                System.out.print(task4[i][j] + " ");
            }
            System.out.print("\r\n");
        }

    }
}
