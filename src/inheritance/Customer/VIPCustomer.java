package inheritance.Customer;

public class VIPCustomer extends Customer{

    private int agetID; //VIP 고객 상담원 아이디
    double saleRatio; // 할인율

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgetID(){
        return agetID;
    }
}
