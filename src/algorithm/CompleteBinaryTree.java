package algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 *          1
 *      2       3
 *    4   5
 */
public class CompleteBinaryTree<T> {
  private Object[] nodes;
  private int lastIndex;
  private final int SIZE;

  public CompleteBinaryTree(int size) {
    this.SIZE = size;
    this.lastIndex = 0;
    this.nodes = new Object[size + 1];
  }

  public boolean isEmpty() {  //노드가 비었는지
    return lastIndex == 0;
  }

  public boolean isFull() {   //노드가 포화상태인지
    return lastIndex == SIZE;
  }

  public void add (T e) {
    if(isFull()) throw new RuntimeException("트리가 포화상태입니다.");
    nodes[++lastIndex] = e;
  }

  //BFS(Breadth First Search) 너비우선탐색
  public void bfs(){
    if (isEmpty()) return;
    Queue<Integer> queue = new ArrayDeque<>(); //큐를 통해 노드의 탐색 순서 관리, 노드를 탐색사는데 필요한 정보 저장
    queue.offer(1); //루트노드부터

    while (!queue.isEmpty()) { //큐에 탐색대상정보가 있으면 계속 반복
      int cur = queue.poll();   //탐색해야할 노드의 정보(인덱스)

      //노드 탐색 관련된 작업
      System.out.print(nodes[cur] + " ");
      //해당 노드의 자식노드들도 탐색될 수 있도록 관리
      //이진트리이므로 왼쪽자식과 오른쪽자식만 관리

      if(cur * 2 <= lastIndex){   //왼쪽자식
        queue.offer(cur * 2);
      }
      if (cur * 2 + 1 <= lastIndex) {   //오른쪽자식
        queue.offer((cur * 2 + 1));
      }
    }
  }

  //DFS(Depth First Search) 깊이우선탐색
  public void dfsByPreOrder(int cur){   //cur노드를 탐색
    //전위순회
    //노드 탐색 관련된 작업
    System.out.print(nodes[cur] + " ");
    //해당 노드의 자식노드들도 탐색될 수 있도록 관리
    //이진트리이므로 왼쪽자식과 오른쪽자식만 관리

    if(cur * 2 <= lastIndex){   //왼쪽자식
      dfsByPreOrder(cur * 2);
    }
    if (cur * 2 + 1 <= lastIndex) {   //오른쪽자식
      dfsByPreOrder(cur * 2 + 1);
    }
  }

  public void dfsByInOrder(int cur){   //cur노드를 탐색
    //중위순회
    if(cur * 2 <= lastIndex){   //왼쪽자식
      dfsByPreOrder(cur * 2);
    }
    System.out.print(nodes[cur] + " ");
    if (cur * 2 + 1 <= lastIndex) {   //오른쪽자식
      dfsByPreOrder(cur * 2 + 1);
    }
  }

  public void dfsByPostOrder(int cur){   //cur노드를 탐색
    //후위순회
    if(cur * 2 <= lastIndex){   //왼쪽자식
      dfsByPreOrder(cur * 2);
    }
    if (cur * 2 + 1 <= lastIndex) {   //오른쪽자식
      dfsByPreOrder(cur * 2 + 1);
    }
    System.out.print(nodes[cur] + " ");
  }
}
