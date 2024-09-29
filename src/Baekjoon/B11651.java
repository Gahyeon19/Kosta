package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//y좌표 순으로 정렬 (같을 시 x좌표 순으로 정렬) - 시간초과 줄이기
public class B11651 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    ArrayList<Points> points = new ArrayList<>();

    int n = Integer.parseInt(st.nextToken());
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      points.add(new Points(x, y));
    }

    Collections.sort(points);

    for (Points point : points) {
      sb.append(point.getX()).append(" ").append(point.getY()).append("\n");
    }
    System.out.println(sb.toString());
  }
}

class Points implements Comparable<Points> {
  private int x, y;

  public Points(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public int compareTo(Points o) {
    //y값 비교
    if (this.y == o.getY()){
      return this.x - o.getX();
    }
    else {
      return this.y - o.getY();
    }
  }
}
