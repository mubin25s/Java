package Design_Pattern.Practice_Mid.Factory_Pattern.Payment;

public class PaymentFactory{
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
