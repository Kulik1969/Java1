package lesson2;

public class Task3 {
    public static void main(String[] args) {

        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < task3.length; i++) {
            if (task3[i] < 6) task3[i] *= 2;
            System.out.print(task3[i] + " ");
        }
    }
}