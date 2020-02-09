package lesson2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Task2 {
    public static void main(String[] args) {
        int task2 [] = new int[8];
  //      Task2 [0] = 0;
  //      Task2 [1] = 3;
  //      Task2 [2] = 6;
 //       Task2 [3] = 9;
  //      Task2 [4] = 12;
  //      Task2 [5] = 15;
  //      Task2 [6] = 18;
  //      Task2 [7] = 21;
  //      for (int i = 0; i < task2.length; i++) {
  //          System.out.println(Task2 [i]);
  //      }
        for (int i = 1, j = 0; i < task2.length; i++) task2[i] = j += 3;
        for (int x : task2) System.out.print(x + " ");
    }
}
