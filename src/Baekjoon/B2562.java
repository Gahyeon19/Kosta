package Baekjoon;

import java.util.Scanner;

public class B2562 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//    String[] s = sc.next().split("\n");
    int max = 0;
    int count = 0;
    int a;
    for (int i = 0; i < 9; i++) {
      a = sc.nextInt();
      max = Math.max(max, a);
      if (max == a){
        count = i + 1;
      }
    }

    System.out.printf("%d\n%d", max, count);
  }
}
