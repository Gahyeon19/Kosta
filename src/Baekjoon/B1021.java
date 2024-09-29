package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
//회전하는 큐
public class B1021 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    Deque<Integer> deque = new ArrayDeque<>();
    Deque<Integer> deque1 = new ArrayDeque<>();

    int n = Integer.parseInt(st.nextToken());   //큐의 크기 n
    int m = Integer.parseInt(st.nextToken());   //뽑아내려고 하는 수의 개수 m

    for (int i = 1; i <= n; i++) {
      deque.offer(i);
      deque1.offer(i);
    }

    st = new StringTokenizer(br.readLine());
    int[] arr = new int[m];
    for (int i = 0; i < m; i++) {
      arr[i] = Integer.parseInt(st.nextToken());  //뽑아내려는 수의 위치(= index + 1)
    }

    int count = 0;
    for (int i = 0; i < m; i++) {
      int num = arr[i];
      int idx = 1;
      for (int j = 0; j < deque1.size(); j++) {
        if (num == deque1.getFirst()) {
          deque1.poll();
          break;
        } else {
          deque1.addLast(deque1.poll());
          idx++;
        }
      }
      for (int j = 0; j < deque.size(); j++) {
        if (num == deque.getFirst()){
          deque.poll();
//          System.out.println("After poll: " + Arrays.toString(deque.toArray()));

          break;
        } else {
          if (idx <= Math.ceil((double) deque.size() / 2)) {
            //왼쪽으로 한 칸 이동 (a1, ..., ak >> a2, ..., ak, a1)
            deque.addLast(deque.poll());
//            System.out.println("LEFT: "+ Arrays.toString(deque.toArray()));
            count++;

          } else {
            //오른쪽으로 한 칸 이동 (a1, ..., ak >> ak, a1, ..., ak-1)
            deque.addFirst(deque.pollLast());
//            System.out.println("RIGHT: "+Arrays.toString(deque.toArray()));
            count++;
          }
        }
      }
    }

    System.out.println(count);
  }
}
