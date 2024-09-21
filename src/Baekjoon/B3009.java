package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램
 * 세 점의 좌표가 한 줄에 하나씩 주어진다.
 * 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수
 * 직사각형의 네번째 점의 좌표를 출력
 * ex) 5 5 / 5 7 / 7 5 > 7 7
 *     30 20 / 10 10 / 10 20 > 30 10
 */
public class B3009 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> xList = new ArrayList<>();
    ArrayList<Integer> yList = new ArrayList<>();
    int resX = 0;
    int resY = 0;

    for (int i = 0; i < 3; i++) {
      xList.add(sc.nextInt());
      yList.add(sc.nextInt());
    }

    Collections.sort(xList);
    Collections.sort(yList);

    if (xList.get(0).equals(xList.get(1))){
      resX = xList.get(2);
    } else {
      resX = xList.get(0);
    }
    if (yList.get(0).equals(yList.get(1))){
      resY = yList.get(2);
    } else {
      resY = yList.get(0);
    }

    System.out.println(resX + " " + resY);
  }
}
