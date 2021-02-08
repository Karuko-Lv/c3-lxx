package Task7;

/**
 * @author LXX
 * @date 2021/2/8-21:58
 */
public abstract class Poultry {
    private String name;//动物种类
    private String showSymptom;//症状
    private int age;
    private String illness;//病因

    public Poultry() {
    }

    public Poultry(String name, String showSymptom, int age, String illness) {
        this.name = name;
        this.showSymptom = showSymptom;
        this.age = age;
        this.illness = illness;
    }
    abstract void showSymptom();
    void showMsg(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShowSymptom() {
        return showSymptom;
    }

    public void setShowSymptom(String showSymptom) {
        this.showSymptom = showSymptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
