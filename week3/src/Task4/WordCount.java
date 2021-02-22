package Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/2/22-22:16
 */
public class WordCount {//知识点HashMap
    /*
    * 思路:我的奇怪思路是
    * 遍历这个字符串然后一个字母第一次出现作为key其余的都作为value
    * 但是这是什么奇葩想法你得改你的思维方式
    * 在考虑key value时通常都是不一样的东西
    * 这一题就是key是字母
    * value是字母出现的次数
    * 而且HashMap在用的时候泛型是有两种的————很好的印证了第12行那句话*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Map<Character,Integer> map = wordCount(str);
        //map遍历
        for(Character character:map.keySet()){
            System.out.println(character + ":" + map.get(character));
        }
    }
    public static Map<Character,Integer> wordCount(String str){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                int count = map.get(str.charAt(i));//得到（）内key值的value
                map.put(str.charAt(i),count+1);
            }
        }
        return map;
    }

}
