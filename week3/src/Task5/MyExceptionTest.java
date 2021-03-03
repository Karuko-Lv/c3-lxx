package Task5;

/**
 * @author LXX
 * @date 2021/3/2-20:41
 */
public class MyExceptionTest {
    public static void main(String[] args) {
        try{
            new MyException().throwException();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
