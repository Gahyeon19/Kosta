package Baekjoon;
/**
 * n번 줄을 입력 받고
 * 입력받은 s를 한 문자씩 r번 반복하여 출력
 */

import java.io.*;
import java.util.StringTokenizer;

public class B2675 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    String s;
    int r;
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      r = Integer.parseInt(st.nextToken());
      s = st.nextToken();
      int count = 0;

      for (int j = 0; j < s.length(); j++) {
        for (int k = 0; k < r; k++) {
          System.out.print(s.charAt(count));
        }
        count++;
      }
      System.out.println();
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
