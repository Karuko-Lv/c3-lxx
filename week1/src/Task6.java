import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nums[] = new int[5];
        for(int i=0;i<5;i++)
        {
            nums[i]=s.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i;j>=0;j--)
            {
                if(nums[j]==0)
                {
                    int t=nums[j];
                    nums [j]=nums [j+1];
                    nums[j+1]=t;

                }
            }
        }
    }
}
