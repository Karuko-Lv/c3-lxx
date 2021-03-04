package Task6;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author LXX
 * @date 2021/3/4-23:24
 */
/*
* 题目：给定一个只包括"(" ")" "{" "}" "[" "]"的字符串s,判断是否有效*/
public class IsValid {
    /*知识盲区
    * 栈
    * */
    public static void main(String[] args) {
        Stack<Character> characters = new Stack<>();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for (int i = 0; i<s.length();i++){
            if(characters.isEmpty()){
                characters.push(s.charAt(i));
            }else{
                if((characters.peek() == '('&&s.charAt(i) == ')')||(characters.peek() == '{'&&s.charAt(i) == '}')||(characters.peek() == '['&&s.charAt(i + 1) == ']')){
                    characters.pop();
                }else{
                    characters.push(s.charAt(i));
                }
            }
        }
        if(characters.isEmpty())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
