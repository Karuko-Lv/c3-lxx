import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/1/23-20:53
 */
public class Task5 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        circle.setRadius(radius);
        System.out.println("the area is" + circle.area());
        System.out.println("the perimeter is" + circle.perimeter());
    }
}
class Circle{
    private double radius;
    private double pi = 3.14;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return radius*radius*pi;
    }
    public double perimeter(){
        return radius*2*pi;
    }
}
