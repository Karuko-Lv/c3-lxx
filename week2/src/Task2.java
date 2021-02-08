import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/2/7-21:14
 * 算法题：
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 “”。
 */
/*
知识点：字符串、数组----×和我本人一开始理解的不太一样，我当成了C语言中的字符串了
思路：
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.print("输入您想比较的字符串个数：");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] strings = new String[num];
        System.out.print("输入您想比较的字符串：");
        for(int i = 0; i < num; i++){
            strings[i] = in.next();//TODO:不用nextLine（）->why?????
        }
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] strs){
        if(strs.length==0){//写代码严谨性的体现get√
            return "";
        }
        String temp = strs[0];
        for(int i = 0;i<strs.length;i++){
            int j = 0;//为了后面substring用
            for(;j<temp.length()&&j<strs[i].length();j++){
                if(temp.charAt(j)!=strs[i].charAt(j)){//String类的新方法charAt()  get√
                    break;
                }
            }
            temp = temp.substring(0,j);//新知识get√
        }
        if(temp.length() == 0){
            System.out.println("输入不存在公共前缀");
        }
        return temp;
    }
    //TODO:另一种方法
}

