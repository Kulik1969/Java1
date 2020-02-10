package lesson2;

public class Task1 {
    public static void main(String[] args) {
        int [] task1 = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < task1.length; i++){
            task1[i] = task1[i] == 1 ? 0 : 1;
            System.out.print(task1 [i] + " ");


        }

    }
}
