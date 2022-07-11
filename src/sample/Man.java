package sample;

import java.util.Locale;

public class Man extends Human {

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public GENDER getGender() {
        return GENDER.MAN;
    }

    @Override
    public String toString() {
        return String.format("name:%s age:%d gender:%s", getName(), getAge(), getGender().name().toLowerCase(Locale.ROOT));
    }
}
