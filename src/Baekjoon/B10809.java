package Baekjoon;
/**
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다.
 * 각각의 알파벳에 대해서, 단어에 포함되어 있으면 처음 등장하는 위치를,
 * 포함되어 있지 않으면 -1을 출력
 */

import java.io.*;

public class B10809 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] chars = br.readLine().toCharArray();

    int[] res = new int[26];

    for (int i = 0; i < 26; i++) {
      res[i] = -1;
      for (int j = 0; j < chars.length; j++) {
        if (chars[j] - 'a' == i) {
          res[i] = j;
          break;
        }
      }
    }

    for (int i = 0; i < res.length; i++) {
      System.out.print(res[i] + " ");
    }

  }
}
