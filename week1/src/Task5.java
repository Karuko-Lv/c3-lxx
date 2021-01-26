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
        System.out.printf("the area is %.2f\n" ,circle.area());
        System.out.printf("the perimeter is %.2f" , circle.perimeter());
    }
}
class Circle{
    private double radius;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){ return radius*radius*Math.PI; }
    public double perimeter(){
        return radius*2*Math.PI;
    }
}
