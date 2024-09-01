package Baekjoon;

import java.util.Scanner;

public class B10807 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String[] s;
    int n = Integer.parseInt(sc.nextLine());
    s = sc.nextLine().split(" ");
    int x = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < n; i++) {
      if (Integer.parseInt(s[i]) == x){
        count++;
      }
    }
    System.out.println(count);
  }
}
