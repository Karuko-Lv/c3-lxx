package Task3;

import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/3/3-21:36
 */
public class TurnDecimal {
    /*
    * 思路 小数是一个浮点数
    * 分数可以看成两个部分构成————分子分母 且都是整数
    * 问题可以从如何把浮点数转化成整数下手
    * 其实1.2 --> 12/10比较容易（如果有时候函数可以统计浮点数的有限小数点个数就好了，见下面） 但是答案是最简分数
    * 所以要思考怎么样找两个数的最大公因数*/
    /*
    * 没有
    * 所以得考虑怎么样统计
    * 其实用字符串就可以了！！！！这是一个重要的思想
    * 有时候一个东西不能只看表面
    * 字符串这个东西看上去是存储字母的
    * 但是其实我们都知道数字符号什么的也都是char
    * 就像有些人不能只看表面一样
    * 当然你也不要低估自己的能力或许你和字符串一样，有一天会有别人甚至自己都意想不到的特长*/
//    34.56--> 人： 3456 / 1000
    //最大公因数
    //求出两个数字之间的小值
    public static int max(int a, int b){
        int min = a < b ? a : b;
        for(int i = min;i>1;i--){
            if(a%i==0&&b%i==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
//        String[] arr = new String[2];
//        arr = str.split("\\.");
        String[] split = str.split("\\.");
//        String concat(String str)
        String newStr = split[0].concat(split[1]);
        //字符串转数字
        /*
        * 举例子
        * 3.33-->333/100*/
        int weishu = newStr.length();
        int a = Integer.parseInt(newStr);
//        int b = 10 ^ (weishu - 1);
        /*!!double变int*/
        double pow = Math.pow(10, weishu - 1);
        int b = new Double(pow).intValue();
        int max = max(a,b);
        a = a/max;
        b = b/max;
        System.out.println(a + "/" + b);
    }
}
