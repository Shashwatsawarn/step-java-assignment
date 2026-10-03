import java.util.*;
public class W8P1PaymentSystem {
    static abstract class Payment {
        double amount; String type;
        Payment(double a, String t) { amount=a; type=t; }
        abstract double finalAmount();
    }
    static class Card extends Payment {
        Card(double a){super(a,"CARD");} double finalAmount(){return amount*1.02;}
    }
    static class Wallet extends Payment {
        Wallet(double a){super(a,"WALLET");} double finalAmount(){return amount*1.01;}
    }
    static class BankTransfer extends Payment {
        BankTransfer(double a){super(a,"BANKTRANSFER");} double finalAmount(){return amount;}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); double total=0;
        for(int i=0;i<n;i++){
            String t=sc.next(); double a=sc.nextDouble(); Payment p;
            if(t.equals("CARD")) p=new Card(a);
            else if(t.equals("WALLET")) p=new Wallet(a);
            else p=new BankTransfer(a);
            double x=p.finalAmount(); total+=x;
            System.out.printf("%s: %.2f%n",p.type,x);
        }
        System.out.printf("Total: %.2f%n",total);
    }
}
