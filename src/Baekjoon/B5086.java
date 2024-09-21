package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램
 * 1. 첫번째 숫자가 두번째 숫자의 약수  > factor
 * 2. 첫번째 숫자가 두번째 숫자의 배수  > multiple
 * 3. 약수와 배수 모두 아니다.        > neither
 * 마지막 줄에는 0이 2개 주어진다.
 *
 */
public class B5086 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true){
      String str = br.readLine();
      String[] arr = str.split(" ");
      int a = Integer.parseInt(arr[0]);
      int b = Integer.parseInt(arr[1]);
      if (a == 0 && b == 0){
        break;
      } else {
        System.out.println(compare(a, b));
      }
    }
  }
  public static String compare(int a, int b){
    String result = "";
    if (a % b == 0){
      result = "multiple";
    } else if (b % a == 0) {
      result = "factor";
    } else {
      result = "neither";
    }
    return result;
  }
}
