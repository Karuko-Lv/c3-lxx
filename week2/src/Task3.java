import java.util.Scanner;

/**
 * 从字符串中提取数字
 * @author LXX
 * @date 2021/2/8-9:32
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(getNumber(str).toString());
    }
    public static String getNumber(String str){
        str = str.trim();//新知识：去掉字符串两端空格  PS：中间空格不会被去掉
        String str2 = "";
        if(str!=null && !"".equals(str)){
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i)>=48&&str.charAt(i)<=57){
                    str2+=str.charAt(i);
                }
            }
        }
        return str2;
    }

}
