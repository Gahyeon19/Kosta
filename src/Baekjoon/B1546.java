package Baekjoon;

import java.util.Scanner;

public class B1546 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] scores = new int[n];
    int max = scores[0];
    double sum = 0.0;
    double avg = 0.0;

    for (int i = 0; i < n; i++) {
      scores[i] = sc.nextInt();
      max = Math.max(scores[i], max);
    }

    for (int i = 0; i < n; i++) {
      sum += (double) scores[i] / max * 100;
    }

    avg = sum / n;
    System.out.println(avg);
  }
}
