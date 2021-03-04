package Task4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

/**
 * @author LXX
 * @date 2021/3/4-22:01
 */
public class FindKMin {
    /*
    * 找到第k小的数
    * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组的数的个数：");
        int num = in.nextInt();
        System.out.println("请依次输入数组元素值：");
        int[] nums = new int[num];
        for (int i = 0; i < num ;i++ ){
            nums[i]=in.nextInt();
        }
        System.out.println("现在将为你找数组中第k小的数,请输入k值：");
        int k = in.nextInt();
//        do{
//            System.out.println("输入有误！请重新输入k值：");
//            k = in.nextInt();
//        }while(k>num+1);
        while(k>num+1){
            System.out.println("输入有误！请重新输入k值：");
//            k = in.nextInt();
        }
        System.out.println("该数组中第k小的数："+ findKMin(nums,k));//总是喜欢忘了写输出。。。
    }
    public static int findKMin(int[] nums,int k){
        Arrays.sort(nums);
//        for (int i : nums){
//            while(i==k-1){
//                return nums[i]
//            }
//        }
//        !!!!这里的i不是nums[i]而是nums[]中的值
        int i = 0;
        for(; i < nums.length ; i++){
            /*
            * length针对数组 是数组的属性
            * length（）针对字符串 是字符串类的方法
            * size()针对泛型集合 是集合类的方法
            * */
            if(i==k-1){
                break;
            }
        }
        return nums[i];
    }
}
