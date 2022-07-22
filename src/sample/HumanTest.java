package sample;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    public static void main(String... args) {
        Human man1 = new Man("테스트", 10);
        Human man2 = new Woman("테스트", 10);

        System.out.println(man1.toString());
        System.out.println(man2.toString());
    }
}