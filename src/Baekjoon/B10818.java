package Baekjoon;

import java.util.Scanner;

public class B10818 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());
    String[] s = sc.nextLine().split(" ");
    int max = Integer.parseInt(s[0]);
    int min = Integer.parseInt(s[0]);

    for (int i = 0; i < n; i++) {
      min = Math.min(Integer.parseInt(s[i]), min);
    }
    for (int i = 0; i < n; i++) {
      max = Math.max(Integer.parseInt(s[i]), max);
    }

    System.out.printf("%d %d", min, max);
  }

}

