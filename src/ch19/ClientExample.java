package ch19;

import java.io.IOException;
import java.net.Socket;

public class ClientExample {
  public static void main(String[] args) {
    try {
      Socket socket = new Socket("local host", 50001);
      System.out.println("[클라이언트] 연결 성공");

      socket.close();
      System.out.println("[클라이언트] 연결 끊음");
    } catch (IOException e) {
      //IP 또는 Port 번호가 존재하지 않을 경우
      System.out.println("IOException: " + e.toString());
    }
  }
}
