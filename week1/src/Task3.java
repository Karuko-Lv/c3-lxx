import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/1/23-0:04
 */
public class Task3 {
    public static void main(String[] args) {
        //字符串翻转
        Scanner in = new Scanner(System.in);
        System.out.println("翻转之前的字符串：");
        String s = in.nextLine();
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println("翻转之后的字符串" + reverse);
    }
}
