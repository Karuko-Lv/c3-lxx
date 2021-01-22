/**
 * @author LXX
 * @date 2021/1/22-23:44
 */
public class Task2 {
    public static void main(String[] args) {
        int num = getSXHNumber();
        System.out.println("水仙花数共有"+num+"个");
    }
    public static int getSXHNumber(){
        int num = 0;
        for(int i=100;i<1000;i++){
            int i1 = i % 10;//十位   PS不是%100因为%100得到的是后两位
            int i2 = i / 10 % 10;//各位
            int i3 = i/100;//百位
            if (i == i1*i1*i1 + i2*i2*i2 + i3*i3*i3){
                num++;
            }
        }
        return num;
    }
}

