package sample;

/**
 * 인간
 */
public abstract class Human {

    public enum GENDER {
        MAN, WOMEN
    };

    /**
     * 이름
     */
    private String name;

    /**
     * 나이
     */
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public abstract GENDER getGender();
}
