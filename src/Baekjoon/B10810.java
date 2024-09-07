package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * n개의 바구니. 각각의 바구니에는 1번부터 n번까지 번호가 적혀 있다.
 * 1번부터 n번까지 번호가 적혀있는 공을 많이 갖고 있다.
 * 가장 처음 바구니에는 공이 들어있지 않고, 바구니에는 공을 1개만 넣을 수 있다.
 *
 * 앞으로 m번 공을 넣으려고 한다.
 * 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고 정한 바구니에 모두 같은 번호가 적힌 공을 넣는다.
 * 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다.
 * 공을 넣을 바구니는 연속되어 있어야 한다.
 *
 * 공을 어떻게 넣을지가 주어졌을 떄, m번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램
 *
 * 첫째 줄에 n과 m이 주어진다.
 * 둘째 줄에 m개의 줄에 걸쳐 공을 넣는 방법이 주어진다.
 * 각 방법은 세 정수 i j k로 이루어져있으면, i번 바구니부터 j번 바구니까지 k번 번호가 적힌 공을 넣는다는 뜻.
 * ex) 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻.
 *
 */
public class B10810 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = 0;
    }
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      for (int j = a - 1; j < b; j++) {
        arr[j] = c;
      }
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}