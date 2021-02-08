package Task5;

/**
 * @author LXX
 * @date 2021/2/8-21:19
 */
public class People extends Monkey{
    public People(String s) {
        super(s);
    }

    @Override
    public void speak() {
        System.out.println("小样的，不错嘛！会说话了！");
    }
    public void think(){
        System.out.println("别说话！认真思考！");
    }
}
