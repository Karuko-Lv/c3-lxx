package Task7;

/**
 * @author LXX
 * @date 2021/2/8-22:04
 */
public class Duck extends Poultry {

    @Override
    void showSymptom() {
        System.out.println("动物种类：" + getName() + "," + "年龄：" + getAge() + "岁");
        System.out.println("入院原因：" + getShowSymptom());
        System.out.println("症状为：" + getIllness());
    }

    public Duck(String name, String showSymptom, int age, String illness) {
        super(name, showSymptom, age, illness);
    }
}
