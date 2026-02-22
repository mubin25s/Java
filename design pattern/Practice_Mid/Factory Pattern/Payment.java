interface payment{
    void paid ();
}

class Card implements payment{
    public void paid(){
        System.out.println("Paid by Card");
    }
}

class MobileBanking implements payment{
    public void paid(){
        System.out.println("Paid by Mobile Banking");
    }
}

class BankTransfer implements payment{
    public void paid(){
        System.out.println("Paid by Bank Transfer");
    }
}

class PaymentFactory{
    public static payment getPayment(String type){
        if(type.equals("Card")){
            return new Card();
        }else if(type.equals("MobileBanking")){
            return new MobileBanking();
        }else if(type.equals("BankTransfer")){
            return new BankTransfer();
        }else{
            return null;
        }
    }
}

public class Payment {
    public static void main(String[] args) {
        payment p = PaymentFactory.getPayment("Card");
        p.paid();
    }
}