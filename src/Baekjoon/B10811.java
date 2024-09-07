package Baekjoon;
/**
 * 바구니 뒤집기
 */

import java.io.*;
import java.util.StringTokenizer;

public class B10811 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine(), " ");

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = i + 1;
    }

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int ab = b - a;
      for (int j = 0; j < ab/2 + 1; j++) {
        int temp = arr[a-1];
        arr[a-1] = arr[b-1];
        arr[b-1] = temp;
        a++;
        b--;
//        System.out.println(Arrays.toString(arr));
      }
    }

    for (int i : arr) {
      System.out.print(i + " ");
    }

  }
}
