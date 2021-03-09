package Task10;

/**
 * @author LXX
 * @date 2021/3/5-16:46
 */
public class PrintOdd extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<11;i++){
            if(!(i%2==0)){
                System.out.println(Thread.currentThread().getName() +":" + i);
            }
        }
    }
}
