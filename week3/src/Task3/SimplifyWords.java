package Task3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author LXX
 * @date 2021/2/22-20:38
 */
/*
* 知识点：set接口去重*/
public class SimplifyWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Set<Character> set = new HashSet<Character>();//java的Character类   HashSet去重
        //TODO：HashSet去重原理
        for (int i= 0;i<str.length();i++){//数组是length 字符串是length（）---why??
            //TODO:why 上一行
            set.add(str.charAt(i));
        }
        System.out.println(set);
    }
}
