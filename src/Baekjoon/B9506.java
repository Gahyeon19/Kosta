package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * n이 완전수인지 아닌지 판단해주는 프로그램
 * 마지막에는 -1 입력
 * n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력(약수들은 오름차순으로 나열)
 * n이 완전수가 아니라면 "n is NOT perfect."를 출력
 * ex) 6 > 6 = 1 + 2 + 3
 *     12 > 12 is NOT perfect.
 *     28 > 28 = 1 + 2 + 4 + 7 + 14
 */
public class B9506 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    while (true) {
      int n = sc.nextInt();
      ArrayList<Integer> res = new ArrayList<>();
      if (n == -1){
        break;
      }
      for (int i = 1; i < n; i++) {
        if (n % i == 0) {
          res.add(i);
        }
      }
      int perfect = 0;
      for (int i = 0; i < res.size(); i++) {
        perfect += res.get(i);
      }
      if (perfect == n) {
        System.out.print(n + " = ");
        for (int i = 0; i < res.size() - 1; i++) {
          System.out.print(res.get(i) + " + ");
        }
        System.out.print(res.get(res.size() - 1));
        System.out.println();
      } else {
        System.out.println(n + " is NOT perfect.");
      }
    }
  }
}
