package Task8;

/**
 * @author LXX
 * @date 2021/2/8-22:13
 */
public abstract class B extends A {
    private int numb = 20;
    abstract void showB();

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }
}
