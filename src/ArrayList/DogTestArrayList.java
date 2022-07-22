package ArrayList;
import java.util.ArrayList;
public class DogTestArrayList {
    public static void main(String[] args){
    ArrayList<Dog> park = new ArrayList<Dog>();

        park.add(new Dog("흰둥이","말티즈"));
        park.add(new Dog("소녀","골드리트리버"));
        park.add(new Dog("초코","토이푸들"));
        park.add(new Dog("스카","진돗개"));
        park.add(new Dog("숑이","비숑"));


        for(Dog lang : park){
            System.out.println(lang.showDogInfo());
        }
    }
}
