package ch19_1;

import java.io.*;
import java.net.Socket;

public class EchoClient {
  public static void main(String[] args) {
    try {
      Socket socket = new Socket("local host", 50001);
      System.out.println("[클라이언트] 연결 성공");

      //------------------------------------------------------------------------------
      //데이터 보내기
      String sendMessage = "나는 자바가 좋아~~";
//      OutputStream os = socket.getOutputStream();
      DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
//      byte[] bytes = sendMessage.getBytes("UTF-8");
//      os.write(bytes);
//      os.flush();
      dos.writeUTF(sendMessage);
      dos.flush();
      System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);

      //데이터 받기
//      InputStream is = socket.getInputStream();
      DataInputStream dis = new DataInputStream(socket.getInputStream());
//      bytes = new byte[1024];
//      int readByteCount = is.read(bytes);
//      String receiveMessage = new String(bytes, 0, readByteCount, "UTF-8");
      String receiveMessage = dis.readUTF();
      System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);

      //------------------------------------------------------------------------------

      socket.close();
      System.out.println("[클라이언트] 연결 끊음");
    } catch (IOException e) {
      //IP 또는 Port 번호가 존재하지 않을 경우
      System.out.println("IOException: " + e.toString());
    }
  }
}
