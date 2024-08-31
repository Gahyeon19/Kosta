package Baekjoon_3;

/*
      4 7 2     (1)
    * 3 8 5     (2)
--------------
    2 3 6 0     (3)
  3 7 7 6       (4)
1 4 1 6         (5)
--------------
1 8 1 7 2 0     (6)

1,2 위치에 들어갈 세 자리 자연수가 주어짐.
3,4,5,6 위치에 들어갈 값을 구하는 프로그램
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int a, b;
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      bw.write("Case #" + (i + 1) + ": ");
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      bw.write(a + b + "\n");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}
