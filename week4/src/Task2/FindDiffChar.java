package Task2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/2/26-9:12
 */
public class FindDiffChar {
    /*
    * 思路：因为输入字符串的长度不知道，而数组不利于拓展，所以我想用集合来存放字符串中的各个字符
    * 且题目要求返回位置所以要是有序的集合——List（有序单列集合）又因为不需要插入删除操作
    * 所以使用ArrayList最好
    * 但是这样还是不行，所以我考虑用LinkedHashMap————使得元素看起来是以插入顺序保存的
    * */
    public static Map<Character, Integer> wordCount(String str){
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();//不用用到LinkedHashMap 因为没必要 此处不用迭代
        //遍历字符串中的每一个字符
        for(int i = 0; i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){//这句话里面包括了 map的一个方法和字符串的一个方法
                map.put(str.charAt(i),1);
            }else{
                Integer count = map.get(str.charAt(i));//得到key的value
                map.put(str.charAt(i),1+count);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Map<Character, Integer> map = wordCount(str);
        //遍历是目的，迭代是手段
        Character c = null;
        for(Character character:map.keySet()){
            if(map.get(character)==1){
                c = character;
                break;
            }
//            System.out.println(character + ":" + map.get(character));
        }
        int index = str.indexOf(c);
        System.out.println(index);
    }
}
