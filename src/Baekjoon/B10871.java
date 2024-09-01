package Baekjoon;

import java.util.Scanner;

public class B10871 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] s;

    s = sc.nextLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int x = Integer.parseInt(s[1]);

    s = sc.nextLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (Integer.parseInt(s[i]) < x){
        System.out.print(s[i] + " ");
      }
    }
  }
}
