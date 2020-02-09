package lesson2;

public class Task5 {
    public static void main(String[] args) {

        int[] task5 = {10, 1, 3, 2, 2, 4, 5, 11, 4, 8, 9, 5};
        int min = task5[0], max = task5[0], indMax = 0, indMin = 0;
        for (int i = 0; i < task5.length; i++) {
            if (task5[i] > max) {
                max = task5[i];
                indMax = i;
            }
            if (task5[i] < min) {
                min = task5[i];
                indMin = i;
            }
        }
        System.out.println("Максимальный элемент находится в массиве под индексом " + indMax + " со значением  = " + max);
        System.out.println("Минимальный элемент находится в массиве под индексом " + indMin + " со значением  = " + min);
    }
}
