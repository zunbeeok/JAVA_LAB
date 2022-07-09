package ArrayList;

public class DogTest {
    public static void main(String[] args){
        Dog[] park = new Dog[5];

        park[0] = new Dog("흰둥이","말티즈");
        park[1] = new Dog("소녀","골드리트리버");
        park[2] = new Dog("초코","토이푸들");
        park[3] = new Dog("스카","진돗개");
        park[4] = new Dog("숑이","비숑");

        for(int i=0; i<park.length; i++){
            System.out.println(park[i].showDogInfo());
        }

        System.out.println("===============================");

        for(Dog lang: park){
            System.out.println(lang.showDogInfo());
        }

    }
}
