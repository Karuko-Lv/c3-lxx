package Task5.Exer;

import javax.management.RuntimeErrorException;

/**
 * @author LXX
 * @date 2021/3/2-20:50
 */
public class ReturnExceptionDemo {
    static void methodA(){
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        }finally{
            System.out.println("用A方法的finally");
        }
    }
    static void methodB(){
        try{
            System.out.println("进入方法B");
            return;
        }finally{
            System.out.println("用B方法的finally");
        }
    }

    public static void main(String[] args) {
        try{
            methodA();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        methodB();
    }
    /*
    *
    * 运行结果：
    * 进入方法A
    * 用A方法的finally
    * 制造异常
    * 进入方法B
    * 用B方法的finally
    *
    * 值得思考的点：
    * 先有39行再有第40行 ！！！体会其实也很简单 一个方法先进行完才能有之后的语句*/
}
