package Task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/3/4-22:29
 */
public class FindMain {
    public static int findMain(int nums[]){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                int count = map.get(nums[i]);
                map.put(nums[i],count+1);
            }
        }
//        for (Integer i:
//             ) {
//
//        }
        for (Integer i:map.keySet()) {
            if(map.get(i)>nums.length/2){
                return i;
            }
        }
//        for(int j = nums.length/2+1;j<=nums.length;j++){
//            if(map.containsValue(j)){
////                return map.
//            }//不能通過value找到key  只能用遍历了
//        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("输入数组的元素个数：");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("输入数组的元素值：");
        int[] nums = new int[num];
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(findMain(nums));
    }

}
