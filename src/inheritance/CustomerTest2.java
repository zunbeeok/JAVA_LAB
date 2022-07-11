package inheritance;

public class CustomerTest2 {
    public static void main(String... args){
        VIPCustomer customerKim = new VIPCustomer(10020,"김유신",1); // 하위 클래스 생성
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        Customer vc = new VIPCustomer(10020,"test",1);

    }
}
