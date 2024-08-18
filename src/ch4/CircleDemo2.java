package ch4;

public class CircleDemo2 {
  public static void main(String[] args) {
    Circle2 myCircle = new Circle2(3.0);
    Circle2 yourCircle = new Circle2(7.0);

    System.out.println("만들어진 원의 총 개수 : " + Circle2.numOfCircles);
    System.out.println("원의 개수 : " + yourCircle.numCircles);
  }
}

class Circle2{
  double radius;
  static int numOfCircles = 0;
  int numCircles = 0;

  public Circle2(double radius){
    this.radius = radius;
    numOfCircles++;
    numCircles++;
  }
}
