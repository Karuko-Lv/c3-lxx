package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 题目：
 * 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = target ？找出所有满足条件  且  不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 *
 * @author LXX
 * @date 2021/2/15-19:28
 */
public class ThreeSum1 {//Java类名不能以数字开头

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入n值：");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("请输入原数组：");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("请输入目标值：");
        int target = in.nextInt();
        List<List<Integer>> res = threeSum(nums, target);//threeSum前面不加static不行-->就是说静态方法里面不能调用非静态方法
        System.out.println(res);
    }

    static List<List<Integer>> res = new ArrayList();//看题目中给的实例可以选择需要用到的List数组的元素类型--泛型

    public static List<List<Integer>> threeSum(int[] nums, int target) {//方法名第一个字母小写，类名第一个字母大写
        /*思路：
         * 知识点1：List遍历---List接口是Collection的子接口
         * */
        Arrays.sort(nums);//将nums数组按照升序排序
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            /*这道题目可以和在网上看到的三数之和等于0进行一下对比
             * 等于0为了简化代码写了一个如果nums数组中的第一个元素大于0就直接break跳出循环
             * 但是我们要知道的是
             * 由于target可能为负数
             * 所以不能够因为第一个元素大于target就跳出循环*/
            if (i > 0 && nums[i] == nums[i - 1]) {//i>0是为了确保i-1有意义
                continue;
            }//这里不能是nums[i] == num[i+1]
            int firstNum = nums[i];//要先去重！！！我没有想的到一点
//            target -= firstNum;//跟新target
            int target2 = target - firstNum;
            int l = i + 1, r = len - 1;
            while (l < r) {
                List<Integer> list = new ArrayList();
                if (nums[l] + nums[r] == target2) {//数组中剩余部分的最大的和最小的加起来了
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);

                    res.add(list);
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;//用if只能执行一次
                    l++;
                    r--;//进行下一轮循环

                } else if (l < r && nums[l] + nums[r] > target2) r--;
                else l++;

//                while(l<r&&nums[l]+nums[r]>target)r--;
//                while (l<r&&nums[r]+nums[l]<target) l++;
                /*
                 * 上面两行代码错误
                 * 错误原因其实也受到了从网上看到的代码的影响
                 * 其次没有去重！！！*/
            }
        }
        return res;
    }
    /*关于去重的复盘：
    * 我的疑问是为什么-1-12可以行的通呢
    * 答案见51行注解！！！*/
}