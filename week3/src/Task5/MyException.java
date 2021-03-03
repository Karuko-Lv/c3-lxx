package Task5;

/**
 * @author LXX
 * @date 2021/3/2-20:39
 */
public class MyException extends Exception{
    static final long serialVersionUID = 13465653435L;
    private int id;

    public MyException() {
    }

    public MyException(String message, int id) {
        super(message);
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void throwException() throws MyException {
        //想自定义异常，自定义完了写个方法抛出，然后在try里调用不就行了
        System.out.println("出现了我的异常");
    }


}
