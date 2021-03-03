package Task5;

/**
 * @author LXX
 * @date 2021/3/2-20:41
 */
public class MyExceptionTest {
    public void regist(int num) throws MyException {
        if(num < 0)
            throw new MyException("人数不能为负值",3);
        else
            System.out.println("登记人数" + num);
    }
    public void manager(){
        try {
            regist(-1);
        } catch (MyException e){
            System.out.println("登记失败因为" );
        }
        System.out.println("本次登记操作结束");
    }

    public static void main(String[] args) {
        MyExceptionTest t = new MyExceptionTest();
        t.manager();
    }
}
