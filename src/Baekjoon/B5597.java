package Baekjoon;
/**
 * 30명의 학생들이 있다.
 * 과제를 28명이 제출하고 2명이 제출하지 않았다.
 * 제출 안한 2명의 출석번호를 구하는 프로그램
 * (제출자 28명의 출석번호는 한 줄에 하나씩 입력된다.)
 */

import java.util.Scanner;

public class B5597 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    int[] students = new int[30];
    for (int i = 0; i < students.length; i++) {
      students[i] = i + 1;
    }

    for (int i = 0; i < 28; i++) {
      n = sc.nextInt();
      for (int j = 0; j < students.length; j++) {
        if (n == students[j]){
          students[j] = 0;
        }
      }
    }

    for (int i = 0; i < students.length; i++) {
      if (students[i] != 0) {
        System.out.println(students[i]);
      }
    }
  }
}
