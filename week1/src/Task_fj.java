/**
 * @author LXX
 * @date 2021/1/26-16:35
 */

import java.util.Scanner;

/**
 * 请编码实现动物世界的继承关系∶
 * 动物( Animal )具有属性：身高、体重；具有行为︰吃( eat )﹑睡觉( sleep )
 * 动物包括︰兔子(Rabbit )、老虎( Tiger )
 * 这些动物吃的行为各不相同（兔子吃草，老虎吃肉）但睡觉的行为是一致的。
 */
public class Task_fj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入兔子的身高(cm):");
        double h1 = in.nextDouble();
        System.out.print("请输入兔子的体重(kg):");
        double w1 = in.nextDouble();
        System.out.print("请输入老虎的身高(cm):");
        double h2 = in.nextDouble();
        System.out.print("请输入老虎的体重(kg):");
        double w2 = in.nextDouble();
        Rabbit rabbit = new Rabbit(h1, w1);
        Tiger tiger = new Tiger(h2, w2);
        System.out.println("兔子的身高是：" + rabbit.getHeight());
        System.out.println("老虎的身高是：" + tiger.getHeight());
        System.out.println("兔子的体重是：" + rabbit.getWeight());
        System.out.println("老虎的体重是：" + tiger.getWeight());
        rabbit.eat();
        rabbit.sleep();
        tiger.eat();
        tiger.sleep();
    }

}
class Animal{
    private double height;
    private double weight;

    public Animal(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void eat(){
        System.out.println("我什么都吃啦啦啦");
    }
    public void sleep(){
        System.out.println("我一天睡到晚哈哈哈");
    }
}
class Rabbit extends Animal{
    public Rabbit(double height, double weight) {
        super(height, weight);
    }


    @Override
    public void eat() {
        System.out.println("娃是小兔只，娃喜欢吃福楼8~");
    }

    @Override
    public void sleep() {
        System.out.println("娃是小兔只，娃喜欢蹦蹦跳跳！娃睡的hin少！");
    }
}
class Tiger extends Animal{
    public Tiger(double height, double weight) {
        super(height, weight);
    }


    @Override
    public void eat() {
        System.out.println("偶是大老福！偶喜欢吃肉肉，像兔兔！！！虽然兔兔很可爱但兔兔也很yammy嗷嗷嗷~");
    }

    @Override
    public void sleep() {
        System.out.println("偶是大老福！偶也不冬眠！！！恰肉肉！！！");
    }
}
