import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/1/23-13:09
 */
public class Task4 {
    public static void moveZeros(int nums[]){
        int n=0;//相当于定义两个指针
        for (int o=0;o<nums.length;o++){
            if(nums[o]!=0){
                nums[n]=nums[o];
                n++;
            }
        }
        for(;n<nums.length;n++){
            nums[n]=0;
        }
    }
//    public static int[] nums;

    public static void main(String[] args) {
        System.out.println("请输入你想输入的数(每个数之间用逗号隔开):");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] split = s.split(",");
        int[] nums = new int[split.length];
        for(int i = 0;i<nums.length;i++){
            nums[i]=Integer.parseInt(split[i]);
        }
        moveZeros(nums);
//        System.out.println(nums);--->这样子是输出数组首地址值
        System.out.println(Arrays.toString(nums));
    }
}
