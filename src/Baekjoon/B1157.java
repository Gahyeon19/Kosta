package Baekjoon;
/*
가장 많이 사용된 알파벳 출력하기
여러 개 존재하는 경우에는 ? 출력
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class B1157 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] chars = br.readLine().toUpperCase().toCharArray();
    ArrayList<Character> alph = new ArrayList<>();
    int count = 0;    //사용된 횟수
    char ch;          //많이 사용된 알파벳 저장하는 변수
    int max = 0;

    for (int j = 0; j < chars.length; j++) {
      alph.add(chars[j]);
    }

    ArrayList<Character> res = new ArrayList<>();   //가장 많이 사용된 알파벳 저장하는 배열
    Set<Character> set = new HashSet<>(alph);
    for (Character c : set) {
      count = Collections.frequency(alph, c);
      max = Math.max(max, count);
      if (max == count) {
        res.add(c);
      }
      System.out.println("max : " + max);
      System.out.println(c + " : " + count + " ");
    }
    if (res.size() >= 2) {
      ch = '?';
    }
    else {
      ch = res.get(0);
    }
    System.out.println("max : " + max);
    System.out.println("res : " + ch);



  }
}
