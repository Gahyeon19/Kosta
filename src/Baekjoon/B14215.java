package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 세 막대를 이용해서 삼각형을 만드려고 한다.
 * - 각 막대의 길이는 양의 정수
 * - 세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
 * - 삼각형의 둘레를 최대로 해야 한다.
 * a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램
 * ex) 1 2 3 > 5
 *     2 2 2 > 6
 *     1 100 1 > 3
 *     41 64 16 > 113
 */
public class B14215 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> line  = new ArrayList<>();
    int res = 0;

    for (int i = 0; i < 3; i++) {
      line.add(i, sc.nextInt());
    }
    Collections.sort(line);

    if (line.get(0) + line.get(1) <= line.get(2)){
      line.set(2, line.get(0) + line.get(1) - 1);
    }
//    for (Integer i : line) {
//      System.out.println(i);
//    }
    for (int i = 0; i < 3; i++) {
      res += line.get(i);
    }
    System.out.println(res);
  }
}