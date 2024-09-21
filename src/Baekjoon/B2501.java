package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6의 약수는 1,2,3,6 총 네개
 * 두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수 출력하는 프로그램
 * N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0 출력
 */
public class B2501 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<Integer> res = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      if (n % i == 0){
        res.add(i);
      }
    }

//    for (Integer re : res) {
//      System.out.println(re);
//    }

    if (k > res.size()){
      System.out.println(0);
    } else {
      System.out.println(res.get(k - 1));
    }
  }
}
