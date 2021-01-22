import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/1/22-22:48
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("输入体重(Kg):");
        Scanner in = new Scanner(System.in);
        double weight = in.nextDouble();
        System.out.println("输入身高(m):");
        double height = in.nextDouble();
        BMI(weight,height);
    }
    public static void BMI(double weight,double height){
        double BMI = weight/(height*height);
        if(BMI < 18.5){
            System.out.println("过轻");
        }else if(BMI < 25){
            System.out.println("正常");
        }else if(BMI < 28){
            System.out.println("过重");
        }else if(BMI < 32){
            System.out.println("肥胖");
        }else{
            System.out.println("非常肥胖");
        }
    }
}