package Task4;

import java.util.Scanner;

/**
 * 猜数字游戏
 * @author LXX
 * @date 2021/2/8-14:21
 */
/*
 *
 */
public class Game {
    //知识点：成员变量:在类体的变量部分中定义的变量,也称为属性
    private int v = 100;

    public static void main(String[] args) {
        System.out.println("欢迎来到猜字游戏，请输入一个数：");
        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
//        if(guess(number)!=0){
//            guess(number);
//        }
        int number;
        do{
            number = in.nextInt();
            if(guess(number)==1){
                System.out.println("猜的有点小，再试一下吧！");
            }else if (guess(number)==-1){
                System.out.println("猜大了哦，再试一下吧！");
            }else{
                System.out.println("恭喜你，猜对了！");
            }
        }while(guess(number)!=0);

    }
    public static int guess(int number){
        //随机数生成
        int random = (int) (Math.random() * 100);
        if(random>number){
            return 1;
        }else if(random<number){
            return -1;
        }else {
            return 0;
        }
    }
}
