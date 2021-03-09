package Task7;

import java.util.*;

/**
 * @author LXX
 * @date 2021/3/4-23:57
 */
public class SameCharTogether {
    /*
    * */
//    public static void main(String[] args) {
//        System.out.println("输入字符串数组的字符串个数：");
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        String[] strs = new String[num];
//        String[] strs2 = strs;
//        for (String str:strs){
//            char[] chars = new char[100];
//            str.getChars(0,
//                    str.length(),
//                    chars,0
//                    );
//            Arrays.sort(chars);
//            str = String.valueOf(chars);//字符串转字符数组
//        }
//        Map<String, Integer> wordCount = wordCount(strs);
//        wordCount.
//    }
//    public static Map<String, Integer> wordCount(String[] strs){
//        Map<String, Integer> map = new HashMap<>();//不用用到LinkedHashMap 因为没必要 此处不用迭代
//        //遍历字符串中的每一个字符
//        for(int i = 0; i<strs.length;i++){
//            if(!map.containsKey(strs[i])){//这句话里面包括了 map的一个方法和字符串的一个方法
//                map.put(strs[i],1);
//            }else{
//                Integer count = map.get(strs[i]);//得到key的value
//                map.put(strs[i],1+count);
//            }
//        }
//        return map;
//    }
    public static void main(String[] args) {
        System.out.println("输入字符串数组的字符串个数：");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] charNum = new int[num];
        String[] strs = new String[num];
        for(int i = 0; i < num; i++){
            strs[i] = in.next();
        }
        Map<Integer,ArrayList> map = new HashMap<>();
        /*
        * 思路：
        * 把字符串数组和整数数组通过char值（ascii码）*/
        for(int i = 0; i < strs.length ; i++){

            for(int j = 0; j < strs[i].length(); j++){
                charNum[i] += strs[i].charAt(j);
            }
            ArrayList<String> strsList = new ArrayList<>();
            if(!map.containsKey(charNum[i])){

                strsList.add(strs[i]);
                map.put(charNum[i],strsList);
            }else{
                strsList.add(strs[i]);
            }
//            traditionalMethod1(map);
/*
* 314 : [eat]
314 : [eat]
323 : [tan]
314 : [eat]
323 : [tan]
314 : [eat]
323 : [tan]
314 : [eat]
323 : [tan]
311 : [bat]
314 : [eat]
*/
            /*想印刷map的value*/
//            Collection values = map.values();  //获取Map集合的value集合
//            for(Object object:values) {
//                System.out.println("键值:" + object.toString());  //输出键值对象
//            }
            /*
            * 键值:[ate]
                键值:[ate]
                键值:[ate]
                键值:[eee]*/
        }



//        for(int i = 0; i < strs.length; i++){
//            if(!map.containsKey())
//        }
    }
    private static void traditionalMethod1(Map<Integer, ArrayList> maps) {
        Set<Integer> sets = maps.keySet();
        // 取得迭代器遍历出对应的值
        Iterator<Integer> it = sets.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            ArrayList value = maps.get(key);
            System.out.println(key + " : " + value);
        }
    }

}
