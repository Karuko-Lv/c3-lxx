package Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/2/26-8:12
 */
public class FindDiffCharWrongOne {
    /*
    * 思路：因为输入字符串的长度不知道，而数组不利于拓展，所以我想用集合来存放字符串中的各个字符
    * 因为要找到第一个不同字符，所以说把我的考虑是用Map key记录字母 value记录字母出现的次数
    * 然后value=1的第一个就是要找的那个
    * 再用字符串函数的功能返回这个字母 也就是这个key的位置*/
    /*这样这道题和上周的Task4思路就差不多了*/
    /*
    * 不能用HashMap因为它是无序的*/
    public static Map<Character, Integer> wordCount(String str){
        Map<Character, Integer> map = new HashMap<Character, Integer>();//不用用到LinkedHashMap 因为没必要 此处不用迭代
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
