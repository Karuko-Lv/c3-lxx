/**
 * @author LXX
 * @date 2021/1/23-21:38
 */

import java.util.Scanner;

/**
 * 声明并测试一个复数类，其中包括 add()、reduce()、multiply()三种方法，分别实现两
 * 个复数的相加、相减、相乘，然后输出计算的结果。
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input1 = in.nextLine().split(" ");
        String[] input2 = in.nextLine().split(" ");
        ComplexNumber complexNumber1 = new ComplexNumber(Integer.parseInt(input1[0]), Integer.parseInt(input1[1]));
        ComplexNumber complexNumber2= new ComplexNumber(Integer.parseInt(input2[0]), Integer.parseInt(input2[1]));
        System.out.println("两复数相加的结果为：" + complexNumber1.add(complexNumber2));
        System.out.println("两复数相减的结果为：" + complexNumber1.reduce(complexNumber2));
        System.out.println("两复数相乘的结果为：" + complexNumber1.multiply(complexNumber2));
    }
}
class ComplexNumber{
    private int x;//实部
    private int y;//虚部

    public ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ComplexNumber add(ComplexNumber complexNumber){
        return new ComplexNumber(x + complexNumber.getX(),y + complexNumber.getY());
    }

    public ComplexNumber reduce(ComplexNumber complexNumber){
        return new ComplexNumber(x - complexNumber.getX(),y - complexNumber.getY());
    }

    public ComplexNumber multiply(ComplexNumber complexNumber){
        return new ComplexNumber((x * complexNumber.getX()) - (y * complexNumber.getY()),
                (y * complexNumber.getX()) + (x * complexNumber.getY()));
    }

    @Override
    public String toString() {
        return x + "+" + y +"i";
    }
}
