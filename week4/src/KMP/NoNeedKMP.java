package KMP;

import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/2/25-21:12
 */
/*
* 字符串匹配（算法题）
* */
public class NoNeedKMP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string =  in.next();
        String pattern = in.next();
        System.out.println( string.indexOf(pattern));
        //str1.indexOf(str2):返回str2在str1中第一次出现的索引位置（从0开始）
    }
}
