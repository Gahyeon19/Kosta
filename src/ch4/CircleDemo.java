package ch4;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.setRadius(10.4);
    c.show(c.getRadius(), c.findArea());

    Circle myC = new Circle();
    myC.setRadius(8.3);
    myC.show(myC.getRadius(), myC.findArea());

    Circle yourC = new Circle();
    yourC.setRadius(7.6);
    yourC.show(yourC.getRadius(), yourC.findArea());
  }
}

class Circle{
  private double radius;
  public double getRadius(){
    return radius;
  }
  public void setRadius(double r){
    this.radius = r;
  }
  double findArea(){
    return 3.14 * radius * radius;
  }
  void show(double x, double y){
    System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
  }
}