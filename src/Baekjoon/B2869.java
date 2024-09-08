package Baekjoon;
/*
하루동안 a만큼 올라갔다가 b만큼 떨어짐
v까지 도달하기 위해 걸린 날은?
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] ints = new int[3];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 3; i++) {
      ints[i] = Integer.parseInt(st.nextToken());
      System.out.print(ints[i] + " , ");
    }

    int res = 0;   //올라간 높이
    int count = 0;

    while (res != ints[2]){
      res += ints[0];
      count ++;
      if (res >= ints[2]){
        break;
      }
      res -= ints[1];
    }
    System.out.println(count);
  }
}
