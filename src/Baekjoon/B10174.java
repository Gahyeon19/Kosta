package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
//펠린드롬 검사
public class B10174 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int k = Integer.parseInt(br.readLine());
    for (int i = 0; i < k; i++) {
      String str = br.readLine().toLowerCase();
      Deque<Character> deque = new ArrayDeque<>();

      for (int j = 0; j < str.length(); j++) {
        deque.offer(str.charAt(j));
      }

      boolean ispal = true;
      for (int j = 0; j < str.length() / 2; j++) {
        if (!deque.poll().equals(deque.pollLast())){
          sb.append("No").append("\n");
          ispal = false;
          break;
        }
      }
      if (ispal){
        sb.append("Yes").append("\n");
      }
    }
    System.out.println(sb.toString());
  }
}
