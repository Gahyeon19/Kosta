package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 스택을 이용한 괄호 문자열 판별
 * ex) (())()) > NO
 *     (( > NO
 *     )) > NO
 *     ())(() > NO
 *     ()()()()(()()())() > YES
 *     (()())((())) > YES
 */
public class B9012 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int tc = Integer.parseInt(bf.readLine());
    T : for (int i = 0; i < tc; i++) {
      char[] res = bf.readLine().toCharArray();
      Stack<Character> stack = new Stack<>();

      for (char c : res) {
        //여는 괄호
        if (c == '('){
          stack.push(c);
        } else {
          //닫는 괄호
          if (stack.isEmpty()) {
            sb.append("NO").append("\n");
            continue T;
          }
          stack.pop();
        }
      }
      sb.append(stack.isEmpty()?"YES":"NO").append("\n");
    }
    System.out.println(sb.toString());
  }
}