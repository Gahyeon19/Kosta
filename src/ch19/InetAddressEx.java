package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
  public static void main(String[] args) {
    try {
      InetAddress local = InetAddress.getLocalHost();
      System.out.println("내 컴퓨터 주소 : " + local.getHostAddress());

      InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
      for (InetAddress inetAddress : iaArr) {
        System.out.println("www.naver.com IP 주소 : " + inetAddress.getHostAddress());
      }
      //www.naver.com IP 주소 : 223.130.192.248
      //www.naver.com IP 주소 : 223.130.200.219
      //www.naver.com IP 주소 : 223.130.200.236
      //www.naver.com IP 주소 : 223.130.192.247

    } catch (UnknownHostException e){
      e.printStackTrace();
    }
  }
}
