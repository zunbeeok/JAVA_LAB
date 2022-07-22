package sample;

import java.util.Locale;

public class Woman extends Human {

    public Woman(String name, int age) {
        super(name, age);
    }

    @Override
    public GENDER getGender() {
        return GENDER.WOMEN;
    }

    @Override
    public String toString() {
        return String.format("name:%s age:%d gender:%s", getName(), getAge(), getGender().name().toLowerCase(Locale.ROOT));
    }
}
