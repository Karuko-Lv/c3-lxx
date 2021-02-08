package Task8;

/**
 * @author LXX
 * @date 2021/2/8-22:14
 */
public class C extends B{
    private int numc = 30;

    @Override
    void showA() {
        System.out.println("A类中numa:"+getNuma());
    }

    @Override
    void showB() {
        System.out.println("B类中numb:"+getNumb());
    }

    public int getNumc() {
        return numc;
    }

    public void setNumc(int numc) {
        this.numc = numc;
    }
    void showC(){
        System.out.println("C类中numc:"+getNumc());
    }
}
