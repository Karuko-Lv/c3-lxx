import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/2/1-16:40
 */
/*
算法题：给定一个 n × n 的二维矩阵matrix表示一个图像。
将图像顺时针旋转 90 度。
 */
/*
思路分析:(特例找规律）
输入:123在二维数组的位置分别为[0][0],[0][1],[0][2]
输出:123在二维数组的位置分别为[0][2],[1][2],[2][2]
数组遍历外循环i=0时，temp[j][3-0-i]=matrix[i][j]，j取值0~2
同理：
数组遍历外循环i=1时，temp[j][3-0-i]=matrix[i][j]，j取值0~2
数组遍历外循环i=2时，temp[j][3-0-i]=matrix[i][j]，j取值0~2
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.print("请输入方阵的行数:");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[][] matrix = new int[len][len];
        System.out.println("请您输入你想旋转的方阵：");
        for(int i = 0;i < len;i++){//知识点回顾：前面是行后面是列  “前行后列”
            for(int j=0;j<len;j++){
                int temp = in.nextInt();
                matrix[i][j]=temp;
            }
        }
        matrix = reverse(matrix);
       //System.out.println('['+Arrays.toString(matrix)+']');   错误结果：[[[I@32e6e9c3, [I@5056dfcb, [I@6574b225]]
        System.out.print("[");
        for(int i = 0;i < len;i++){
            System.out.print(Arrays.toString(matrix[i]));//新知识点：数组输出
        }
        System.out.println("]");
    }
    public static int[][] reverse(int[][] matrix){
        int len = matrix.length;
        int[][] temp = new int[len][len];
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                temp[j][len - i - 1] = matrix[i][j];
            }
        }
        return temp;
    }
}
