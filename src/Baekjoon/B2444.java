package Baekjoon;
//별 찍기

import java.io.*;

public class B2444 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < 2 * n - 1; i = i + 2) {
      for (int k = 2 * n - 2; k > i; k = k - 2) {
        bw.write(" ");
      }
      for (int j = 0; j <= i; j++) {
        bw.write("*");
      }
      bw.write("\n");
    }

    for (int i = 1; i < 2 * n - 1; i = i + 2) {
      for (int j = 0; j <= i; j = j + 2) {
        bw.write(" ");
      }
      for (int k = i; k < 2 * n - 2; k++) {
        bw.write("*");
      }
      bw.write("\n");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}
