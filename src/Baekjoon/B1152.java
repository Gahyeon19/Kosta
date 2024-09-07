package Baekjoon;

import java.io.*;

public class B1152 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    String[] arr = str.split(" ");
    int n = arr.length;

    if (arr[0].isBlank()){
      n--;
    }

    System.out.println(n);

    bw.flush();
    bw.close();
    br.close();
  }
}
