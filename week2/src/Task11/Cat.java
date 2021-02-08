package Task11;

/**
 * @author LXX
 * @date 2021/2/8-22:51
 */
public class Cat implements Pet{
    private int age;
    private String name;

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
