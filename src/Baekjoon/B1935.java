package Baekjoon;
/**
 * 첫째줄에 피연산자의 개수
 * 둘째줄에 후위표기식
 * 셋째 줄부터 N+2번째줄까지는 각 피연산자에 대응하는 값
 * 계산 결과를 소숫점 둘째 자리까지 출력
 * ex) 5
 *     ABC*+DE/-
 *     1
 *     2
 *     3
 *     4
 *     5
 *     >> 6.20
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//후위표기식
public class B1935 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    Stack<Double> results = new Stack<>();

    int n = Integer.parseInt(st.nextToken());
    char[] postfix = br.readLine().toCharArray();  //후위표기식 담는 array
    int[] operands = new int[n]; //피연산자 담는 array
    for (int i = 0; i < n; i++) {
      operands[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 0; i < postfix.length; i++) {
      if (Character.isAlphabetic(postfix[i])){   //알파벳이면
        int index = postfix[i] - 'A';
        results.push((double) operands[index]);
      } else {   //연산자면
        //피연산자 하나씩 pop해서 계산해서 다시 넣기
        Double num1 = results.pop();
        Double num2 = results.pop();
        switch (postfix[i]){
          case '*' : results.push(num2 * num1); break;
          case '/' : results.push(num2 / num1); break;
          case '+' : results.push(num2 + num1); break;
          case '-' : results.push(num2 - num1); break;
        }
      }
    }

    System.out.printf("%.2f", results.pop());
  }
}
