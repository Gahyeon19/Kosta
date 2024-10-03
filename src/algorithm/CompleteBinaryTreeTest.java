package algorithm;

public class CompleteBinaryTreeTest {
  public static void main(String[] args) {
    /**
     *                송태섭(1)
     *        강백호(2)            정대만(3)
     *   서태웅(4)     채치수(5)
     */
    CompleteBinaryTree<String> tree = new CompleteBinaryTree<String>(5);
    String[] names = {"송태섭", "강백호", "정대만", "서태웅", "채치수"};

    for (String name : names) {
      tree.add(name);
    }

    System.out.println("=====bfs=====");
    tree.bfs();                   //송태섭 강백호 정대만 서태웅 채치수
    System.out.println("\n=====preorder=====");
    tree.dfsByPreOrder(1);    //송태섭 강백호 서태웅 채치수 정대만
    System.out.println("\n=====inorder=====");
    tree.dfsByInOrder(1);     //강백호 서태웅 채치수 송태섭 정대만
    System.out.println("\n=====postorder=====");
    tree.dfsByPostOrder(1);   //강백호 서태웅 채치수 정대만 송태섭
  }
}
