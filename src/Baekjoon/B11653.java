package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 정수 n이 주어졌을 때, 소인수분해하는 프로그램
 * N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력
 * N이 1인 경우 아무것도 출력하지 않는다.
 */
public class B11653 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> res = new ArrayList<>();

    if (n > 1) {
      for (int i = 2; i <= n; i++) {
        if (n % i == 0){
          res.add(i);
          n = n / i;
          i--;
        }
      }
    }

    for (Integer re : res) {
      System.out.println(re);
    }
  }
}
